package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Receive values (num1, num2)
		//Validate values (convert to int)
		//Process (calculate sum)
		//Ouput (display sum)
		
		PrintWriter out = response.getWriter();
		out.println("<h1>Servlet3</h1>");
		out.println("<p><a href='Servlet1'>Servlet1</a></p>");
		out.close();	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
