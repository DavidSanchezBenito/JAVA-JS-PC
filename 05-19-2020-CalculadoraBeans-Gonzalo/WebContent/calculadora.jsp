<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Calculadora</title>
	</head>
	<body>
		<%if (request.getParameter("num1") != null){%>
			<jsp:useBean id="calculadora" class="com.vipper.modelo.Calculadora" scope="request"></jsp:useBean>
			<jsp:setProperty property="*" name="calculadora"/>
			<jsp:forward page="mostrarResultado.jsp"></jsp:forward>
		<%} %>
		
		<h1>Calculadora</h1>
		<h2>Bienvenido <%=(String)request.getAttribute("userName") %></h2>
		<form action="calculadora.jsp" method="post">
			Primer número:<input type="text" name="num1"/></br>
			Segundo número:<input type="text" name="num2"/></br>	
			<select name="operacion">
				<option value="+" selected>Sumar</option>
				<option value="-">Restar</option>
				<option value="*">Multiplicar</option>
				<option value="/">Dividir</option>
			</select>
			</br></br>		
			<input type="submit" value="Enviar informacion">
		</form>
	</body>
</html>