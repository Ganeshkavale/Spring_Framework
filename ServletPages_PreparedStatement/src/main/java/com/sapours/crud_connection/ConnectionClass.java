package com.sapours.crud_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionClass {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");		
		
		String url = "jdbc:mysql://localhost:3306/database_student";
		
		String username = "root";
		
		String password = "root";
		
		Connection con = DriverManager.getConnection(url,username,password);
		
		return con;
	}
}