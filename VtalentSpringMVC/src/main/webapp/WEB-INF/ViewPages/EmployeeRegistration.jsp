<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
</head>
<body>
	<h1>Employee Registrtion Page</h1>
	<form:form modelAttribute="employeeObj" action="EmployeeFormRequest" method="post">
		<p>*Please fill the form</p>
		<table cellspacing="25">
			<tr>
				<td>EmployeeId:</td>
				<td><input type="text" name="employeeId"><br></td>
			</tr>
			<tr>
				<td>EmployeeName:</td>
				<td><input type="text" name="employeeName"><br></td>
			</tr>
			<tr>
				<td>DateOfBirth:</td>
				<td><input type="date" name="employeeDOB"><br></td>
			</tr>
			
			<tr>
				<td><center>
						<input type="submit" value="submit"> <input type="button"
							value="Cancel"><br></td>
				</center>
			</tr>
		</table>
		</form:form>
</body>
</html>