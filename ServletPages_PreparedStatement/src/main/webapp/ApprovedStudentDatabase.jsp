<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style type="text/css">
	
	.data{
		text-decoration: none;
		color: #654321;
		
	}

	 #out{
 	
 	border: 2px Violet dashed;
 	
 	color: Green;
 	
 	background-color: LightGray;

 	
 	height: 300px;
 	
 	width: 500px;
 	
 	margin-left: 400px;
 	margin-top: 50px;
 	}
 	#in{
 	
	margin-top: 20px; 	
	margin-left: 60px;
 	
 	}
 	#welcome{
 		
 		color: red;
 		font-size: 25px;
 		font-family: Serif	Times New Roman;
 		letter-spacing: 3px;
 	
 	
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
 	body{
 	
 	background-color: #ADFF2F;
 	}
 	

</style>


</head>
<body>

<form action="approveStudentDatabase" method="post">
<div id="signout"><a href="Admin.jsp" style="color: red; text-align:center; margin-left:10px; text-decoration:none;">Sign out</a>   </div>  
<div id="out">

	<p id="welcome"> <marquee> APPROVE STUDENT DATABASE </marquee></p>

	<div id="in">
	<table>	
			<tr>
				<td> <label>Enter Username: </label> </td>
				<td> <input type="text" name="username" placeholder="type here"> </td>
			</tr>
			 
			<tr>
				<td> <label>Enter Password: </label> </td>
				<td> <input type="password" name="password" placeholder="type here"> </td>
			</tr>	
			
			<tr> <td> <br> <input type="submit" value="Approve" id="btn"> </td> 	
		
			</tr>
		
		</tr>
	
	</table>	
	</div>
	
</div>
</form>

</body>
</html>