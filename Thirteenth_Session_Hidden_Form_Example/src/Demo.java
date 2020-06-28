

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
@WebServlet("/Demo")
public class Demo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Demo() {
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
		
		out.print("<br><hr>Roll : "+roll);
		out.print("<br><hr>Name : "+name);
		out.print("<br><hr>Cgpa : "+cgpa);
		out.print("<br><hr>College : "+college);
		out.print("<br><hr>Branch : "+branch);
		
		out.print("<form action='Final'>");
			out.print("<pre>");
				out.println("<input type='hidden' name='roll' value="+roll+">");
				out.println("<input type='hidden' name='name' value="+name+">");
				out.println("<input type='hidden' name='cgpa' value="+cgpa+">");
				out.println("<input type='hidden' name='college' value="+college+">");
				out.println("<input type='hidden' name='branch' value="+branch+">");
				
				out.println("<br>Email : <input type='text' name='email'");
				out.println("<br>Phone No : <input type='text' name='phoneNo'");
				out.println("<br><input type='submit' value='SUBMIT'>");
			out.print("</pre>");
		out.print("</form>");
	}
}





