package org.zerock.jdbcex.controller;

import org.zerock.jdbcex.dto.TodoDTO;
import org.zerock.jdbcex.service.TodoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;

@WebServlet(name ="todoModifyController", value = "/todo/modify")
public class TodoModifyController extends HttpServlet {
    TodoService todoService = TodoService.INSTANCE;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Long tno = Long.parseLong(req.getParameter("tno"));
            TodoDTO dto = TodoService.INSTANCE.getOne(tno);
            req.setAttribute("dto",dto);
            req.getRequestDispatcher("/WEB-INF/todo/modify.jsp").forward(req,resp);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        TodoDTO dto = TodoDTO.builder()
                .tno(Long.parseLong(req.getParameter("tno")))
                .title(req.getParameter("title"))
                .dueDate(LocalDate.parse(req.getParameter("dueDate")))
                // input type = "checkbox"의 경우 파라미터를 출력하면 체크 상태 = "on", 체크해제상태 = ""
                .finished(req.getParameter("finished") != null && req.getParameter("finished").equals("on"))
                .build();
        try{
            todoService.modify(dto);
        }catch (Exception e){
            e.printStackTrace();
        }
//        resp.sendRedirect("todo/list"); // list 화면으로 이동
        resp.sendRedirect("/todo/read?tno"+ req.getParameter("tno"));// 수정한 tno의 read 화면으로 이동
    }
}
