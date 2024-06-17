package day3;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Index Page</title>");
		out.println("<link rel='stylesheet' type='text/css' href='styles.css' />");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Index Page</h1>");
		out.println("<p><a href='About'>About Us</a></p>");
		out.println("<p><a href='Products'>Products</a></p>");
		out.println("<p><a href='Contact'>Contact Us</a></p>");
		out.println("<p onClick='f1()'>Click Me!</p>");
		
		out.println("<script src='myscript.js'></script>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
