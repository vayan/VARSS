package com.sdzee.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
public class Home extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response )	throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
	}
	
	public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
	String 				username = request.getParameter("username");
	String 				password = request.getParameter("password");
	Map<String, String> error = new HashMap<String, String>();
	String 				resultat = null;
	HttpSession 		session = request.getSession();
	boolean				success = false;
	
	
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
	 
	 if (error.isEmpty()) {
		  resultat = "Succès";
		  success = true;
		  Aff_rss(username);
     } else {
         resultat = "Identifiants incorrects";
         success = false;
	 }
 
	 request.setAttribute("username", username);
	 request.setAttribute("password", password);
	 request.setAttribute("error", error);
     request.setAttribute("resultat", resultat);
     if (success == true)
    	 session.setAttribute("user_session", username);
     session.setAttribute("success", success);
	 this.getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward( request, response );
	}
	
	private void	vName(String username) throws Exception{
		if (!username.equals("toto")) {
			throw new Exception("Nom d'utilisateur incorrect");
		}
	} 
	
	private void	vPassword(String username, String password) throws Exception{
		if (username.equals(null))
			throw new Exception("Veuillez spécifier un nom d'utilisateur");
		if (!password.equals("toto")) {
			throw new Exception("Mot de passe incorrect");
		}
	}
	
	private void	Aff_rss(String username) {
		ArrayList<String> rss = new ArrayList<String>();
		
		for (int i=0;i<rss.size();i++) {
		      System.out.println(rss.get(i));     
		  }
	}

}
