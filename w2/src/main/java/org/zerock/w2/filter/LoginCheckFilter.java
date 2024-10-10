package org.zerock.w2.filter;

import lombok.extern.log4j.Log4j2;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Log4j2
// 필터를 이용하여 컨트롤러가 실행되기 전 실행하고 싶은 메소드를 실행하는기능
// urlPatterns={"컨트롤러의 value값"} : 실행하고 싶은 url을 사용,
// *의 의미는 모든 것을 의미함으로 /todo/* 는 /todo가 붙어있는 모든 uri을 실행한다.
@WebFilter(urlPatterns ={"/todo/*"} )
public class LoginCheckFilter implements Filter {

    // doFilter() : 필터에서 실행할 메소드 설정
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("Login Check Filter ...........");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;


        HttpSession session = request.getSession();
        if(session.isNew()){
            response.sendRedirect("/login");
            return;
        }
        if(session.getAttribute("loginInfo") ==null){
            response.sendRedirect("/login");
            return;
        }

        // 필터를 실행하기위해 반드시 필요한 부분 : servletRequest, servletResponse 를 이용하여 controller 에
        // 데이터를 보내거나 여러가지 기능을 사용할 수 있음
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
