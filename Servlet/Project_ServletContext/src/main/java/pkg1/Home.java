package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//Reading Contex Param
		ServletContext servletContext=getServletContext(); 
		String sitTitle = servletContext.getInitParameter("url");
		
		//Reading Init Param
		ServletConfig servletConfig=getServletConfig();  
		String pageTitle = servletConfig.getInitParameter("page_title");
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>"+sitTitle+"/"+pageTitle+"</title>");
		out.println("<h1>"+pageTitle+"</h1>");
		out.println("<p><a href='Home'>Home</a></p>");
		out.println("<p><a href='Servlet1'>About Us</a></p>");
		out.println("<p><a href='Servlet2'>Contact Us</a></p>");
		
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}