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

//Value range - 0 to 99
public class Filter2 extends HttpFilter implements Filter {
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init() method is called in "+ this.getClass().getName());
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {				
		System.out.println("Start of doFilter() method is called in "+ this.getClass().getName());		
		boolean result = false;
		try {
			int num1 = Integer.parseInt(request.getParameter("n1"));		
			int num2 = Integer.parseInt(request.getParameter("n2"));
			if((num1>0) && (num2>0) && (num1<=100) && (num2<=100))
				result=true;			
			System.out.println("End of doFilter() method is called in "+ this.getClass().getName());
		}
		catch(Exception ex){
			result=false;
		}				
		if(result) {
			chain.doFilter(request, response);
		}
		else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("filter_object1.jsp");			
			requestDispatcher.forward(request, response);
		}
	}
	
	public void destroy() {
		System.out.println("destroy() method is called in "+ this.getClass().getName());
	}
}