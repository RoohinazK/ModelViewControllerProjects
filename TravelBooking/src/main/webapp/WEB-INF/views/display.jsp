<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Register Page</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>
<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/additional-methods.min.js"
	integrity="sha256-vb+6VObiUIaoRuSusdLRWtXs/ewuz62LgVXg2f1ZXGo="
	crossorigin="anonymous"></script>
<style>
body {
	background-color: hsl(89, 43%, 51%);
}
/* /*unvisited link*/
a:link {
	color: red;
}

/* visited link */
a:visited {
	color: green;
}

* /
	/* mouse over link */   
a:hover {
	color: hotpink;
}

/* selected link */
a:active {
	color: blue;
}
</style>
<body>
	<ol class="breadcrumb">
		<li class="breadcrumb-item"><a href="/">Home</a></li>
		<li class="breadcrumb-item"><a href="/userregistration">Register
				User</a></li>
		<li class="breadcrumb-item"><a href="/booking">Booking</a></li>
		<li class="breadcrumb-item active">Display</li>
	</ol>
	<div class="container">
		<h1>DISPLAY</h1>
		<form class="form" action="getbookings" method="post"
			onsubmit="return validate()">

			<div class="form-group">
				<label for="userName">USER Name :</label> <select name="userId">
					<c:forEach items="${users }" var="user">
						<option value="${user.userId}">${user.userName }
					</c:forEach>
				</select>
				<div id="userName1"></div>
			</div>
			<br>
			<div class="form-group">
				<label for="fromDate">FROM DATE :: </label><input type="date"
					name="fromDate" id="fromDate">
			</div>
			<br>
			<button type="submit">GET BOOKINGS</button>

			<script>
				$('form').validate({
					rules : {
						fromPlace : {
							required : true,
							minlength : 2,
							maxlength : 20,
							lettersonly : true,
						}
					}
				});
			</script>
		</form>
	</div>

	<div class="container">
		<form class="form" action="update" method="post"
			onsubmit="return validate()">
			<c:if test="${bookings!=null }">
				<table class="table">
					<thead>
						<tr>
							<th>Traveling To</th>
							<th>From</th>
							<th>Price</th>
							<th>Update</th>
					</thead>
					<tbody>
						<c:forEach items="${bookings }" var="b">
							<tr>
								<td id="${b.bookingId }">${b.bookingId }</td>
								<td id="${b.bookingId }">${b.fromPlace }</td>
								<td id="${b.bookingId }">${b.price }</td>
								<td><button type="submit" name="bookingId"
										value="${b.bookingId}">UPDATE</button></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</c:if>
		</form>
	</div>
</body>
</html>