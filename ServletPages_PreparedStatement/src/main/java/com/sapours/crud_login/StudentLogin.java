package com.sapours.crud_login;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentLogin extends HttpServlet{ 

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String username = req.getParameter("username");
		
		String password = req.getParameter("password");
		
		PrintWriter outWeb = resp.getWriter();
		
		resp.setContentType("text/html");
		RequestDispatcher rd;
				
		try {
			if(Validation.getValidation(username, password)) {
				
		//		outWeb.print("<h3><marquee>You are successfully entered in the world of Programming!!</marquee><h3>");
				
				rd = req.getRequestDispatcher("StudentInfo.jsp");
				
				rd.include(req, resp);
				
			}else {
				
				outWeb.print("<p style='color:red; margin-left:100px;'>Please enter correct credentials!!</p>");
				rd = req.getRequestDispatcher("LoginPage.jsp");
				
				rd.include(req, resp);
			}
		} catch (ClassNotFoundException | SQLException | ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
}
