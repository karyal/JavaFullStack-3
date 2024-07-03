package day3;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<h1>Simple Calculation</h1>");
		out.println("<form action='Servlet4'>");
		out.println("<p>First Number : <input type='text' name='n1'></p>");
		out.println("<p>Second Number : <input type='text' name='n2'></p>");
		out.println("<p><input type='submit' value='SUM'></p>");
		out.println("</form>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
