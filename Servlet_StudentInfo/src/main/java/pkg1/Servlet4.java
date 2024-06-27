package pkg1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sid = Integer.parseInt(request.getParameter("sid"));
		//Search record on mysql table and display in edit form
		PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Student Registration</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h2>Student Edit Form</h2>");
        out.println("<form action='Servlet5' method='get'>");
        out.println("<p>SID:<input type='text' name='txtSid'></p>");
        out.println("<p>Name:<input type='text' name='txtName'></p>");
        out.println("<p>Course:<select name='course' id='course'><option value='Bsc'>BSC</option><option value='BBM'>BBM</option></select></p>");
        out.println("<p>Section:<select name='section' id='section'><option value='A'>A</option><option value='B'>B</option></select></p>");
        out.println("<p>Subject 1:<input type='text' name='txtSub1'></p>");
        out.println("<p>Subject 2:<input type='text' name='txtSub2'></p>");
        out.println("<input type='submit' value='Update'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        out.close();
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
