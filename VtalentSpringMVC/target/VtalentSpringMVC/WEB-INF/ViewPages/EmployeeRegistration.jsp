<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee</title>
</head>
<body>
	<h1>Employee Registrtion Page</h1>
	<form>
		<p>*Please fill the form</p>
		<table cellspacing="25">
			<tr>
				<td>EmployeeId:</td>
				<td><input type="text" name="EmployeeId"><br></td>
			</tr>
			<tr>
				<td>EmployeeName:</td>
				<td><input type="text" name="EmployeeName"><br></td>
			</tr>
			<tr>
				<td>DateOfBirth:</td>
				<td><input type="date" name="DOB"><br></td>
			</tr>
			<tr>
				<td>Designation:</td>
				<td><select name="Designation">
						<option value="AssociateEngineer">AssociateEngineer</option>
						<option value="SoftwareEngineer">SoftwareEngineer</option>
						<option value="SeniorSoftwareEngineer">SeniorSoftwareEngineer</option>
						<option value="TeamLead">TeamLead</option></td>
			</tr>
			</select>
			<br>
			<tr>
				<td>CurrentCTC:</td>
				<td><input type="text" name="CurrentCTC"><br></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><input type="radio" name="gender" value="male" checked>male
					<input type="radio" name="gender" value="Female" checked>Female</td>
			</tr>
			<tr>
				<td><center>
						<input type="button" value="submit"> <input type="button"
							value="Cancel"><br></td>
				</center>
			</tr>
		</table>
		</form>
</body>
</html>