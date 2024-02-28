<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	#welcome{
	
	font-size: 20px;
	color: red;
	
	}
	#tb{
	
	color: green;
	font-size: 15px;
	margin: auto auto;
	
	
	
	}
	
 
 .out2{
 	
 	border: 2px Violet dashed;
 	
 	color: gray;
 	
 	background-color: LightGray;

 	
 	height: 210px;
 	
 	width: 500px;
 	
 	margin-left: 400px;
 	margin-top: 50px;
 	
 	border-radius: 10px;
 	
 
 }
 
 #subm{
 
 margin-left: 110px;
 
 }
 
 .slog:hover {
 	
 	color: #006400;
 	background-color: pink;
 
 }
 .slog{
 
 color: purple;
 background-color: bisque;
 border: 1px solid red;
 border-radius: 5px;
 height: 30px;
 width: 120px;
 
 }
 #admin{
 
 	margin-left: 500px;
 	color: purple;
 	font-size: 30px;
 	margin-left: 400px; 
 
 }
 body{
 	background-color: 	#00CED1;
 
 }
 

</style>


</head>
<body>

<form action="adminLoginPage" method="post">


<p id="admin"> <u> ADMIN LOGIN :  </u> </p>
<div class="out2" >
	<div id="in">
		<table id="tb">	
		
		<p id="welcome"> <marquee>Welcome To Admin Login Page </marquee></p>
					
			<tr>
				<td> <label>Admin Username: </label> </td>
				<td> <input type="text" name="usernameAdm" > </td>
			</tr>
			 
			<tr>
				<td> <label>Admin Password: </label> </td>
				<td> <input type="password" name="passwordAdm"> </td>
			</tr>	
		
		</table> <br> <br>
	<div id="subm">	<input type="submit" value="Admin Login" class="slog">  </div>
		
	</div>	
	
</div>

</form>

</body>
</html>