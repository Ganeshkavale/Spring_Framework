package com.sapours.crud_login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sapours.crud_connection.ConnectionClass;

public class Validation {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		getValidation("", "");
	}

	public static boolean getValidation(String username,String password) throws ClassNotFoundException, SQLException {
		
		
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

