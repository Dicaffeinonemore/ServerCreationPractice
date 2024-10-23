package org.zerock.tourist.member.controller;

import lombok.extern.log4j.Log4j2;
import org.zerock.tourist.member.dto.MemberDTO;
import org.zerock.tourist.member.service.MemberService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Log4j2
@WebServlet("/login")
public class LoginController extends HttpServlet {
    MemberService memberService = MemberService.INSTANCE;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("login doPost.........");

        String mid = req.getParameter("member_id");
        String mpw = req.getParameter("member_pw");
        try {
            MemberDTO loginInfo = memberService.login(mid, mpw);
            HttpSession session = req.getSession();
            resp.sendRedirect("/");

        } catch (Exception e) {
            e.printStackTrace();
            resp.sendRedirect("/login");
        }
    }

}
}

