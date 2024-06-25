package pkg1;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import mylibs.Numbers;

/**
 * Servlet implementation class Servlet1
 */
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Receive from UI or WebForm
		int n1 = Integer.parseInt(request.getParameter("txtN1"));
		int n2 = Integer.parseInt(request.getParameter("txtN2"));
		
		//Validation
		//Processing
		//Generate output
		
		Numbers nums = new Numbers();
		nums.num1=n1;
		nums.num2=n2;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
