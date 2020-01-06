<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Register Branch Page</title>
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
	background-color: #92a8d1;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Update Count FORM</h1>
		<form class="form" action="updateName" method="post"
			onsubmit="return validate()">
			<div class="form-group">
				<label for="verticalId">Vertical ID :</label> <input type="text"
					class="form-control" id="verticalId"
					value="${vertical.verticalName }" placeholder="Enter vertical ID "
					name="verticalId">
			</div>
			<div class="form-group">
				<label for="verticalName">Vertical Name :</label> <input type="text"
					class="form-control" id="verticalName"
					value="${vertical.verticalName }"
					placeholder="Enter vertical Name " name="verticalName" required
					maxlength="16">
			</div>
			<br>
			<div class="button">
				<button type="submit" class="btn btn-primary">Update</button>
			</div>
			<br>
		</form>
		<a href="/" class="btn btn-primary">Back</a>
	</div>
</body>
</html>




