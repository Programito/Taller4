package com.tallerfour.servlettaller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.IMC;

/**
 * Servlet implementation class ServletTwo
 */
@WebServlet(name="TallerFour2", urlPatterns={"/tallerfour2"})
public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTwo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Float altura=IMC.parceAltura(request.getParameter("altura"));
		Float peso=IMC.parceAltura(request.getParameter("peso"));
		String result;
		
		if(altura==null || peso== null){
			result= "<h3> Error con los parametros <h3>";
		}else{
			float imc = peso/altura/altura;
			result = "<h3>" + imc + "<h3>";
		}
		
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		//presentacion
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Indice de Masa Corporal </title>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("<h1> IMC </h1>");
		out.println(result);
		out.println("</body>");
		out.println("</html>");
		
		
		
	}

}
