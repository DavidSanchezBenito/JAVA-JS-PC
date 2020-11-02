package com.vipper.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletLogin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);	
		String userName =  (String)request.getParameter("userName");
		
		//Cookies		
		Cookie cUser= new Cookie("cUsuario",userName);
		cUser.setMaxAge(10);
		response.addCookie(cUser);
		
		//Request Dispatcher
		request.setAttribute("userName", userName);
		RequestDispatcher rd = request.getRequestDispatcher("/calculadora.jsp");
		rd.forward(request, response);
	}

}
