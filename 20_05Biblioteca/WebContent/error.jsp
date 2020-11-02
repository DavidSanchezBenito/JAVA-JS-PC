<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>pagina de ERROR</title>
</head>
<body style="background: azure; font-size: 20px; text-align:center">
<h1 style="text-align:center; font-size:30px">Error de acceso a la biblioteca</h1>
<br>
<br>
<img src="error.jpg" width="300px" height="300">
<h3>Error producido:</h3>
"<%=request.getAttribute("mensaje") %>"
<br>
<br>
<br>
<br>
<a href="index.jsp">Pulse aqui para volver a la pagina de login</a>
</body>
</html>