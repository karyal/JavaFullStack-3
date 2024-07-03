package pkg1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Servlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sid = Integer.parseInt(request.getParameter("sid"));
		//Search and display record based on sid
		
		String jdbcUrl = "jdbc:mysql://localhost:3306/dbstudents";
		String jdbcUser = "root";
		String jdbcPassword = "pcps@123";
		String sql = "SELECT * FROM students WHERE sid=?";
		
		String fullname="", course="", section="", result="";
		int sub1=0, sub2=0, total=0, average=0;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);
			PreparedStatement pstat = conn.prepareStatement(sql);
			pstat.setInt(1, sid);
			ResultSet rs = pstat.executeQuery();
			while(rs.next()) {
				sid = rs.getInt("sid");
				fullname = rs.getString("fullname");
				course = rs.getString("course");
				section=rs.getString("section");
				sub1 = rs.getInt("sub1");
				sub2 = rs.getInt("sub2");
				total = rs.getInt("total");
				average = rs.getInt("average");
				result = rs.getString("result");
			}
			rs.close();
			pstat.close();
			conn.close();
		}
		catch(Exception ex) {
			System.out.println("Error : "+ex.getMessage());
		}
		
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
        out.println("<p>SID:<input type='text' name='txtSid' value="+sid+"></p>");
        out.println("<p>Name:<input type='text' name='txtName' value="+fullname+"></p>");
        out.println("<p>Course:<select name='course' id='course'><option value='Bsc'>BSC</option><option value='BBM'>BBM</option></select></p>");
        out.println("<p>Section:<select name='section' id='section'><option value='A'>A</option><option value='B'>B</option></select></p>");
        out.println("<p>Subject 1:<input type='text' name='txtSub1' value="+sub1+"></p>");
        out.println("<p>Subject 2:<input type='text' name='txtSub2' value="+sub2+"></p>");
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
