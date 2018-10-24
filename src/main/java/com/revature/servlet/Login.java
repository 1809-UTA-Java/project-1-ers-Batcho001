package com.revature.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.revature.models.Employees;
import com.revature.repositories.LoginService;

public class Login extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	 
	    String username = request.getParameter("username");   
	    String password = request.getParameter("password");
	    LoginService loginService = new LoginService();
		
		Employees emp = loginService.getUser(username, password);
		boolean result = loginService.UserAuthenticater(username, password);
			
		if(result == true){
			request.getSession().setAttribute("employees", emp);      
		    response.sendRedirect("home.jsp");
		} else{
			response.sendRedirect("error.jsp");
		}

	}
}
