package pkg3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet3 extends HttpServlet {
private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		if(request.getAttribute("message")!=null) {
			out.print("<p>"+request.getAttribute("message")+"</p>");
		}
		out.print("<h1>Servlet-3</h1>");
		out.print("<form action='Servlet4'>");
		out.print("<p>Enter Number (1-100) : <input type='text' name='txtNum1'></p>");
		out.print("<p><input type='submit' value='SEND'></p>");
		out.print("</form>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
