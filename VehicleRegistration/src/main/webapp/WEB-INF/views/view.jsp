<!DOCTYPE html>
<html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app2.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<!-- <style>
body {
	background-image:
		url(${pageContext.request.contextPath}/resources/images/bank1.jpg);
	background-size: cover; /* <------ */
	background-repeat: no-repeat;
	background-position: center center;
	background-repeat: no-repeat;
}
</style> -->
<body>

	<h1>WELCOME TO KALINGA Transports</h1>

	<h4>VIEW ALL THE Users</h4>
	<c:forEach items="${userList }" var="user">
		<h3>${user.userName }</h3>
		<table class="table">
			<thead>
				<tr>
					<th>Vehicle Id</th>
					<th>Vehicle Code</th>
					<th>Vehicle Name</th>
					<th>Vehicle State</th>
					<th>Vehicle Country</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${user. getVehicles() }" var="vehicle">
					<tr>
						<td id="${user.userId }">${vehicle.vehicleId }</td>
						<td id="${user.userId }">${vehicle.vehicleCode }</td>
						<td id="${user.userId }">${vehicle.vehicleName }</td>
						<td id="${user.userId }">${vehicle.vehicleState }</td>
						<td id="${user.userId }">${vehicle.vehicleCountry }</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</c:forEach>
	<a href="/" class="btn btn-primary">Back</a>
</body>
</html>