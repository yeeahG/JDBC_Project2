package step02.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/success")
public class SuccessView extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("SuccessView doGet()");
		process(request, response);
	}

	//post 방식만 처리하는 메소드
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("SuccessView doPost()");
		process(request, response);
	}
	
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request로부터 getParemeter("id") 값을 server 콘솔에 출력
		System.out.println(request.getParameter("id"));
		
		//setAttribute로 저장한 데이터 server 콘솔에 출력
		System.out.println(request.getAttribute("name"));
		
		//버튼 클릭해서 radio.html연결
		response.sendRedirect("radio.html");
	}
	

}
