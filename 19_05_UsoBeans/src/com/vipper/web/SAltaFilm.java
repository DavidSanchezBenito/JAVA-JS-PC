package com.vipper.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vipper.modelo.Film;
import com.vipper.persistencia.AccesoSakila;

/**
 * Servlet implementation class SAltaFilm
 */
@WebServlet("/saltafilm")
public class SAltaFilm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SAltaFilm() {
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
		// ahorramos codigo con el Beans, y solo tendriamos q recoger
	
		Film sf1 = (Film)request.getAttribute("f1");   //en lugar del getParamether usamos el getAttribute
		RequestDispatcher rd=null;
		//System.out.println("Bean" + sf1.toString());   //para ver q nos está mandado bien por consola
		//guardamos en la BBDD una vez q la linea anterior esta bien
		AccesoSakila as1 = new AccesoSakila();
		try {
			boolean exito= as1.altaFilm(sf1); //mando el multicatch 
			if (exito) {
				request.setAttribute("mensaje", "se ha realizado el alta exitosamente");
			}else {
				request.setAttribute("mensaje", "ha habido un error al realizar el alta");
			}
			rd = request.getRequestDispatcher("/Mensaje.jsp");
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
			rd= request.getRequestDispatcher("/AltaFilm.jsp");
		}
		rd.forward(request, response);
	}

}
