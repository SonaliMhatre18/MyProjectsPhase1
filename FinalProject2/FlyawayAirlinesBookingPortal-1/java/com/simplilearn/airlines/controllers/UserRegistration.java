package com.simplilearn.airlines.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.simplilearn.airlines.dao.Dao;

public class UserRegistration extends HttpServlet {
	
	static  final long serialVersionUID = 1L;
	 public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String phno=request.getParameter("phno");
		String adno=request.getParameter("adno");
		
		HashMap<String,String> user=new HashMap<>();
		user.put("email", email);
		user.put("password", password);
		user.put("name", name);
		user.put("phno", phno);
		user.put("adno", adno);
		
		try {
			Dao dao=new Dao();
			boolean result=dao.insertUser(user);
			HttpSession session=((HttpServletRequest) request).getSession();
			if(result) {
				System.out.println(1);
				session.setAttribute("message", "User Added Successfully");
			}
			else {
				session.setAttribute("message","Invalid Details");
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		((HttpServletResponse) response).sendRedirect("UserPage.jsp");
	}

}
