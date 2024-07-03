package day3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Products
 */
public class Products extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Products() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Our Products</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Our Products</h1>");
		out.println("<h2>Product Title</h2>");
		out.println("<p><img src='image1.jpg'></p>");
		out.println("<p>Praesent laoreet ut enim non hendrerit. Phasellus libero odio, suscipit eu libero sed, sollicitudin tristique libero. Quisque molestie rutrum aliquet. Phasellus ac eleifend nisi. Proin euismod massa eget sem tempus, vitae fermentum sem dignissim. Ut et dictum lorem. Donec mattis faucibus risus in dictum. Donec laoreet, odio sed tincidunt suscipit, turpis magna ultrices nulla, ut condimentum ex magna vitae ex. Vestibulum nec nisl at augue blandit auctor venenatis non erat. Donec laoreet felis odio, vel maximus massa pulvinar a.</p>");
		out.println("<h2>Product Title</h2>");
		out.println("<p><img src='https://picsum.photos/seed/picsum/536/354'></p>");
		out.println("<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum scelerisque est in vulputate maximus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Phasellus non elit neque. Cras lacinia dui vel turpis finibus, ut vulputate felis commodo. Nulla laoreet lorem a consectetur porta. Suspendisse pharetra erat eget neque placerat sagittis. Nunc ac risus eu lorem cursus tristique euismod in turpis. Praesent tempus leo magna, id sollicitudin mauris ultricies ac. Donec a accumsan nisi. Aliquam sed diam fringilla, pellentesque justo eu, mollis nisl. Aenean massa neque, vulputate quis justo at, porttitor venenatis urna. Sed mattis, erat facilisis viverra finibus, mauris nisi tincidunt augue, quis venenatis metus justo nec odio.</p>");
		out.println("<h2>Product Title</h2>");
		out.println("<p><img src='https://picsum.photos/id/1084/536/354?grayscale'</p>");
		out.println("<p>Phasellus ultricies, risus sed luctus rutrum, quam dui efficitur magna, eget sollicitudin quam nibh blandit risus. Nunc id diam vel nisi egestas hendrerit vitae imperdiet nulla. Phasellus luctus tempor aliquet. Proin leo mi, aliquet vel nulla eu, euismod convallis nisi. Aliquam eleifend enim nec erat ultricies volutpat. Proin tellus magna, finibus non luctus vel, venenatis ac justo. Duis ultrices magna orci, sit amet volutpat augue blandit sit amet. Nam ultricies convallis pharetra. Ut pulvinar massa quis cursus pharetra.</p>");
		out.println("<p><a href='Home'>Home</a></p>");
		out.println("<p><a href='About'>About Us</a></p>");
		out.println("<p><a href='Contact'>Contact Us</a></p>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
