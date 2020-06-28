package bank.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bank.db.Customer;
import bank.model.CustomerService;

@WebServlet("/bank.controller.Withdraw")
public class Withdraw extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		Customer c = new Customer();

		c.setAccno(Long.parseLong(request.getParameter("accno")));
		c.setAmount(Double.parseDouble(request.getParameter("amount")));

		int status = CustomerService.doWithdraw(c);
		if (status == -1)
			out.print("Account does not Exists");
		else if (status == 0)
			out.print("Error in Updation");
		else
			out.print("Account Updated Successfully");

	}
}
