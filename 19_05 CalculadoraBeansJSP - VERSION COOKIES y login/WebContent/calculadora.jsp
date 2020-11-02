<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculadora</title>
</head>
<body style="background:azure; text-align:center"> 
<h1></h1>

<!--filas 12 a 17 es el useBean  -->
<%if ((request.getParameter("numero1")!=null)&&(request.getParameter("numero2")!=null)){ %>
<jsp:useBean id="B1" class="com.vipper.modelo.numeros" scope="request"/>    
<jsp:setProperty property="*" name="B1"/>
<jsp:forward page="MostrarResultado.jsp"></jsp:forward>  
<%} %>

<h2>Bienvenido/a:  <%=(String)request.getAttribute("username") %></h2>  <!--muestra el usuario logeado  -->
<img src="calculadora.jpg" width="300" height="300">

<form action="calculadora.jsp" method="post">  <!--el action será el mismo q esta pagina  -->
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