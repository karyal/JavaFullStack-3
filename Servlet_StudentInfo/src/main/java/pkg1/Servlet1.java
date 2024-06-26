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

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//Receive and validate
		int sid = Integer.parseInt(request.getParameter("txtSid"));
		String name = request.getParameter("txtName");
		String course = request.getParameter("course");
		String section = request.getParameter("section");
		int sub1 = Integer.parseInt(request.getParameter("txtSub1"));
		int sub2 = Integer.parseInt(request.getParameter("txtSub2"));
		
		//Processing
		int total = sub1+sub2;
		int average = total/2;
		String result = "FAIL";
		if((sub1>=40) && (sub2>=40)) {
			result="FAIL";
		}
		
		request.setAttribute("total", total);
		request.setAttribute("average", average);
		request.setAttribute("result", result);
		
		//All values from user form & total, average, and result
		RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
