<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List, java.util.Date" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Javaya - Accueil</title>
<link type="text/css" rel="stylesheet" href="regis_form.css" />
</head>
<body>
<c:choose>
	<c:when test="${empty sessionScope.user_session}">
		<p>Welcome to Javaya!
			<%-- <span class="date"><%=new Date() %></span> --%>
		</p>
		<form method="post" action="home">
		<p>
			<label for="username">Nom d'utilisateur</label>
			<input type="text" id="username" name="username" value="${param.username}" size="20" maxlength="60" />
			<span class="requis">${error['username']}</span></br>
			<label for="pass">Mot de passe</label>
			<input type="password" id="password" name="password" value="${param.password}" size="20" maxlength="60" />
			<span class="requis">${error['password']}</span></br>
			<input type="submit" value="Connexion" class="sansLabel" />
			<p class="${empty error ? 'succes' : 'requis'}" >${resultat} <p/>
		</p>
		<c:if test="${!empty sessionScope.user_session}">
			<p class="succes">Vous êtes connecté(e), ${sessionScope.user_session}</p>
	   	</c:if>
	  	</form>
	  	<p><a href="<c:url value="/registration"/>">Créer un compte</a></p>  	
	</c:when>
	<c:otherwise>
		<p>Bienvenue  ${param.username}</p>
		<p>
			<input type="text" id="add_rss" name="add_rss" value="${param.add_rss}" size="20" maxlength="60" />
			<input type="submit" value="Ajouter un fux RSS" class="sansLabel" />
			<span class="requis">${error['add_rss']}</span></br>
			<a href="<c:url value="/deconnexion"/>">Déconnexion</a>
		</p>
	</c:otherwise>  	
</c:choose>
</body>
</html>