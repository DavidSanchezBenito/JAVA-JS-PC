<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alta peli</title>
</head>
<body>
<%if (request.getParameter("film_id")!=null){ %>   <!--si el film id q metemos es correcto y no existe, entra cnd se carga x 2ª vez -->
<jsp:useBean id="f1" class="com.vipper.modelo.Film" scope="request"/>    <!-- indicamos de q clase queremos hacer ese bean  -->
<jsp:setProperty property="*" name="f1"/>
<jsp:forward page="saltafilm"></jsp:forward>  <!-- esta es la q nos reenvia al forward  -->
<%} %>

<h1>Alta Peli</h1>
<form action="AltaFilm.jsp" method="post">    <!-- aqui ponemos el nombre de la misma jsp q estamos trabajando  -->
Pelicula id: <input type="number" name="film_id" ><br/>  <!--el name tiene q coincidir con el de la clase film de cpa modelo  -->
title: <input type="text" name="title" ><br/>
Idioma Id: <input type="number" name="language_id" ><br/>
Duracion: <input type="number" name="rental_duration" ><br/>
Cuota: <input type="text" name="rental_rate" ><br/> <br/>   <!--es double pero luego haremos la conversion  -->
<input type="submit" value="dar de alta"/>

</form>
</body>
</html>