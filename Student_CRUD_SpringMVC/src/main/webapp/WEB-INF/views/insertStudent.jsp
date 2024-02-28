<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student to Database</title>

<style type="text/css">
	
	.data{
		text-decoration: none;
		color: #654321;
		
	}
	.data1{
		text-decoration: none;
		color: purple;
		background-color: #99FF66;
		font-weight: bold;
		width: 100px;
		height: 30px;
		border-radius: 7px;
	
	}
	.data2{
		text-decoration: none;
		color: purple;
		font-weight: bold;
		background-color: #E666FF;
		height: 30px;
		border-radius: 7px;
		
	
	}
	.data3{
		text-decoration: none;
		color: purple;
		font-weight: bold;
		background-color: #66FFE6;
		width: 85px;
		height: 30px;
		border-radius: 7px;
		
	
	}
	.data4{
		text-decoration: none;
		color: purple;
		font-weight: bold;
		background-color: Lightgray;
		width: 85px;
		height: 30px;
		border-radius: 7px;
		
		
	
	}
	 #out{
 	
 	border: 2px Violet dashed;
 	
 	color: Green;
 	
 	background-color: LightGray;

	border-radius: 10px;
 	
 	height: 300px;
 	
 	width: 500px;
 	
 	margin-left: 400px;
 	margin-top: 50px;
 	}
 	#in{
 	und colors in css
 	
	margin-top: 20px; 	
 	
 	}
 	#welcome{
 		
 		color: red;
 		font-size: 25px;
 		font-family: Serif	Times New Roman;
 		letter-spacing: 3px;
 	
 	
 	}
 	
 	.data1:hover {
 		
 		background-color:  bisque;
 		color: Black;
 	}
 	.data2:hover {
 		
 		background-color:  bisque;
 		color: Black;
 	}
 	.data3:hover {
 		
 		background-color:  bisque;
 		color: Black;
 	}
 	.data4:hover {
 		
 		background-color:  bisque;
 		color: Black;
 	}
 	body{
 	
 	background-color: #00DDFF;
 	
 	}
 	#signout{
 		
 		height: 25px;
 		width: 80px;
 		background-color: #AFEEEE;
 		border: 1px #FFDAB9 solid;
 		border-radius: 10px;
 		margin-left: 1100px;
 		margin-top: 50px;
 		
 	
 	}
 	#signout:hover{
 	
 		color:#808000;
 		background-color: #FFE4E1;
 	
 	}
 	#til{
 	
 		color: red;
 		font-size: 20px;
 		margin-left:30%;
 	
 	}
 	

</style>


</head>
<body>


<form action="home1" method="post"> 
	<input class="data4" type="submit"  value="Home"/> 
</form>

<form action="insertStudent" method="POST">
<p id = "til">Student data added successfully!</p>
<div id="signout"><a href="LoginPage.jsp" style="color: red; text-align:center; margin-left:10px; text-decoration:none;">Sign out</a>   </div>  
<div id="out">

	<p id="welcome"> <marquee> CRUD OPERATION</marquee></p>

	<div id="in">
	<table>
	
		<tr> <td><label>Enter Student Id: </label></td> 
			 <td><input type="text" name="id" placeholder="type here" required> </td> 		
		</tr>
		
		<tr> <td><label>Enter Student Name: </label></td> 
			 <td><input type="text" name="name" placeholder="type here"> </td> 		
		</tr>
		
		<tr> <td><label>Enter Student Education: </label></td> 
			 <td><input type="text" name="education" placeholder="type here"> </td> 		
		</tr>
		
		<tr> <td><label>Enter Student University: </label></td> 
			 <td><input type="text" name="university" placeholder="type here"> </td> 		
		</tr>
		
		<tr> <td><label>Enter Student Passing Year: </label></td> 
			 <td><input type="text" name="passYear" placeholder="type here" required> </td> 		
		</tr>		
		
		<tr> <td> <br> <br> <input type="submit" value="ADD" class="data1">	 </td> 	
		
		</tr>
	
	</table>	
	</div>
	
</div>

	
</form>

</body>
</html>