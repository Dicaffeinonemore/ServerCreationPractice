package org.zerock.jdbcex.controller;

import lombok.extern.log4j.Log4j2;
import org.zerock.jdbcex.dao.TodoDAO;
import org.zerock.jdbcex.dto.TodoDTO;
import org.zerock.jdbcex.service.TodoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@Log4j2
@WebServlet(name = "todoReadController", value = "/todo/read")
public class TodoReadController extends HttpServlet {
    private TodoService todoService = TodoService.INSTANCE;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        log.info("todo read.......................................");
        try {
            Long tno = Long.parseLong(req.getParameter("tno"));
            TodoDTO dto = TodoService.INSTANCE.getOne(tno);
            req.setAttribute("dto",dto);
            req.getRequestDispatcher("/WEB-INF/todo/read.jsp").forward(req,resp);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
