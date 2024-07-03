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
		PrintWriter out = response.getWriter();
		out.print("<h1>Servlet-2</h1>");
		response.setContentType("text/html");
		
		int num1 = Integer.parseInt(request.getParameter("txtNum1"));//Read
		if(num1>=1 && num1<=50) {
			out.print("<p>"+num1+" in range of 1-50</p>");			
		}
		else if(num1>=51 && num1<=100) {
			out.print("<p>"+num1+" in range of 51-100</p>");			
		}
		else {
			out.print("<p>"+num1+" out of range</p>");	
		}
		out.print("<p><a href='Servlet3'>Index</a></p>");	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
