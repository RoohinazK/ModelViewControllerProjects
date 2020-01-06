<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
</style>
</head>
<body>
	<div class="container">
		<h1>WELCOME TO UPDATE</h1>
		<form class="form" action="update1" method="post"
			onsubmit="return validate()">

			<div class="form-group">
				<label for="fromPlace">From Place :</label> <input type="text"
					class="form-control" id="fromPlace"
					placeholder="Enter from place name" name="fromPlace" required
					onchange="validate()">
			</div>
			<br>
			<div class="form-group">
				<label for="toPlace">To Place :</label> <input type="text"
					class="form-control" id="toPlace" placeholder="Enter to place name"
					name="toPlace" value="${booking.toPlace }"  required onchange="validate()">
			</div>
			<br>
			<div class="form-group">
				<label for="doj">DOJ:</label> <input type="date"
					class="form-control" id="doj" name="doj" value="${booking.doj }"
					disabled="disabled">
			</div>
			<br>
			<div class="form-group">
				<label for="distance">Distance :</label> <input type="text"
					class="form-control" id="distance" placeholder="Enter distance "
					name="distance" required maxlength="16" onchange="validate1()">

			</div>
			<br>
			<div class="button">
				<button type="submit" class="btn btn-primary">Book</button>
			</div>
			<br>
		</form>
		<a href="/" class="btn btn-primary">Back</a>
	</div>
</body>
</html>
