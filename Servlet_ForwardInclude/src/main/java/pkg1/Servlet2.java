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
		
		//Receive, and display
		//String txtNum1 =(String) request.getAttribute("n1");
		//String txtNum2 =(String) request.getAttribute("n2");
		//String txtNum3 =(String) request.getAttribute("n3");
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<p>Num1 : "+request.getAttribute("n1")+"</p>");
		out.println("<p>Num2 : "+request.getAttribute("n2")+"</p>");
		out.println("<p>Sum : "+request.getAttribute("n3")+"</p>");
		out.println("<p><a href='WebForm'>Calculator</a></p>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
