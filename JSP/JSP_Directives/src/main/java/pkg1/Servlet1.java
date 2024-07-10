package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class Servlet1 extends GenericServlet {
	private static final long serialVersionUID = 1L;
    
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		int num1 =25;
		int num2 =7;
		int num3 = num1 + num2;
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<h1>Result from Generic Servlet</h1>");
		out.println("<p>NUM-1 : "+num1+"</p>");
		out.println("<p>NUM-2 : "+num2+"</p>");
		out.println("<p>RESULT : "+num3+"</p>");
		out.close();
	}
}