package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//Display all students
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
	//Display all students
	//dbstudents -> students (sid, fullname, course, section, sub1, sub2, total, average, result)

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Display All Students</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>All Students</h1>");
		out.println("<table width='90%' border='1'>");
		out.println("<tr><td>SID</td><td>FULLNAME</td><td>COURSE</td><td>SECTION</td><td>POP</td><td>CSS</td><td>TOTAL</td><td>AVERAGE</td><td>RESULT</td></tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
