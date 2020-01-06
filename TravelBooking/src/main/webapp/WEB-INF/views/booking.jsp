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
	background-color: rgba(201, 76, 76, 0.3);
}
</style>
</head>
<body>
	<div class="container">
		<h1>Booking FORM</h1>
		<ol class="breadcrumb">
			<li class="breadcrumb-item"><a href="/">Home</a></li>
			<li class="breadcrumb-item"><a href="/userregistration">Register
					User</a></li>
			<li class="breadcrumb-item active">Booking</li>
		</ol>
		<form class="form" action="insertbooking" method="post"
			onsubmit="return validate()">
			<div class="form-group">
				<label for="userName">User Name:</label> <select name="userId"
					class="form-control" id="userId" required>
					<c:forEach var="user" items="${users}" varStatus="status">
						<option value="${user.userId }">${user.userName}</option>
					</c:forEach>
				</select>
			</div>
			<br>
			<div class="form-group">
				<label for="fromPlace">From (Place Name) :</label> <input
					type="text" class="form-control" id="fromPlace"
					placeholder="Enter from place name" name="fromPlace" required
					maxlength="16">
				<div id="fromPlace1"></div>
			</div>
			<br>
			<div class="form-group">
				<label for="toPlace">To (Place Name) :</label> <input type="text"
					class="form-control" id="toPlace"
					placeholder="Enter from place name" name="toPlace" required
					maxlength="16">
				<div id="toPlace1"></div>
			</div>
			<br>
			<div class="form-group">
				<label for="doj">Date Of Journey:</label> <input type="date"
					class="form-control" id="doj" name="doj">
			</div>
			<br>
			<div class="form-group">
				<label for="distance">Distance (in km):</label> <input type="text"
					class="form-control" id="distance" placeholder="Enter distance "
					name="distance" required maxlength="16">
				<div id="distance1"></div>
			</div>
			<br>
			<div class="form-group">
				<label for="foodPreference">Food Preferences ::</label> <br> <input
					type="radio" name="foodPreference" value="vegeterian"
					onchange="validate1()">VEG<br> <input type="radio"
					name="foodPreference" value="nonvegeterian" onchange="validate1()">NON-VEG<br>
				<div id="foodPreference1"></div>
			</div>
			<br>
			<div class="form-group">
				<label for="travelWith">Traveling with</label><br> <input
					type="checkbox" name="travelWith" value="visa">VISA<br>
				<input type="checkbox" name="travelWith" value="passport">PASSPORT<br>
				<div id="travelWith1"></div>
			</div>
			<script>
				/* jQuery.validator.addMethod("lettersonly", function(value,
						element) {
					return this.optional(element) || /^[a-z\s]+$/i.test(value);
				}, "Only alphanumerical characters"); */
				$('form').validate({
					rules : {
						fromPlace : {
							required : true,
							minlength : 2,
							maxlength : 20,
							lettersonly : true,
						},
						toPlace : {
							required : true,
							minlength : 2,
							maxlength : 20,
							lettersonly : true,
						},
						distance : {
							required : true,
							minlength:3,
							range : [ 200, 10000 ],
						},
						foodPreference : {
							minlength : 1,
							required : true
						},
						travelWith : {
							required : true,
							minlength : 1
						}
					},
					messages : {
						fromPlace : {
							required : "Please enter only alphabets",
							minlength : "Min length is 3",
							maxlength : "Max length of name is 20",
							lettersonly : "Letters only please.!",
						},
						toPlace : {
							required : "Please enter only alphabets",
							minlength : "Min length is 3",
							maxlength : "Max length of name is 20",
							lettersonly : "Letters only please.!",
						},
						distance : {
							required : "Please enter only alphabets",
							minlength : "Min length is 3",
							maxlength : "Max length of name is 20",
							range : "Minimum distance is 200",
						},
						foodPreference : {
							minlength : "Please select atleast one",
							required : "Its mandatory to choose this"
						},
						travelWith : {
							minlength : "Please select atleast one",
							required : "Its mandatory to choose this"
						}
					}
				});
			</script>
			<div class="button">
				<button type="submit" class="btn btn-primary">BOOK</button>
			</div>
			<br>
		</form>
		<a href="/" class="btn btn-primary">Back</a>
	</div>
</body>
</html>
