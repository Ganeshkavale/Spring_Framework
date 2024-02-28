package com.sapours.crud_controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sapours.crud_dao.StudentDao;
import com.sapours.crud_designcopy.Student;

public class DeleteStudentById extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		PrintWriter outWeb = resp.getWriter();
			
		int id = Integer.parseInt(req.getParameter("id"));
					
		StudentDao dao = new StudentDao();
		
		resp.setContentType("text/html");
		
		Student s = new Student();	
		
		s.setId(id);		
	
		try {
				dao.deleteStudent(s);
				
				RequestDispatcher rd = req.getRequestDispatcher("StudentInfo.jsp");
				
				outWeb.print("<h3>Student information Deleted successfully!</h3>");
				
				rd.include(req, resp);
				
				
		} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
	}
}
