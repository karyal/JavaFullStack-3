package pkg1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

/**
 * Servlet implementation class ExportIndividual
 */
public class ExportIndividual extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbLoginSys", "root",
					"pcps@123");
			String uid = request.getParameter("uid");
			String sql = "SELECT * FROM users WHERE uid = ?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, Integer.parseInt(uid));
			ResultSet rs = st.executeQuery();

			if (rs.next()) {
				String PDFFileName = "C:\\Users\\info_\\Downloads\\User_" + uid + ".pdf";
				Document document = new Document();
				PdfWriter.getInstance(document, new FileOutputStream(PDFFileName));
				document.open();
				Paragraph para1 = new Paragraph("UID: " + rs.getInt("uid"));
				Paragraph para2 = new Paragraph("Name: " + rs.getString("full_name"));
				Paragraph para3 = new Paragraph("Email: " + rs.getString("email"));
				Paragraph para4 = new Paragraph("Phone: " + rs.getString("phone"));
				Paragraph para5 = new Paragraph("Login Name: " + rs.getString("login_name"));
				Paragraph para6 = new Paragraph("Login Password: " + rs.getString("login_password"));
				Paragraph para7 = new Paragraph("User Type: " + rs.getString("user_type"));
				document.add(para1);
				document.add(para2);
				document.add(para3);
				document.add(para4);
				document.add(para5);
				document.add(para6);
				document.add(para7);

				document.close();
				out.println("Successfully exported data to PDF for users ID: " + uid);
			} else {
				out.println("No users found with ID: " + uid);
			}
		} catch (Exception e) {
			out.println("Error: " + e.getMessage());
		} finally {
			out.close();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
