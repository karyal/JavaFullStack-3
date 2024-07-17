package pkg1;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strUser = request.getParameter("txtUser");
		String strPass = request.getParameter("txtPass");
		boolean result = new LoginManager().login(strUser, strPass);
		if(result==true) {
			//forward to TmpIndex.jsp
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("TmpIndex.jsp");
			requestDispatcher.forward(request, response);
		}
		else {
			//forward to LoginUser.jsp
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("LoginUser.jsp");
			requestDispatcher.forward(request, response);
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
