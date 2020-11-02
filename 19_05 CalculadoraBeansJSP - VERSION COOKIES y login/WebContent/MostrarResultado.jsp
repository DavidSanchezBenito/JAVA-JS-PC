<%@page import="com.vipper.modelo.numeros"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado de la operacion</title>
</head>
<body>


	<h3 style="">El resultado de la operacion es:</h3>
	<h2>
		<%	numeros n1 = (numeros) request.getAttribute("B1");//traemos los datos de useBean de calculadora.jsp
		//B1 viene de la useBean de calculadora.jsp
		%>
		
		<%=n1.getNumero1()%>  
		<%=n1.getOPE()%>
		<%=n1.getNumero2()%>=
		<%=n1.realizarOperacion()
				//aplicamos metodo calcular (las lineas anteriores era solo para mostrar los datos)
		%>  

	</h2>
	<a href="login.jsp">Volver a inicio</a>
	<br>
	<br>


</body>
<br>
<br>

</html>