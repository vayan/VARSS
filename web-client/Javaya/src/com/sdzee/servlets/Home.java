package com.sdzee.servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Home extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response )	throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
	}
	
	public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	Map<String, String> error = new HashMap<String, String>();
	String resultat;

	 try {
         vName(username);
     } catch ( Exception e ) {
         error.put("username", e.getMessage());
     }
	 
	 try {
         vPassword(username, password);
     } catch ( Exception e ) {
         error.put("password", e.getMessage());
     }
	 
	 if ( error.isEmpty() ) {
		  resultat = "Succ�s";
     } else {
         resultat = "Identifiants incorrects";
	 }
	 
	 request.setAttribute("error", error);
     request.setAttribute("resultat", resultat);
	 this.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward( request, response );
	}
	
	private void	vName(String name) throws Exception{
		if (!name.equals("toto")) {
			throw new Exception("Nom d'utilisateur incorrect");
		}
	} 
	
	private void	vPassword(String name, String pass) throws Exception{
		if (name.equals(null))
			throw new Exception("Veuillez sp�cifier un nom d'utilisateur");
		if (!pass.equals("toto")) {
			throw new Exception("Mot de passe incorrect");
		}
	}
	
}
