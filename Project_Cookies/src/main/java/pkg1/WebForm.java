package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WebForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//Reading cookie value
		String currentUser ="";
		Cookie cookies[]=request.getCookies();
		for(int i=0; i<cookies.length; i++) {
			String cookie_name = cookies[i].getName();
			if(cookie_name.equals("current_user")) {
				currentUser = cookies[i].getValue();
			}
		}
		
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
		out.println("<p>USER : <input type='text' name='txtUser' value='"+currentUser+"'></p>");
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