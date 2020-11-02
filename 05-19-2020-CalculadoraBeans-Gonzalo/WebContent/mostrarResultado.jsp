<%@page import="com.vipper.modelo.Calculadora"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Mostrar resultado</title>
	</head>
	<body>
		<h1>Resultado</h1>
		<h2>
			<%Calculadora calc = (Calculadora)request.getAttribute("calculadora");%> 		
			<%=calc.getNum1() %> 
			<%=calc.getOperacion() %> 
			<%=calc.getNum2() %> = 
			<%=calc.realizarOperacion()%>
		</h2>		
		</br></br>
		<a href="login.jsp">Volver al inicio</a>
	</body>
</html>