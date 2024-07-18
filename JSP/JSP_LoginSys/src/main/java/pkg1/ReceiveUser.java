package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


public class ReceiveUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReceiveUser() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Receive
		String fullName = request.getParameter("txtName");
		String email = request.getParameter("txtEmail");
		String phone = request.getParameter("txtPhone");
		String user = request.getParameter("txtUser");
		String password = request.getParameter("txtPassword");
		String userType = request.getParameter("cmbUserType");
		boolean result = new LoginManager().save(fullName, email, phone, user, password, userType);
		
		PrintWriter out = response.getWriter();
		
		HttpSession sessions=request.getSession(false);
	   	String currentUser=(String)sessions.getAttribute("currentUser");
	   	out.println("<p>Current User: "+currentUser+"<p>");
	   	
		out.println("<p>User save successfully</p>");
		out.println("<p><a>Index</a></p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
