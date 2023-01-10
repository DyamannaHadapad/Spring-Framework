<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>chappal-shop</title>

<style>
body {
	background-color: orange;
}

.login-box {
	position: absolute;
	top: 55%;
	left: 50%;
	width: 32 0px;
	padding: 20px;
	transform: translate(-50%, -50%);
	background: white;
	box-shadow: 0 15px 25px rgba(143, 124, 236, 0.7);
	border-radius: 20px;
}

.footer {
	position: fixed;
	font-size: 18px;
	left: 0;
	bottom: 0;
	width: 100%;
	height: 10%;
	background-color: black;
	color: silver;
	text-align: center;
	background-color: black;
	left: 0;
}
</style>
</head>
<body>

	<div class="footer">
		<p>&copy Dyamanna2022Copyright</p>
	</div>
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<a class="navbar-brand" href="#"><img
			src="https://www.x-workz.in/Logo.png" class="img-fluid" width="100"
			height="50"></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
			<div class="navbar-nav">
				<a class="nav-item nav-link active" href="#" style="color: white;">Home
					<span class="sr-only">(current)</span>
				</a> <a class="nav-item nav-link" href="#" style="color: white;">Features</a>
				<a class="nav-item nav-link" href="#" style="color: white;">Pricing</a>
				<a class="nav-item nav-link disabled" href="#" style="color: white;">Disabled</a>
			</div>
		</div>
	</nav>
	<h1 align="center">Information Of Chappal</h1>
	<br>
	<p class="text-success" align="center">${message}</p>
	<p class="text-danger" align="center">${error}</p>
	<form action="save" method="post">
		<div class="login-box">
			<div class="user-box">
				<b style="color: black; font-size: medium;">Brand</b><br> <input
					type="text" name="brand" value="${dto.brand}"
					placeholder="Enter brand">
			</div>
			<br>
			<div>
				<b style="color: black; font-size: medium;">Price</b><br> <input
					type="text" name="price" value="${dto.price}"
					placeholder="Enter price"><br>

			</div>
			<br>
			<div>
				<label style="color: black; font-size: medium;" name="color"><b>color</b></label>
				<select>
					<option value="selecte">----select brand----</option>
					<option value="red">Red</option>
					<option value="black">Black</option>
					<option value="white">White</option>
					<option value="gray">Gray</option>
					<option value="blue">Blue</option>
				</select> <br> <label style="color: black; font-size: medium;"
					name="size"><b>Size</b></label> <select>
					<option value="select">----select size----</option>
					<option value="7">7</option>
					<option value="8">8</option>
					<option value="9">9</option>
					<option value="10">10</option>
					<option value="11">11</option>

				</select>
			</div>
			<label style="color: black; font-size: medium;" name="gender"><b>Gender</b></label>
			<input type="radio" name="male" value="male">Male <input
				type="radio" name="female" value="female">Female <input
				type="radio" name="other" value="other">Other <br>
			<button type="submit" class="btn btn-outline-success">Save</button>
		</div>

	</form>
	<style type="text/css">
body {
	background-image: url("");
	width: 80%;
	height: 0%;
	background-size: 100%;
}
</style>
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
</body>
</html>

