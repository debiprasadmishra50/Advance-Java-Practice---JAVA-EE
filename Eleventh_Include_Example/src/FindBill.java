import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/FindBill")
public class FindBill extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindBill() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		//response 1
		int cbill = Integer.parseInt(request.getParameter("cbill"));
		int pbill = Integer.parseInt(request.getParameter("pbill"));
		
		out.print("<br>FindBill Servlet<br>");
		out.print("<h1> Bill particulars... </h1><hr><hr>");
		out.print("<br>Current bill : "+cbill);
		out.print("<br>Previous Bill : "+pbill+"<hr>");
		request.setAttribute("unit_price", 3.50);
		
		//response 2
		RequestDispatcher rd = request.getRequestDispatcher("CalcBill");
		rd.include(request, response);
		
		RequestDispatcher rd1 = request.getRequestDispatcher("ShowBill");
		rd1.include(request, response);
		
		//response 3
		out.print("<br><hr><h5>Please Pay bill before 10th of every month..<hr></h5>");
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
