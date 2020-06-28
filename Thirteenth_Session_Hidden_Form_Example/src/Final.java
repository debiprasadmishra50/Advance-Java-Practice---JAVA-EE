

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Final")
public class Final extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Final() {
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
		
		String college = request.getParameter("college");
		String branch = request.getParameter("branch");
		
		String email = request.getParameter("email");
		String phoneNo = request.getParameter("phoneNo");
				
		out.print("<br><hr>Roll : "+roll);
		out.print("<br><hr>Name : "+name);
		out.print("<br><hr>Cgpa : "+cgpa);
		out.print("<br><hr>College : "+college);
		out.print("<br><hr>Branch : "+branch);
		out.print("<br><hr>Email : "+email);
		out.print("<br><hr>Phone No : "+phoneNo);
	}
}





