package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AboutUs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		HttpSession session=request.getSession(false);  
        String currentUser=(String)session.getAttribute("current_user");  
        
		out.println("<html>");
		out.println("<head>");
		out.println("<title>About Us</title>");
		out.println("<h1>Current User "+currentUser+"</h1>");
		out.println("<p><a href='Home'>Home</a></p>");
		out.println("<p><a href='AboutUs'>About Us</a></p>");
		out.println("<p><a href='ContactUs'>Contact Us</a></p>");
		out.println("<p><a href='WebForm'>Logout</a></p>");
		
		out.close();		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}