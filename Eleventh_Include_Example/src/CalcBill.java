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
@WebServlet("/CalcBill")
public class CalcBill extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CalcBill() {
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
		double unit_price = (double) request.getAttribute("unit_price");
		
		double camount = cbill * unit_price;
		double pamount = pbill * unit_price;
		double balance = camount - pamount;
		
		out.print("<br>CalcBill Servlet<br>");
		out.print("<h3>Current Month Bill : "+camount+"</h3>");
		out.print("<h3>Previous Month Bill : "+pamount+"</h3>");
		out.print("<h3>Total amount you have to pay : "+balance+"</h3>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
