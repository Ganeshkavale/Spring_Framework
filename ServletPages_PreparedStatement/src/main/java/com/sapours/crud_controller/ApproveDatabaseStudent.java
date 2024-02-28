package com.sapours.crud_controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Scanner;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapours.crud_dao.StudentDao;
import com.sapours.crud_designcopy.Student;


public class ApproveDatabaseStudent extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
					
		String username = req.getParameter("username");
					
		String password = req.getParameter("password");
		
		StudentDao dao = new StudentDao();
		
		resp.setContentType("text/html");
		
		PrintWriter outWeb = resp.getWriter();
		
		try {
				dao.approvedStudentscredentials(username,password);
				
				RequestDispatcher rd = req.getRequestDispatcher("ApprovedStudentDatabase.jsp");
				
				outWeb.print("<h3>Student Database Created Successfully!</h3>");
				
				rd.include(req, resp);
				
				
		} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
				e.printStackTrace();
		}
					
	}
}
