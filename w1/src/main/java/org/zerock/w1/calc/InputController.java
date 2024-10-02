package org.zerock.w1.calc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "inputController", value = "/calc/input")
public class InputController extends HttpServlet {
    @Override
    // /calc/input으로 get 요청이 왔을때 실행되는 메소드
    // HttpServletRequest : request의 모든 데이터를 담고있는 매개변수
    // HttpServletResponse : response에 설정되는 기본 데이터를 담고 있는 매개변수
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // sout : System.out.println(); 자동완성
        System.out.println("InputControler ...doGet...");
        // VIEW 페이지를 설정하는 기능
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/calc/input.jsp");
        // forward() : VIEW 페이지로 넘어가도록 실행하는 메소드, request 데이터 response 데이터 모두 보내주고 있음
        dispatcher.forward(req, resp);
    }

    // /calc/input의 요청시 GET 이라면 doGET 이 실행
    // /calc/input의 요청시 POST 라면 doPost 가 실행
    // 하나의 주소/calc/input을 이용하여 두 가지 메소드를 실행할 수 있음.
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // req.getParameter(Input 태그의 name 값) : input 태그에 들어있던 값을 요청해서 꺼내어 반환하는 메소드
        String a = req.getParameter("num1");
        String b = req.getParameter("num2");
        System.out.println("num1 : " + a);
        System.out.println("num2 : " + b);
//        RequestDispatcher dispatcher = req.getRequestDispatcher
//                ("/WEB-INF/calc/result.jsp");
//        // forward : view를 실행하는 기능(jsp 파일을 실행)
//        dispatcher.forward(req,resp);
        // redirect : 서블릿을 실행하는 기능(java 파일을 실행)
        // 추가, 삭제 : 목록화면으로 돌아가는 경우, 목록 화면을 띄우는 서블릿을 실행
        // 수정 : 수정 후 상세보기 화면을 띄우는 서블릿을 실행
        // 데이터를 직좁족으로 전달하는 경우는 거의 없다. 데이터베이스에 데이터를 저장하고 doGet 메소드에서 필요한 데이터를
        // 받아서 출력하는 방식을 사용
        // get 방식의 주소창에 파라미터를 전달하는 방식으로 servlet 에 데이터를 전달하는 것은 가능하지만 권장하지 않음
        resp.sendRedirect("/calc/input?num1="+a+"&num2="+b);

        @Override
        public void init() throws ServletException{
            System.out.println("InputController init...");
        }

        @Override
        public void destroy;(){
            System.out.println("InputController destroy...");
        }
    }
}