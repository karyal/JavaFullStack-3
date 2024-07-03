package day3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Contact Us</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Contact Us</h1>");
		out.println("<p>Kandevtasthan, Lalitpur, Nepal</p>");
		out.println("<p>+977 1 5181033, 977 1 5181198</p>");
		out.println("<p>connect@patancollege.org</p>");
		out.println("<p><a href='Home'>Home</a></p>");
		out.println("<p><a href='About'>About Us</a></p>");
		out.println("<p><a href='Products'>Products</a></p>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
