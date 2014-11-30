<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Javaya - ${param.username}</title>
</head>
<body>
	<p>Bienvenue  ${param.username}</p>
	<p>
		<input type="text" id="add_rss" name="add_rss" value="${param.add_rss}" size="20" maxlength="60" />
		<input type="submit" value="Ajouter un fux RSS" class="sansLabel" />
		<span class="requis">${error['add_rss']}</span></br>
	</p>
	<p><a href="<c:url value="/deconnexion"/>">Déconnexion</a></p>
</body>
</html>