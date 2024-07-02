package pkg1;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class CheckUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userName = request.getParameter("txtUser");
		String userPass = request.getParameter("txtPass");
		HttpSession session=request.getSession();  
		session.setAttribute("current_user", userName);
		
		RequestDispatcher requestDispatcher;
		if((userName.equals("admin")) && (userPass.equals("admin@123"))){			
			requestDispatcher = request.getRequestDispatcher("Home");
			requestDispatcher.forward(request, response);
		}
		else {
			request.setAttribute("message", "<h3>Error: username or password</h3>");
			requestDispatcher = request.getRequestDispatcher("WebForm");
			requestDispatcher.include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
