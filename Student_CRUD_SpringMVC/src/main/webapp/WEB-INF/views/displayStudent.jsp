<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
 
 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Student</title>
<style type="text/css">

.homee{
 	
 		background-color: Chartreuse ;
 		border-radius: 15px red solid;
 		font-size: 20px;
 		margin-top: 50px;
 		margin-left: 900px;
 		margin-top: 3px;;
 	
 	}
 	h1{
 	
 		font-size: 40px;
 		color: Chocolate ;
 	}
 	body{
 	
 	
 		background-color: LightCyan ;
 	}

</style>
</head>
<body>
<form action="home1" method="post"> 
	<input class="homee" type="submit"  value="Home"/> 
</form>


   <h1> Student List</h1>  
	<table border="2" width="70%" cellpadding="2">  
	<tr><th>Id</th><th>Name</th><th>Education</th><th>University</th><th>Passing Year</th><th>Update</th><th>Delete</th></tr>  
   <c:forEach var="student" items="${list}">   
   <tr>  
   <td>${student.id}</td>  
   <td>${student.name}</td>  
   <td>${student.education}</td>  
   <td>${student.university}</td>  
   <td>${student.passYear}</td> 
 <td>
 <form action="updateStudentById" method="post">
   <input class="data3" type="submit"  value="Update"/> 
</form> </td>  
  <td>
 <form action="deleteStudentById" method="post">
   <input class="data2" type="submit"  value="Delete"/> 
</form> </td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  


</body>
</html>