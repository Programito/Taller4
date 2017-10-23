package com.tallerfour.servlettaller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.Cesar;
import logic.IMC;
import logic.SuperWord;

/**
 * Servlet implementation class ServletTwo
 */
@WebServlet(name="servletCesar", urlPatterns={"/servletCesar"})
public class ServletCesar extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	  public ServletCesar() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

     

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String texto=request.getParameter("texto");
		String opcion=request.getParameter("opcion");
		int codigo=Integer.parseInt(request.getParameter("codigo"));
		String resultado="";
		if(opcion.equals("encriptar")){
			resultado=Cesar.cesar(texto,0,codigo);
		}
		else{
			resultado=Cesar.cesar(texto,1,codigo);
		}
		
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		//presentacion
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Indice de Masa Corporal </title>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("<h1> Texto </h1>");
		out.println("<h2> Texto inicial: " + texto +  "</h2>");
		out.println("<h2> Opcion: " + opcion +", Codigo: "+ codigo +  "</h2>");
		out.println("<h2> Texto Final: " + resultado +  "</h2>");
		out.println("</body>");
		out.println("</html>");
		
		
		
	}

}
	
