<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>Bike</title>
<style>
body {
	background-image: url("");
	background-repeat: no-repeat;
	background-size: cover;
}

.login-box {
	position: absolute;
	top: 50%;
	left: 80%;
	width: 260px;
	padding: 20px;
	transform: translate(-50%, -50%);
	background: purple;
	box-shadow: 0 15px 25px rgba(143, 124, 236, 0.7);
	border-radius: 10px;
}

.text-box {
	position: absolute;
	top: 70%;
	left: 85%;
	width: 300px;
	padding: 20px;
	transform: translate(-50%, -50%);
	background: lime;
	box-shadow: 0 15px 25px rgba(143, 124, 236, 0.7);
	border-radius: 10px
}

h1 {
	text-align: center;
	background: scrollbar;
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
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<a class="navbar-brand" href="#"><img
			src="https://www.x-workz.in/Logo.png" class="img-fluid" width="100"
			height="50"></a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="#"
					style="color: white;">Home <span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#"
					style="color: white;">Link</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false" style="color: white;"> Dropdown </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="#">Action</a> <a
							class="dropdown-item" href="#">Another action</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#">Something else here</a>
					</div></li>
				<li class="nav-item"><a class="nav-link disabled" href="#"
					style="color: white;">Disabled</a></li>
			</ul>
			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>
	<h1>Details of Bike ShowRoom</h1>
	<p class="text-success" align="center">${message}</p>
	<p class="text-danger" align="center">${error}</p>
	<form action="send" method="post">
		<div class="login-box">
			<div>
				<label style="color: black; font-size: x-large;">Brand</label> <br>
				<input type="text" name="name" placeholder="Enter brand"
					value="${dto.name}" />
			</div>
			<div>
				<label style="color: black; font-size: x-large;">OwnerName</label> <input
					type="text" name="ownerName" placeholder="Enter ownername"
					value="${dto.ownerName}" />
			</div>
			<div>
				<label style="color: black; font-size: x-large;">Location</label> <input
					type="text" name="location" placeholder="Enter location"
					value="${dto.location}" />
			</div>
			<div>
				<label style="color: black; font-size: x-large;">Ambassador</label>
				<input type="text" name="ambassador" placeholder="Enter ambassador"
					value="${dto.ambassador}" />
			</div>
			<div>
				<input type="submit" value="send" class="btn btn-success btn-lg" />
			</div>
		</div>


		</div>
	</form>
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
		<p>
			<a href="dyamannah4.xworkz@gmail.com">dyamannah4.xworkz@gmail.com</a>
		</p>
	</footer>

</body>
</html>