package pkg1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//Accessing session variable
		HttpSession session=request.getSession(false);  
        String currentUser=(String)session.getAttribute("current_user");  
        
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Index Page</title>");
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