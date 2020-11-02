package com.vipper.web;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.vipper.modelo.numeros;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
 	 	
		//creacion de cookies: (solo vamos a almacenar el username)
		 //String username =(String)request.getParameter("username");   //obtener lo q quiero guardar
		 String username =request.getParameter("username");   //obtener lo q quiero guardar
		 Cookie c1 = new Cookie("cUsuario",username);
		 c1.setMaxAge(60);  //tiempo en seg q se guardará la cookie
		 response.addCookie(c1);  //la crea en el pc
		
		 //request dispatcher, como ya ha puesto nombre de usuario y se ha creado la cookie,podemos ir a la calculadora
		 request.setAttribute("username",username);   //para almacenar el user en username
		 RequestDispatcher rd= request.getRequestDispatcher("/calculadora.jsp");
		 rd.forward(request, response);
		 

	}
}
