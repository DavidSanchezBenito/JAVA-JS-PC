<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculadora</title>
</head>
<body background="bibli.jpg" style="text-align:center"> 
<h1>Calculadora version Beans, Cookies y Login</h1>


<%if ((request.getParameter("numero1")!=null)&&(request.getParameter("numero2")!=null)){ %>
<jsp:useBean id="f1" class="com.vipper.modelo.numeros" scope="request"/>    
<jsp:setProperty property="*" name="f1"/>
<jsp:forward page="servlet"></jsp:forward>  
<%} %>


<img src="calculadora.jpg" width="300" height="300">

<form action="index.jsp" method="post">
		Operacion a realizar: <Select name="OPE">
			<option value="S">Sumar</option>
			<option value="D">Dividir</option>
			<option value="R">Restar</option>
			<option value="M">Multiplicar</option>
		
		</Select> 
		<br/><br/><br/>
	Inserta el numero 1: <input type="text" name="numero1">
	<br></br>
	Inserta el numero 2: <input type="text" name="numero2">
	<br></br>
		<input type="submit" value="Calcular" />


	</form>


</body>
</html>