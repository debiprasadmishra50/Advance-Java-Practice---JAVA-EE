

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Xservlet
 */
@WebServlet(
		urlPatterns = { "/x" }, 
		initParams = { 
				@WebInitParam(name = "landmark", value = "Lingaraj Temple"), 
				@WebInitParam(name = "city", value = "BBSR")
		})
public class Xservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Xservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		ServletConfig config = getServletConfig();
		ServletContext context = getServletContext();
		
		out.print("<br>City : "+config.getInitParameter("city"));
		out.print("<br>Landmark : "+config.getInitParameter("landmark"));
		
		out.print("<br> State : "+context.getInitParameter("State"));
		out.print("<br> Country : "+context.getInitParameter("Country"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
