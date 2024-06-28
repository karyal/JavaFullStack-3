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
import java.sql.SQLException;

public class Servlet7 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		// Receive data from delete form?
		int sid = Integer.parseInt(request.getParameter("txtSid"));

		// Delete in mysql table?
		String jdbcUrl = "jdbc:mysql://localhost:3306/dbstudents";
		String jdbcUser = "root";
		String jdbcPassword = "pcps@123";
		String sql = "delete from students WHERE sid=?";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(1, sid);
			int rows = preparedStatement.executeUpdate();
			if (rows > 0) {
				out.println("<p>Data delete successfully!</p>");
				out.println("<p><a href='Servlet3'>Index</a></p>");
			} else {
				out.println("<p>Failed to delete data.</p>");
			}
			preparedStatement.close();
			connection.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			out.println("<p>Error: " + e.getMessage() + "</p>");
		}
		out.close();
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
