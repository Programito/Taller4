package com.tallerfour.servlettaller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.IMC;
import logic.SuperWord;

/**
 * Servlet implementation class ServletTwo
 */
@WebServlet(name="servervowels", urlPatterns={"/servervowels"})
public class ServletVowels extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	  public ServletVowels() {
	        super();
	        // TODO Auto-generated constructor stub
	    }

     

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String texto=request.getParameter("texto");
		SuperWord sw= new SuperWord(texto);
		ArrayList<SuperWord.Vocal> vocals= sw.numberVocal();
		
		
		
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		//presentacion
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Indice de Masa Corporal </title>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("<h1> Ejercicio 1: Contar Vocales del Texto </h1>");
		out.println("<h2> La palabra: " + texto +  "</h2>");
		String salida="";
		int contador=0;
		for(int i=0;i<vocals.size();i++){
			salida=salida+("<h4>" + vocals.get(i).getC() +":" + vocals.get(i).getNumber() +  "</h4>");
			contador=contador+vocals.get(i).getNumber();
		}
		out.println("<h3> Contiene un total vocales: " + contador +  "</h3>");
		out.println(salida);
		out.println("</body>");
		out.println("</html>");
		
		
		
	}

}