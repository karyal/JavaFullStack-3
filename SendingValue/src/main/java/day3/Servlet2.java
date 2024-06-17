package day3;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Receive value
		String str1 = request.getParameter("n1"); // int <-String
		String str2 = request.getParameter("n2");
		
		//Validate (type, range)
		int num1=Integer.parseInt(str1); //String to Integer
		int num2=Integer.parseInt(str2); //String to Integer
		
		//Calculate Sum
		int sum = num1 + num2;
		
		PrintWriter out = response.getWriter();
		out.println("<h1>Servlet-2</h1>");
		out.println("<p>Value1 : "+str1+" <p>");//Display value
		out.println("<p>Value2 : "+str2+" <p>");//Display value
		//Display Result
		out.println("<p>Result : "+sum+" <p>");//Display value
		
		out.println("<p><a href='Servlet1'>Servlet1</a><p>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
