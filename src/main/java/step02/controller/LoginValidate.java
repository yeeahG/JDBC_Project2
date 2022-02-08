package step02.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginValidate extends HttpServlet {

    public LoginValidate() {
    	System.out.println("LOGIN 성공");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginValidate doGet()");
		process(request, response);
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("LoginValidate doPost()");
		process(request, response);
	}
	

	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id"); 
		String pw = request.getParameter("pw");
		
		if(id != null && id.equals("yeji")) {
			System.out.print("welcome");

			request.setAttribute("name", "김예지"); //request.getAttribute("name")으로 불러옴
			request.getRequestDispatcher("success").forward(request, response);
		
		} else {
			response.sendRedirect("fail");
		}
	}
	

}
