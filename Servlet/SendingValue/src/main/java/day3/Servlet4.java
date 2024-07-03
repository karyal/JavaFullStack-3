package day3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Receive
		String str1 = request.getParameter("n1");
		String str2 = request.getParameter("n2");
		
		//Validate
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		//Process
		int num3 = num1 + num2;
		
		PrintWriter out = response.getWriter();
		//Output
		out.println("<h1>Simple Caluclation-2</h1>");
		out.println("<p>First number :"+num1+" </p>");
		out.println("<p>Second number :"+num2+" </p>");
		out.println("<p>SUM : "+num3+"</p>");
		out.println("<p><a href='Servlet3'>Servlet3</a></p>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
