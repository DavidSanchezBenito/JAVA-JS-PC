<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head><br><br><br>
<h1>Calculadora   v.1.0 </h1>
<h4>(Beans, Cookies y Login 19-5-2020)</h4>
<img src="login.jpg" width="300" height="200"><br><br><br>
<body style="text-align:center; background:azure">

<!-- esto es para las cookies basicamente  -->
<!--realizamos la lectura de cookies y si hay no se verá el formulario de login de la linea 28  -->

<% Cookie [] c = request.getCookies();  //creo un array de cookies q llamo c
if (c != null){
	for (Cookie i:c){   //vamos a comprobar si te has logueado inicialmente comprobando la cookie entre todas las que hay
		if(i.getName().equals("cUsuario")){  //este cusuario está en el Servlet. Cuando se crea le pone este nombre
			request.setAttribute("username", i.getValue());  // no se que hace esto
			RequestDispatcher rd = request.getRequestDispatcher("/calculadora.jsp");  //si existe va a calculadora
			rd.forward(request, response);
		}
	}
}
		%>
<form action="servlet" method="post">
		Usuario:<input type="text" name="username"><br><br><br>
		<input type="submit" value="enviar datos">
	</form>	

</body>
</html>