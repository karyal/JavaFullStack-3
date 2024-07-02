package pkg2;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;

public class Filter1 extends HttpFilter implements Filter {
	private static final long serialVersionUID = 1L;

	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init() method is called in "+ this.getClass().getName());
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {		
		System.out.println("Start of doFilter() method is called in "+ this.getClass().getName());		
		int num1 = Integer.parseInt(request.getParameter("txtNum1"));		
		if(num1<1 || num1>100) {
			request.setAttribute("message", "<p>"+num1+" in range of <1 or >100</p>");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("Servlet3");
			requestDispatcher.forward(request, response);
		}
		chain.doFilter(request, response);//Send to Servlet4
		System.out.println("End of doFilter() method is called in "+ this.getClass().getName());
	}
	
	public void destroy() {
		System.out.println("destroy() method is called in "+ this.getClass().getName());
	}

}