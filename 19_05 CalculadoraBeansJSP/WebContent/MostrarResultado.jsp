<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado de la operacion</title>
</head>
<body>

La operacion efectuada es: <%=(String)request.getAttribute("Operacion") %> <br>
<h3 style="text-align=center">El resultado de la operacion es:</h3>
<%=(Double)request.getAttribute("total") %>

<br> <br>


</body>
<br>
<br>
<a href="index.jsp">Volver a realizar otra operacion</a>
</html>