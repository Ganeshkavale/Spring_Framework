package com.sapours.crud_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.sapours.crud_connection.ConnectionClass;
import com.sapours.crud_designcopy.Student;



public class StudentDao {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	//	createStudentDatabase();
		
	//	createStudentTable();
		
	//	insertStudent();
	}

	
	
	public static  void createStudentDatabase() throws ClassNotFoundException, SQLException {
		
		Connection con = ConnectionClass.getConnection();
		
		String createDatabase = "create database database_student";
		
		PreparedStatement pstat = con.prepareStatement(createDatabase);
	
		pstat.executeUpdate();
		
		System.out.println("<============================= DATABASE CREATED SUCCESSFULLY ======================================>");
	}
	
	public static void createStudentTable() throws ClassNotFoundException, SQLException {
		
		Connection con = ConnectionClass.getConnection();
		
		String createTable = "create table student(id int, name varchar(50), education varchar(50), university varchar(50), passYear int, primary key(id))";
		
		PreparedStatement pstat = con.prepareStatement(createTable);
		
		pstat.executeUpdate();
		
	//	String drop = "drop database dtabase_student ";
		
	//	stat.execute(drop);
		
		System.out.println("<============================= TABLE CREATED SUCCESSFULLY ======================================>");
	}
	
	public void insertStudent(Student s) throws ClassNotFoundException, SQLException {
			
		Connection con = ConnectionClass.getConnection();
		
		String insert = "insert into student(id,name,education,university,passYear) values(?,?,?,?,?)";
		
		PreparedStatement pstat = con.prepareStatement(insert);		
		
		pstat.setInt(1, s.getId());
		pstat.setString(2, s.getName());
		pstat.setString(3, s.getEducation());
		pstat.setString(4, s.getUniversity());
		pstat.setInt(5, s.getPassYear());
		
		pstat.executeUpdate();
			
		System.out.println("<============================= DATA STORED SUCCESSFULLY ======================================>");
	}	
	
	public void approvedStudentscredentials(String username, String password) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");		
		
		String url = "jdbc:mysql://localhost:3306/login"; 
		
		String username1 = "root";
		
		String password1 = "root";	
		
		Connection con = DriverManager.getConnection(url,username1,password1);		
		
		String insert = "insert into login(username,password) values(?,?)";
		
		PreparedStatement pstat = con.prepareStatement(insert);		
	
		pstat.setString(1, username);
		pstat.setString(2,password);
	
		pstat.executeUpdate();
			
		System.out.println("<============================= STUDENT CREDENTIALS CREATED SUCCESSFULLY! ======================================>");
	}	
	
	public List<Student> displayStudents() throws ClassNotFoundException, SQLException {
		
		List<Student> list = new ArrayList<>(); 
		
		Connection con = ConnectionClass.getConnection();
		
		String display = "select * from student";
		
		PreparedStatement pstat = con.prepareStatement(display);		
		
		ResultSet ret = pstat.executeQuery();

		while(ret.next()) {
			
			Student s = new Student();

			s.setId(ret.getInt(1));
			s.setName(ret.getString(2));
			s.setEducation(ret.getString(3));
			s.setUniversity(ret.getString(4));
			s.setPassYear(ret.getInt(5));
			
			list.add(s);

		}
			
		System.out.println("<============================= DATA DISPLAYED SUCCESSFULLY ==========================================>");
		return list;
	}	
	
	public  void updateStudent(Student s) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");		
		
		String url = "jdbc:mysql://localhost:3306/database_student";
		
		String username = "root";
		
		String password = "root";	
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		String update = "update student set name = ?, education=?, university=?, passYear=?  where id = ?";
		
		PreparedStatement pstat = con.prepareStatement(update);
		
		pstat.setString(1, s.getName());
		
		pstat.setString(2, s.getEducation());
		
		pstat.setString(3, s.getUniversity());
		
		pstat.setInt(4, s.getPassYear());
		
		pstat.setInt(5, s.getId());
			
		pstat.execute();
			
		System.out.println("<============================= DATA UPDATED SUCCESSFULLY ======================================>");
	}	
	
	public  void deleteStudent(Student s) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");		
		
		String url = "jdbc:mysql://localhost:3306/database_student";
		
		String username = "root";
		
		String password = "root";	
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		String delete = "delete from student where id = ?";
		
		PreparedStatement pstat = con.prepareStatement(delete);
		
		pstat.setInt(1, s.getId());
			
		pstat.execute();
			
		System.out.println("<============================= DATA DELETED SUCCESSFULLY ======================================>");
	}

	
}
