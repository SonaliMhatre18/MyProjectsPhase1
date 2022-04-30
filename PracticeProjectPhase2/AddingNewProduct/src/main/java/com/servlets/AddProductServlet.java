package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.entity.EProduct;
import com.util.HibernateUtil;

/**
 * Servlet implementation class AddProductServlet
 */
@WebServlet("/add-product")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddProductServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String productName = request.getParameter("name");
		String productPrice = request.getParameter("price");

		// Step 1-> Get session factory
		SessionFactory sf = HibernateUtil.buildSessionFactory();

		// Step 2-> Get session object
		Session session = sf.openSession();

		// Step 3-> Get transaction object and begin transaction
		Transaction tx = session.beginTransaction();

		// Step 4-> Create and populate entity object
		EProduct product = new EProduct();
		product.setName(productName);
		product.setPrice(Double.parseDouble(productPrice));

		// Step 5->
		session.save(product);

		tx.commit();

		out.println("<h3> Product is created successfully ! <h3>");
		session.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
				doGet(request, response);
	}

}
