package pkg1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class UpdateUser
 */
public class UpdateUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int uid = Integer.parseInt(request.getParameter("txtUid"));
		String fullName = request.getParameter("txtName");
		String email = request.getParameter("txtEmail");
		String phone = request.getParameter("txtPhone");
		String user = request.getParameter("txtUser");
		String password = request.getParameter("txtPassword");
		String userType = request.getParameter("cmbUserType");
		boolean result = new LoginManager().update(uid, fullName, email, phone, user, password, userType);
		
		PrintWriter out = response.getWriter();
		out.println("<p>User update successfully</p>");
		out.println("<p><a href='TempIndex.jsp'>Index</a></p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
