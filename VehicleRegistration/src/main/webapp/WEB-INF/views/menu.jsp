<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Example</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
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
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">KALINGA Vehicles</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="/">Home</a></li>
				<li class="active"><a href="/register">Register User </a></li>
				<li class="active"><a href="/add">Add Vehicles </a></li>
				<li class="active"><a href="/view">VIEW </a></li>
			</ul>
			<form class="navbar-form navbar-left" action="/action_page.php">
				<div class="form-group">
					<input type="text" class="form-control" placeholder="Search">
				</div>
				<button class="btn btn-default" type="submit">
					<i class="glyphicon glyphicon-search"></i>
				</button>
			</form>

			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><span class="glyphicon glyphicon-user"></span>
						Sign Up</a></li>
				<li><a href="#"><span class="glyphicon glyphicon-log-in"></span>
						Login</a></li>
			</ul>
		</div>
	</nav>
	<h2>Welcome To Kalinga Transportation</h2>
	<h3>This portal provides you the following:</h3>
	<h4>1.Registering Users</h4>
	<h4>2.Adding vehicles to users</h4>
	<h4>3.Viewing all the users</h4>
</body>
</html>
