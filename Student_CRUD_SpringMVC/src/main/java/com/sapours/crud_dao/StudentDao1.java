package com.sapours.crud_dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.jdbc.core.RowMapper;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.sapours.crud_designcopy.Student;

public class StudentDao1 {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void save(Student student) {
		  String sqlQuery = "insert into student(id, name, education, university, passYear) " +
		                    "values (?, ?, ?, ?, ?)";
		  Object[] data = {student.getId(),  student.getName(), student.getEducation(),  student.getUniversity(),  student.getPassYear()};
		  jdbcTemplate.update(sqlQuery, data);
		  
		  System.out.println("<-----------------------------  DATA STORED SUCCESSFULLY  ------------------------------>");
	}
	public void deleteStudentDataById(int id) {
		
		String sqlQuery = "delete from student where id="+id+"";
		jdbcTemplate.update(sqlQuery);
		
		 System.out.println("<-----------------------------  DATA DELETED SUCCESSFULLY  ------------------------------>");
	}
	public void updateStudentDataById(Student student){  
	    String sqlQuery="update student set name='"+student.getName()+"', education='"+student.getEducation()+"', university='"+student.getUniversity()+"', passYear="+student.getPassYear()+" where id="+student.getId()+"";  
	   jdbcTemplate.update(sqlQuery);	    
	}  
	
	public List<Student> displayStudent() {
		List<Student> list = jdbcTemplate.query("SELECT * FROM student", new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student = new Student();

				student.setId(rs.getInt("id"));
				student.setName(rs.getString("name"));
				student.setEducation(rs.getString("education"));
				
				student.setUniversity(rs.getString("university"));
				student.setPassYear(rs.getInt("passYear"));
				
				return student;
			}
		});

		return list;
	}
	
	public Student getStudentById(int id){    
	    String sql="select * from student where id=?";    
	    return jdbcTemplate.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Student>(Student.class));    
	}  
	
	
	public boolean getValidation(String username,String password) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");		
		
		String url = "jdbc:mysql://localhost:3306/login";
		
		String username1 = "root";
		
		String password1 = "root";	
		
		Connection con = DriverManager.getConnection(url,username1,password1);		

		String validation = "SELECT * FROM login where username=? and password=?";
		
		PreparedStatement pstat = con.prepareStatement(validation);
		
		pstat.setString(1, username);
		pstat.setString(2, password);
		
		ResultSet rs = pstat.executeQuery();
		
		if(rs.isBeforeFirst()) {
			return true;
		}
	
		return false;
		// TODO Auto-generated method stub	
	}
}
