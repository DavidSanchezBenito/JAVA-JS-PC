package com.vipper.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
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
		doGet(request, response);
 	 	
		   
        //Recoger los valores del formulario y crear variables

		numeros n = (numeros)request.getAttribute("f1"); 
		Double sNumero1=n.getNumero1();
		Double sNumero2=n.getNumero2();
		String sOperacion = n.getOPE();
		Double total=null;
		RequestDispatcher rd = null;
		request.setAttribute("Operacion", sOperacion);

//System.out.println(sNumero1);
//System.out.println(sNumero2);
//System.out.println(sOperacion);
//System.out.println(sNumero1);

switch (sOperacion){
	case "S":
		total=sNumero1+sNumero2;

		break;
	case "D":
		total=sNumero1/sNumero2;

		break;
	case "M":
		total=sNumero1*sNumero2;

		break;
	case "R":
		total=sNumero1-sNumero2;

		break;
	default: rd = request.getRequestDispatcher ("/error.jsp");
}
request.setAttribute("total", total);
rd = request.getRequestDispatcher ("/MostrarResultado.jsp");
rd.forward(request, response);
	}
}
