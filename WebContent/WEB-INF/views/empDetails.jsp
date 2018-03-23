<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Details</title>
</head>
<body>
	<center style="color:blue">
		Employee Details
		<table border="1">
			<tr>
				<th>Employee Id</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Designation</th>
				<th>Email</th>
				<th>Mobile</th>
			</tr>
			<tr>
				<td>${employee.employeeId}</td>
				<td>${employee.firstName}</td>
				<td>${employee.lastName}</td>
				<td>${employee.designation}</td>
				<td>${employee.email}</td>
				<td>${employee.mobile}</td>
			</tr>
			
		</table>
	</center>
</body>
</html>