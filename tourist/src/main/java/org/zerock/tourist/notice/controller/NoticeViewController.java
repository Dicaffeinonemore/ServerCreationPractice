package org.zerock.tourist.notice.controller;

import lombok.extern.log4j.Log4j2;
import org.zerock.tourist.notice.dto.NoticeDTO;
import org.zerock.tourist.notice.service.NoticeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Log4j2
@WebServlet("/noticeview")
public class NoticeViewController extends HttpServlet {
    private NoticeService noticeService = NoticeService.INSTANCE;
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("todo list...................");
        try{
            //TodoService의 listAll을 실행하여 tbl_todo의 모든 데이터를 취득
            List<NoticeDTO> dtoList = noticeService.listAll();
            // view에서 사용할 데이터를 저장 setAttribute("view에서 사용할 이름", 실제 데이터 변수)
            req.setAttribute("dtoList", dtoList);
            // 데이터를 클릭할 페이지 설정 및 실행
            req.getRequestDispatcher("/WEB-INF/notice/notice_list.jsp").forward(req, resp);
        }catch (Exception e){
            log.error(e.getMessage());
            throw new ServletException(e);
        }
    }
}
