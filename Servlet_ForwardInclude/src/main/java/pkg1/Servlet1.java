package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Receive, Validate, Process
		//Forward to Servlet2	
		
		String txtNum1 = request.getParameter("txtN1");
		String txtNum2 = request.getParameter("txtN2");
		
		int num1 = Integer.parseInt(txtNum1);
		int num2 = Integer.parseInt(txtNum2);
		
		int sum = num1 + num2;
		
		request.setAttribute("n1", num1);
		request.setAttribute("n2", num2);
		request.setAttribute("n3", sum);
		
		RequestDispatcher  requestDispatcher = request.getRequestDispatcher("Servlet2");
		requestDispatcher.forward(request, response);//forward to Servlet2
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		
	}

}
