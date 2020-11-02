<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login</title>
	</head>
	<body>
		<% Cookie[] cookies = request.getCookies();
		if(cookies != null) {
			for (Cookie c : cookies) {
				if(c.getName().equals("cUsuario")){
					request.setAttribute("userName", c.getValue());
					RequestDispatcher rd = request.getRequestDispatcher("/calculadora.jsp");
					rd.forward(request, response);
				}
			}
		}
		%>

		<form action="ServletLogin" method="post">
			Usuario:<input type="text" name="userName"/></br>	
			<input type="submit" value="Enviar informacion">
		</form>

	</body>
</html>