<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>


<head>
<meta charset="ISO-8859-1">
<title>Biblioteca</title>
</head>


<body background="bibli.jpg" style="font-size: 20px; color:#212F3D;text-align:center; background-size:100% 100%;">

	<h1>Acceso Biblioteca Pública Vallek@s</h1>
	
<%if ((request.getParameter("email")!=null)&&(request.getParameter("password")!=null)){ %>
<jsp:useBean id="B1" class="com.vipper.modelo.usuario" scope="request"/>    
<jsp:setProperty property="*" name="B1"/>  <!--si no hay g&S no podemos utilizar el *  -->
<jsp:forward page="servletverifica"></jsp:forward>  
<%} %>


	<img src="Candado.jpg" width="250px" height="250">
	<form action="index.jsp" method="post">
	<h3>Acceso usuario:</h3>
		
	<div style="text-align:center;">
		<table border="1" style="margin: 0 auto;">
			<tr>
			<td>email</td>
			<td><input type="email" name="email" /> </td>
			</tr>
			<br>
			<br>
			<tr>
			<td> Contraseña </td>
			<td><input type="password" name="password" /> </td>
			</tr>
		</table>
		  </div>
		<br> <input type="submit" value="Enviar datos" />
		<br><br>
	

	</form>
	<h3> ¿Nuevo usuario?</h3>
<a href="registrousuario.jsp">Crear nuevo usuario</a>
</body>

</html>