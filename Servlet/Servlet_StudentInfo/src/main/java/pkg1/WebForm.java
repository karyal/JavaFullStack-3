package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WebForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Student Registration</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<form action='Servlet1' method='get'>");
        out.println("<p>SID:<input type='text' name='txtSid'></p>");
        out.println("<p>Name:<input type='text' name='txtName'></p>");
        out.println("<p>Course:<select name='course' id='course'><option value='Bsc'>BSC</option><option value='BBM'>BBM</option></select></p>");
        out.println("<p>Section:<select name='section' id='section'><option value='A'>A</option><option value='B'>B</option></select></p>");
        out.println("<p>Subject 1:<input type='text' name='txtSub1'></p>");
        out.println("<p>Subject 2:<input type='text' name='txtSub2'></p>");
        out.println("<input type='submit' value='Send'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
