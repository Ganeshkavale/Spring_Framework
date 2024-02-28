<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Student Data</title>
<style type="text/css">
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
 	
	margin-top: 50px;
	margin-left: 80px; 	
 	
 	}
 	
 	#btn{
 		
 		color: white;
 		background-color: SlateBlue;
 		height: 30px;
 		width: 100px;
 		border-radius: 5px;
 		margin-top: 20px;
 		
 		
 		
 	}
 	#btn:hover {
 		
 		background-color:  bisque;
 		color: Black;
 		
 	}
 	#lab{
 	
 		font-size: 20px;
 	
 	
 	}
 	#title{
 	
 		color: red;
 		font-size: 22px;
 		letter-spacing: 3px;
 		word-spacing: 5PX;
 	
 	}
 	body{
 	
 	background-color: #FF0000;
 	
 	}
 	 .homee{
 	
 		background-color: Bisque  ;
 		border-radius: 15px red solid;
 		font-size: 20px;
 		margin-top: 50px;
 		margin-left: 20px;
 	
 	}
 	.disp{
 	
 		background-color: Bisque  ;
 		border-radius: 15px red solid;
 		font-size: 20px;
 		margin-top: 10px;
 		margin-left: 20px;
 	
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


<form action="deleteStudentById" method = "post">
<div id="out">

<p id="title"> <marquee>DELETE STUDENT DATA BY USING ID</marquee></p>

	<div id="in">
	<table>
	
		<tr> <td><label id="lab">Enter Student Id: </label></td> 
			 <td><input type="text" name="id" required placeholder="type here"> </td> 		
		</tr>
		
		<tr> <td><input type="submit" value="DELETE" id="btn"> </td> 	
		
		</tr>
	
	</table>			
	</div>
		
</div>
</form>


</body>
</html>