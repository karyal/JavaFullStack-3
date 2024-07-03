package pkg1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// WebForm
		int sid = Integer.parseInt(request.getParameter("txtSid"));
		String name = request.getParameter("txtName");
		String course = request.getParameter("course");
		String section = request.getParameter("section");
		int sub1 = Integer.parseInt(request.getParameter("txtSub1"));
		int sub2 = Integer.parseInt(request.getParameter("txtSub2"));

		int total = Integer.parseInt(request.getAttribute("total").toString());
		int average = Integer.parseInt(request.getAttribute("average").toString());
		String result = request.getAttribute("result").toString();

		// output
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<h1>Student Result Info</h1>");
		out.println("<p>SID : " + sid + "</p>");
		out.println("<p>NAME : " + name + "</p>");
		out.println("<p>COURSE : " + course + "</p>");
		out.println("<p>SECTION : " + section + "</p>");
		out.println("<p>PoP : " + sub1 + "</p>");
		out.println("<p>CSS : " + sub2 + "</p>");
		out.println("<p>TOTAL : " + total + "</p>");
		out.println("<p>AVERAGE : " + average + "</p>");
		out.println("<p>RESULT : " + result + "</p>");
		out.println("<p><a href='Servlet3'>index</a></p>");
		out.close();

		// save data on mysql table?
		String jdbcUrl = "jdbc:mysql://localhost:3306/dbstudents";
		String jdbcUser = "root";
		String jdbcPassword = "pcps@123";
		String sql = "INSERT INTO students (sid, fullname, course, section, sub1, sub2, total, average, result) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setInt(1, sid);
			preparedStatement.setString(2, name);
			preparedStatement.setString(3, course);
			preparedStatement.setString(4, section);
			preparedStatement.setInt(5, sub1);
			preparedStatement.setInt(6, sub2);
			preparedStatement.setInt(7, total);
			preparedStatement.setInt(8, average);
			preparedStatement.setString(9, result);

			int rows = preparedStatement.executeUpdate();
			if (rows > 0) {
				out.println("<p>Data saved successfully!</p>");
			} else {
				out.println("<p>Failed to save data.</p>");
			}
			preparedStatement.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			out.println("<p>Error: " + e.getMessage() + "</p>");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
