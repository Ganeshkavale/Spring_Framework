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
	
 .out1{
 	
 	border: 2px Violet dashed;
 	
 	color: gray;
 	
 	background-color: LightGray;

	border-radius: 10px;
 	
 	height: 260px;
 	
 	width: 500px;
 	
 	margin-left: 400px;
 	margin-top: 100px; 
 	
 
 }
 
 
 #subm{
 
 margin-left: 110px;
 
 }
 #student{
 
 	color: purple;
 	font-size: 30px;
 	margin-left: 100px;
 
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
 
 body{
 
 background-color: #d0bdf4;
 }

 
 

</style>


</head>
<body>

<form action="loginPage" method="post">


<!-- <p id="student"> <u> STUDENT LOGIN :  </u> </p> -->
<div class="out1">
	<div id="in">
		<table id="tb">	
		
		<p id="welcome"> <marquee>Welcome To Student Login Page </marquee></p>
					
			<tr>
				<td> <label>Enter Username: </label> </td>
				<td> <input type="text" name="username" placeholder="write here"> </td>
			</tr>
			 
			<tr>
				<td> <label>Enter Password: </label> </td>
				<td> <input type="password" name="password"  placeholder="write here"> </td>
			</tr>	
		
		</table> <br> <br>
	<div id="subm">	<input type="submit" value="Student Login" class="slog">  </div>
		
	</div>	
</div>



</form>

</body>
</html>