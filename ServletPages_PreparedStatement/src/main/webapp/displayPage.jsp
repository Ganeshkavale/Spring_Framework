<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

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
 	
	margin-top: 60px;
	margin-left: 80px; 	
 	
 	}
 	
 	#btn{
 		
 		color: white;
 		background-color: SlateBlue;
 		height: 40px;
 		width: 100px;
 		border-radius: 5px;
 		font-weight: bold;
 		
 		
 		
 	}
 	#btn:hover {
 		
 		background-color:  bisque;
 		color: Black;
 	}
 	#data{
 	
 		font-size: 30px;
 	
 	}
 	
 	#data1{
 	
 		font-size: 20px;
 		color:red;
 	
 	}
 	body{
 	
 	background-color: #E6E6FA;
 	
 	}


</style>


</head>
<body>

<form action="displayPage" method="post">

<div id="out">

	<div id="in">
	
		<p id="data"> <u>Student data information</u></p>
		
		<p id="data1">Click on DISPLAY...</p>
	
		<input type="submit" value="DISPLAY" id="btn">
	</div>
		
</div>	
	
</form>	
</body>
</html>