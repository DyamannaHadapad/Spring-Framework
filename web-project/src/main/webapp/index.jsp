<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>iceCream</title>


<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<style type="text/css">
.footer {
	position: fixed;
	font-size: 25px;
	left: 0;
	bottom: 0;
	width: 100%;
	height: 10%;
	background-color: black;
	color: white;
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
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="#"> <img
			src="https://www.x-workz.in/Logo.png" width="100" height="50" alt="">
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="#">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
				<form class="form-inline my-2 my-lg-0">
					<input class="form-control mr-sm-2" type="search"
						placeholder="Search" aria-label="Search">
					<button class="btn btn-outline-success my-2 my-sm-0" type="submit"><a href="search.jsp">Search</a></button>
				</form>
		</div>
	</nav>
	<h1 style="color: black;" align="center">INFORMATION OF ICECREAM</h1>
	<h6 style="color: green;"align="center">${message}</h6>
	<h6 style="color: red;"align="center">${error}</h6>	
	<form action="send" method="post" >	
		<br>
		<table align="center">
			<tr>
				<td><b>Type:</b></td>
				<td><input type="text" name="type" placeholder="Enter Type"
					value="${dto.type}"></td>
			</tr>
			<tr>
				<td><b>Brand:</b></td>
				<td><input type="text" name="brand" placeholder="Enter Brand"
					value="${dto.brand}"></td>
			</tr>
			<tr>
				<td><b>Flauor</b></td>
				<td><input type="text" name="flauor" placeholder="Enter Flauor"
					value="${dto.flauor}"/></td>
			</tr>
			<tr>
				<td><b>Price</b></td>
				<td><input type="text" name="price" placeholder="Enter Price"
					value="${dto.price}"/></td>
			</tr>
			<tr>
				<td><b>Quantity</b></td>
				<td><input type="text" name="quantity"
					placeholder="Enter Quantity" value="${dto.quantity}"/></td>
			</tr>
			<tr>
				<td><b></b><input class="btn btn-danger" type="submit"
					value="send" ></b></td>
			</tr>
		</table>
	</form>
	<style type="text/css">
body {
	background-image:
		url("https://images.pexels.com/photos/1670187/pexels-photo-1670187.jpeg?auto=compress&cs=tinysrgb&w=400 ");
	width: 100%;
	height: 0%;
	background-size: 100%;
}
<
script






 






src












="
https












:
//












code












.jquery












.com
/












jquery-3












.2












.1












.slim












.min












.js












"
integrity












="
sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr
/












rE9
/












Qpg6aAZGJwFDMVNA
/












GpGFF93hXpG5KkN












"
crossorigin












="
anonymous












"
>
</
script
>
<
script







		






src












="
https












:
//












cdn












.jsdelivr












.net
/












npm
/












popper












.js












@
1












.12












.9
/












dist
/












umd
/












popper












.min












.js












"
integrity












="
sha384-ApNbgh9B
+
Y1QKtv3Rn7W3mgPxhU9K
/












ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q












"
crossorigin












="
anonymous












"
>
</
script
>
<
script







		






src












="
https












:
//












cdn












.jsdelivr












.net
/












npm
/












bootstrap












@
4












.0












.0
/












dist
/












js
/












bootstrap












.min












.js












"
integrity












="
sha384-JZR6Spejh4U02d8jOt6vLEHfe
/












JQGiRRSQQxSfFWpi1MquVdAyjUar5
+
76PVCmYl












"
crossorigin












="
anonymous












"
>
</
script
>
</
body
>
</
html
>
