package pkg1;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;

//Receive values and convert to integer
public class Filter1 extends HttpFilter implements Filter {
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init() method is called in "+ this.getClass().getName());
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {				
		System.out.println("Start of doFilter() method is called in "+ this.getClass().getName());		
		try {
			int num1 = Integer.parseInt(request.getParameter("n1"));		
			int num2 = Integer.parseInt(request.getParameter("n2"));
			chain.doFilter(request, response);//Send to Servlet4
			System.out.println("End of doFilter() method is called in "+ this.getClass().getName());
		}
		catch(Exception ex){
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("filter_object1.jsp");			
			requestDispatcher.forward(request, response);
		}							
	}
	
	public void destroy() {
		System.out.println("destroy() method is called in "+ this.getClass().getName());
	}
}