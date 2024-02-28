package com.sapours.crud_login;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AdminLogin extends HttpServlet{ 

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String usernameAdm = req.getParameter("usernameAdm");
		
		String passwordAdm = req.getParameter("passwordAdm");
		
		PrintWriter outWeb = resp.getWriter();
		
		resp.setContentType("text/html");
		RequestDispatcher rd;
				
		try {
		
			if(AdminValidation.getValidation(usernameAdm, passwordAdm)) {
				
					rd = req.getRequestDispatcher("ApprovedStudentDatabase.jsp");
				
					rd.include(req, resp);				
			} else {
				
				outWeb.print("<p style='color:red; margin-left:100px;'>Please enter correct credentials!!</p>");
				rd = req.getRequestDispatcher("Admin.jsp");
				
				rd.include(req, resp);
			}
		} catch (ClassNotFoundException | SQLException | ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}
}
