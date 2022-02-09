package step02.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import step02.db.DB;

@WebServlet("/select")
public class RadioSelect extends HttpServlet {
    public RadioSelect() {
    	System.out.println("RadioSelect 성공");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("RadioSelect doGet()");
		process(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("RadioSelect doPost()");
		process(request, response);
	}
	
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id"); 
		String check_var = DB.getHash(id);
		
		if(check_var != null) {
			request.setAttribute("check", check_var);
			request.getRequestDispatcher("radio").forward(request, response);
		
		} else {
			
//			System.out.println("---------" + id);
//			response.sendRedirect("fail");
			
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("\"<script>alert('멤버를 선택해주세요'); history.go(-1);</script>");
		}
		
	}
		
}
