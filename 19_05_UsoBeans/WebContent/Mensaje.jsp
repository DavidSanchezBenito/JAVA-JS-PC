<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mensaje</title>
</head>
<body>
<h1>Mensaje resultado de la accion</h1>

<%=request.getAttribute("mensaje") %>
<br/>
<br/><br/><br/>
<a href="AltaFilm.jsp">Volver a la pantalla de inicio</a>
</body>
</html>