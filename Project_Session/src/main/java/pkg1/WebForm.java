package pkg1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class WebForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>User Login Form</title>");
		out.println("</head>");
		out.println("</body>");
		
		if(request.getAttribute("message")!=null) {
			out.println(request.getAttribute("message"));
		}
		out.println("<h1>User Login Form</h1>");
		out.println("<form action='CheckUser' method='get'>");
		out.println("<p>USER : <input type='text' name='txtUser'></p>");
		out.println("<p>PASS : <input type='text' name='txtPass'></p>");
		out.println("<input type='submit' value='LOGIN'></p>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}