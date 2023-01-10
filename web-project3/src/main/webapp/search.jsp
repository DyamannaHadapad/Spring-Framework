<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bus-Stop</title>

<style>
body {
	background-color: white;
}

.login-box {
	position: absolute;
	top: 50%;
	left: 50%;
	width: 350px;
	padding: 40px;
	transform: translate(-50%, -50%);
	background: fuchsia;
	box-shadow: 0 15px 25px rgba(143, 124, 236, 0.7);
	border-radius: 10px;
}

footer {
	position: fixed;
	left: 0;
	bottom: 0;
	width: 100%;
	background-color: black;
	color: white;
	text-align: center;
}
</style>
</head>
<body>
	<div>
		<nav class="navbar navbar-light bg-light justify-content-between">
			<a class="navbar-brand"><img
				src="https://www.x-workz.in/Logo.png" class="img-fluid" width="100"
				height="50"></a>
			<form class="form-inline">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit"><a href="index.jsp">Home</a></button>
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit"><a href="search.jsp">Search</a></button>
			</form>
		</nav>
	</div>
	<form action="save" method="get">
		<div class="login-box">
			<b style="color: black; font-size: x-large;">State Name</b> <input
				type="text" name="stateName" placeholder="Enter stateName"
				value="${dto.stateName}" />
			<input type="submit" value="Search" class="btn btn-success btn-lg" />		
		</div>
	</form>
	<h4 class="text-danger" align="center">${error}</h4>
	
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
	<footer>
		<p>&copy Dyamanna2022Copyright</p>
		</p>
	</footer>
</body>
</html>