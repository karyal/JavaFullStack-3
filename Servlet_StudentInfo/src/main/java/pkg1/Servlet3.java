package pkg1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
		
		//Display records from mysql table
		String jdbcUrl = "jdbc:mysql://localhost:3306/dbstudents";
		String jdbcUser = "root";
		String jdbcPassword = "pcps@123";
		String sql = "SELECT * FROM students";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);
			PreparedStatement pstat = conn.prepareStatement(sql);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()) {
				out.println("<tr><td>"+rs.getInt("sid")+"</td><td>"+rs.getString("fullname")+"</td><td>"+rs.getString("course")+"</td><td>"+rs.getString("section")+"</td><td>"+rs.getInt("sub1")+"</td><td>"+rs.getInt("sub2")+"</td><td>"+rs.getInt("total")+"</td><td>"+rs.getInt("average")+"</td><td>"+rs.getString("result")+"</td></tr>");
			}
			rs.close();
			pstat.close();
			conn.close();
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
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
