package pkg1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Receive, Validate, and Process
		int num1 = Integer.parseInt(request.getParameter("n1"));
		int num2 = 6;
		
		PrintWriter out = response.getWriter();
		out.println("<h1>Servlet2</h1>");
		out.println("<p><a href='Servlet3?v1=num1&v2=num2'>Servlet3</a></p>");
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
