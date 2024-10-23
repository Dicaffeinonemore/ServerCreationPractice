package org.zerock.tourist.member.controller;


import lombok.extern.log4j.Log4j2;
import org.zerock.tourist.member.dto.MemberDTO;
import org.zerock.tourist.member.service.MemberService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.format.DateTimeFormatter;

@Log4j2
@WebServlet(name = "joinController", value = "/join")
public class JoinController extends HttpServlet {
    private MemberService service = MemberService.INSTANCE;
    private final DateTimeFormatter DATEFORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/join.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MemberDTO dto = MemberDTO.builder()
                .member_id(req.getParameter("member_id"))
                .member_pw(req.getParameter("member_pw"))
                .name(req.getParameter("name"))
                .phone(req.getParameter("phone"))
                .email1(req.getParameter("member_id"))
                .email2(req.getParameter("email2"))
                .gender(req.getParameter("gender"))
                .agree(Boolean.valueOf(req.getParameter("agree").equals("on")))
                .build();

        try {
            MemberService.INSTANCE.addMember(dto);
        } catch (Exception e) {

            e.printStackTrace();
        }
        resp.sendRedirect("/");
    }
}
