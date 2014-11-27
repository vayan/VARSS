package com.sdzee.servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Registration extends HttpServlet {
	public void doGet( HttpServletRequest request, HttpServletResponse response )	throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/registration.jsp").forward(request, response);
	}
	
	public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		String resultat;
        Map<String, String> error = new HashMap<String, String>();
		String 	email = request.getParameter("email");
		String	username = request.getParameter("username");
		String 	pass = request.getParameter("pass");
		String	conf_pass = request.getParameter("conf_pass");
		
		 try {
	            vMail(email);
	        } catch ( Exception e ) {
	            error.put("email", e.getMessage());
	        }
		 
		 try {
	            vName(username);
	        } catch ( Exception e ) {
	            error.put("username", e.getMessage());
	        }
		 
		 try {
	            vPass(pass, conf_pass);
	        } catch ( Exception e ) {
	            error.put("pass", e.getMessage());
	        }
		 
		 if ( error.isEmpty() ) {
	            resultat = "Succès de l'inscription.";
	        } else {
	            resultat = "Échec de l'inscription.";
	        }
		 
		 request.setAttribute("error", error);
	     request.setAttribute("resultat", resultat);
	     this.getServletContext().getRequestDispatcher("/WEB-INF/registration.jsp").forward( request, response );
	}
	
	private void vMail(String email) throws Exception {
	    if ( email != null && email.trim().length() != 0 ) {
	        if ( !email.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" ) ) {
	            throw new Exception( "Merci de saisir une adresse mail valide." );
	        }
	    } else {
	        throw new Exception( "Merci de saisir une adresse mail." );
	    }
	}
	
	private void vName(String name) throws Exception {
	    if ( name != null && name.trim().length() < 3 ) {
	        throw new Exception( "Le nom d'utilisateur doit contenir au moins 3 caractères." );
	    }
	}

	private void vPass(String pass, String conf_pass) throws Exception{
	    if (pass != null && pass.trim().length() != 0 && conf_pass != null && conf_pass.trim().length() != 0) {
	        if (!conf_pass.equals(pass)) {
	            throw new Exception("Les mots de passe entrés sont différents, merci de les saisir à nouveau.");
	        }
	    } else {
	        throw new Exception("Merci de saisir et confirmer votre mot de passe.");
	    }
	}


}
	
