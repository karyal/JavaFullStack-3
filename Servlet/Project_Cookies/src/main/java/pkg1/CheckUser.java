package pkg1;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
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
			//Create Cookie and Store User Name
			Cookie cookie=new Cookie("current_user", userName); 
			cookie.setMaxAge(60);//changing age to N seconds  
			response.addCookie(cookie);  
			
			requestDispatcher = request.getRequestDispatcher("Home");
			requestDispatcher.forward(request, response);
		}
		else {
			request.setAttribute("message", "<h3>Error: username or password</h3>");
			requestDispatcher = request.getRequestDispatcher("WebForm");
			requestDispatcher.include(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		doGet(request, response);
	}
}