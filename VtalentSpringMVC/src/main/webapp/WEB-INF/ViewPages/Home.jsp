<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC</title>
</head>
<body>
<h1>Spring MVC Application</h1>
<a href = "openingAnEmployeeReg">Registration</a>
<%
Object obj = request.getAttribute("insertResponseValue");
if(obj !=null){
	Integer itr = (Integer)obj;
	int result = itr.intValue();
	if(result > 0){
		out.print("Successfully inserted");
	}else{
		out.print("Try again");
	}
}
%>
</body>
</html>