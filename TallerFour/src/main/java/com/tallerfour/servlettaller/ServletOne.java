package com.tallerfour.servlettaller;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOne
 */
@WebServlet(name="TallerFour1", urlPatterns={"/tallerfour1"})
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletOne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name= request.getParameter("name");
		name = name!=null?name:"";
		String surname= request.getParameter("surname");
		name = name!=null?name:"";
		
		String time= new Date(System.currentTimeMillis()).toString();
		response.setContentType("text/html");
		
		PrintWriter out=response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title> Ejemplo ServerOne </title>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("<h1> Hola mundo de servlets! </h1>");
		out.println("<h3> Hola " + name + " " + surname+ ", son las: " + time  +"</h3>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
