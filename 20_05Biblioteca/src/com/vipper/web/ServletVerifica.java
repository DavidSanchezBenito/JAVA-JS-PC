package com.vipper.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vipper.modelo.usuario;
import com.vipper.persistencia.AccesoBiblioteca;



/**
 * Servlet implementation class ServletVerifica
 */
@WebServlet("/servletverifica")
public class ServletVerifica extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletVerifica() {
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

		// 1. recoger los valores del formulario con el Bean
		   usuario sU1 =(usuario)request.getAttribute("B1");
		
		//        String sEmail = request.getParameter("email");
//        String sPassword = request.getParameter("password");
     
     
        
        // 2. Llamar a la capa persistencia
        String bbddPassword = null;  //inicializo
        RequestDispatcher rd = null;  //inicializo. Lo necesito para q me envie automaticamente a otra pagina
        AccesoBiblioteca ab1 = new AccesoBiblioteca();
        try {
                bbddPassword = ab1.verifica(sU1.getEmail()); // Es para obtener la password de la BBDD
                if ((sU1.getPassword()).equals(bbddPassword)) {  //como me trae la pass de la BBDD la compruebo con la introducida
                        //Acceder a la capa presentación           	
        			
                    rd = request.getRequestDispatcher
                                        ("/MostrarLibros.jsp");  //abre la pagina
                        
                } else {  //al no coincidir la password volveremos a la primera pagina, para volver a logearse o registrarse
                	
                     request.removeAttribute("B1"); 	
                     rd = request.getRequestDispatcher("/error.jsp");  //error o no coincide
                     request.setAttribute("mensaje","error en el usuario o la constraseña");
                }
        } catch (ClassNotFoundException | SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                rd = request.getRequestDispatcher("/error.jsp");  //error o no coincide
                request.setAttribute("mensaje","error en el sistema, contacte con el administrador"); 
        }finally {
    	//en realidad no se va la info hasta que utilicemos el método forward (recoge el 
		//ambito request y pasa el control)
        rd.forward(request, response);
        }
}
}