package pkg1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//WebForm
		int sid = Integer.parseInt(request.getParameter("txtSid"));
		String name = request.getParameter("txtName");
		String course = request.getParameter("course");
		String section = request.getParameter("section");
		int sub1 = Integer.parseInt(request.getParameter("txtSub1"));
		int sub2 = Integer.parseInt(request.getParameter("txtSub2"));
		
		int total = Integer.parseInt(request.getAttribute("total").toString());
		int average = Integer.parseInt(request.getAttribute("average").toString());
		String result= request.getAttribute("result").toString();
		
		//output
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<h1>Student Result Info</h1>");
		out.println("<p>SID : "+sid+"</p>");
		out.println("<p>NAME : "+name+"</p>");
		out.println("<p>COURSE : "+course+"</p>");
		out.println("<p>SECTION : "+section+"</p>");
		out.println("<p>PoP : "+sub1+"</p>");
		out.println("<p>CSS : "+sub2+"</p>");
		out.println("<p>TOTAL : "+total+"</p>");
		out.println("<p>AVERAGE : "+average+"</p>");
		out.println("<p>RESULT : "+result+"</p>");
		out.println("<p><a href='WebForm'>index</a></p>");
		out.close();
		
		//save data on mysql table?
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
