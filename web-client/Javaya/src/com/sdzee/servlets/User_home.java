package com.sdzee.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class User_home extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response )	throws ServletException, IOException {
		String 	username = "Shiro";
		
		request.setAttribute("username", username);
		this.getServletContext().getRequestDispatcher("/WEB-INF/home_user.jsp").forward(request, response);
	}
}
