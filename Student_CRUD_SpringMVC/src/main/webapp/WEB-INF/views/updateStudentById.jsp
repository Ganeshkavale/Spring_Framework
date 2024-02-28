<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Student Data</title>


<style type="text/css">

	 #out{
 	
 	border: 2px Violet dashed;
 	
 	color: Green;
 	
 	background-color: LightGray;

	border-radius: 10px;
 	
 	height: 300px;
 	
 	width: 500px;
 	
 	margin-left: 400px;
 	margin-top: 90px;
 	}
 	#in{
 	
	margin-top: 30px;
	margin-left: 60px; 	
 	
 	}
 	#para{
 	
 		font-size: 20px;
 		color: red;
 		margin-left: 60px; 	
 	}
 	#btn{
 		
 		color: white;
 		background-color: SlateBlue;
 		height: 30px;
 		width: 100px;
 		border-radius: 5px;
 		
 		
 		
 	}
 	#btn:hover {
 		
 		background-color:  bisque;
 		color: Black;
 	}
 	
 	body{
 	
 	background-color: #00FF7F;
 	
 	}
 	.homee{
 	
 		background-color: Bisque  ;
 		border-radius: 15px red solid;
 		font-size: 20px;
 		margin-top: 50px;
 	
 	}
 	.disp{
 	
 		background-color: Bisque  ;
 		border-radius: 15px red solid;
 		font-size: 20px;
 		margin-top: 10px;
 	
 	}


</style>

</head>
<body>

<form action="home1" method="post"> 
	<input class="homee" type="submit"  value="Home"/> 
</form>

<form action="displayStudent" method="post"> 
	<input class="disp" type="submit"  value="Display"/> 
</form>

<form action="updateStudentById" method = "post">


<div id="out">

	<p id="para"> UPDATE DATA OF THE STUDENT </p>
	<div id="in">
	<table>
	
		<tr> <td><label>Enter Student Id: </label></td> 
			 <td><input type="text" name="id" required placeholder="type here"> </td> 		
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
			 <td><input type="text" name="year" placeholder="type here" required> </td> 		
		</tr>		
		
		<tr> <td> <br> <input type="submit" value="UPDATE" id="btn"> </td> 	
		
		</tr>
	
	</table>	
	</div>
		
</div>
</form>

</body>
</html>