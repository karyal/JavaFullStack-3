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

public class Servlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		// Receive data from edit form?
		int sid = Integer.parseInt(request.getParameter("txtSid"));
		String name = request.getParameter("txtName");
		String course = request.getParameter("course");
		String section = request.getParameter("section");
		int sub1 = Integer.parseInt(request.getParameter("txtSub1"));
		int sub2 = Integer.parseInt(request.getParameter("txtSub2"));

		// Update in mysql table?
		// save data on mysql table?
		String jdbcUrl = "jdbc:mysql://localhost:3306/dbstudents";
		String jdbcUser = "root";
		String jdbcPassword = "pcps@123";
		String sql = "update students set fullname=?, course=?, section=?, sub1=?, sub2=? WHERE sid=?";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, name);
			preparedStatement.setString(2, course);
			preparedStatement.setString(3, section);
			preparedStatement.setInt(4, sub1);
			preparedStatement.setInt(5, sub2);
			preparedStatement.setInt(6, sid);
			
			int rows = preparedStatement.executeUpdate();
			if (rows > 0) {
				out.println("<p>Data update successfully!</p>");
			} else {
				out.println("<p>Failed to update data.</p>");
			}
			preparedStatement.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			out.println("<p>Error: " + e.getMessage() + "</p>");
		}
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
