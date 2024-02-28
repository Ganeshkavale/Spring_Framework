package com.sapours.crud_controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DisplayStudent extends HttpServlet {
 
     public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {  

         PrintWriter outWeb = res.getWriter();  
         
         outWeb.println("<span style='color: red;margin-left:100px; font-size:30px;'><u>Student Information<u></span>");
         
         outWeb.println("<span style='margin-left:1000px; text-decoration: none; color: red; font-size:20px;'> <a href='StudentInfo.jsp'>BACK TO CRUD OPERATION</a> </span>");
            
         res.setContentType("text/html");  
         
         outWeb.println("<html><body>"); 
         
         try {  
        	 
             Class.forName("com.mysql.cj.jdbc.Driver"); 
             
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_student", "root", "root");

             Statement stmt = con.createStatement();  
             
             String display = "select * from student";
             
             ResultSet rset = stmt.executeQuery(display);  
             
             outWeb.println("<table border= 2px style='background-color: Lightgray; color:Black; margin-left:100px; border-collapse: collapse;'>");  
             
             outWeb.println("<tr><th style='padding:10px;'>id</th style='padding:10px;'><th style='padding:10px;'>name</th><th>education</th><th>university</th><th>passYear</th><tr>");  
             
             while (rset.next()) {  
            	 
                 int id = rset.getInt("id");  
                 
                 String name =rset.getString("name");  
                 String education = rset.getString("education");   
                 String university = rset.getString("university");
                 int  passingYear= rset.getInt("passYear");
                 
                 outWeb.println("<tr ><td style='padding-left:50px;padding-top:20px;padding-right:50px'>" + id + "</td><td style='padding-left:50px;padding-top:20px;padding-right:50px'>" + name + "</td><td style='padding-left:50px;padding-top:20px;padding-right:50px'>" + education + "</td><td style='padding-left:50px;padding-top:20px;padding-right:50px'>" + university + "</td><td style='padding-left:50px;padding-top:20px;padding-right:50px'>" + passingYear + "</td></tr>");   
             }  
             outWeb.println("</table>");  
             
             
             outWeb.println("</body></html>");  
             
             con.close();  
            }  
             catch (Exception e) 
            {  
            	 outWeb.println("error");  
         }  
     }  
 }  

