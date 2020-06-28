

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String roll = request.getParameter("roll");
		String name = request.getParameter("name");
		String cgpa = request.getParameter("cgpa");
		
		out.print("<br>Roll : "+roll);
		out.print("<br><hr>Name : "+name);
		out.print("<br><hr>Cgpa : "+cgpa);
		out.print("<hr>");
		
		Cookie ck1= new Cookie("roll", roll);
		Cookie ck2 = new Cookie("name", name);
		Cookie ck3 = new Cookie("cgpa", cgpa);
		
		response.addCookie(ck1);
		response.addCookie(ck2);
		response.addCookie(ck3);
		
		out.print("<a href='Demo'>Click Here For Demo</a>");
	
	}
}





