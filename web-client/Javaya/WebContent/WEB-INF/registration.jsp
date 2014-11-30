<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Javaya - Création d'un nouveau compte</title>
<link type="text/css" rel="stylesheet" href="regis_form.css" />
</head>
<body>
<form method="post" action="registration">
  <fieldset>
   	<legend>Créer un nouveau compte</legend>
    	<label for="email">Email<span class="requis">*</span></label>
        <input type="text" id="email" name="email" value="${param.email}" size="20" maxlength="60" />
        <span class="requis">${error['email']}</span>
        <br/>

		<label for="username">Nom d'utilisateur<span class="requis">*</span></label>
        <input type="text" id="username" name="username" value="${param.username}" size="20" maxlength="20" />
        <span class="requis">${error['username']}</span>
        <br/>
         
        <label for="pass">Mot de passe<span class="requis">*</span></label>
        <input type="password" id="pass" name="pass" value="" size="20" maxlength="20" />
        <span class="requis">${error['pass']}</span>
        <br/>

        <label for="conf_pass">Confirmer le mot de passe<span class="requis">*</span></label>
        <input type="password" id="conf_pass" name="conf_pass" value="" size="20" maxlength="20" />
        <span class="requis">${error['conf_pass']}</span>
        <br/>

         <input type="submit" value="Inscription" class="sansLabel" />
               
         <p class="${empty error ? 'succes' : 'requis'}">${resultat}</p>
  	</fieldset>
  	</form>
  	<p><a href="<c:url value="/home"/>">Retourner a l'accueil</a></p>
</body>
</html>