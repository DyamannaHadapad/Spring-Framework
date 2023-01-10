<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Temple</title>
<style type="text/css">
body{
background-image:url("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTGyqu14XLyO__M-eaqI8GQ_XzWaSgRWKetRGbkv4luEV59t_F5vJL4jrI0Zwsg8ShpC9M&usqp=CAU");
background-repeat: no-repeat;
background-size: cover;
}
.login-box{
        position: absolute;
        top: 60%;
        left: 50%;
        width:340px;
        padding: 15px;
        transform: translate(-50%,-50%);
        background:buttonhighlight;
        background-image :url("https://www.ikea.com/in/en/cat/picture-photo-frames-18746/")
        box-shadow: 0 15px 25px rgba(143,124,236, 0.7);
        border-radius:20px;
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
<footer>
 <a href="com" style="color: white;">dyamannah4.xworkz@gmail.com</a></p>
 </footer>
<nav class="navbar navbar-expand-lg navbar-light bg-dark">
  <a class="navbar-brand" href="#"><img src="https://www.x-workz.in/Logo.png" class="img-fluid" width="100" height="50"></a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="navbarNavAltMarkup">
    <div class="navbar-nav">
      <a class="nav-item nav-link active" href="#" style="color: white;"><a href="index.jsp">Home</a> <span class="sr-only">(current)</span></a>
      <a class="nav-item nav-link" href="#" style="color: white;">Features</a>
      <a class="nav-item nav-link" href="#" style="color: white;">Pricing</a>
      <a class="nav-item nav-link disabled" href="#" style="color: white;">Disabled</a>
    </div>
  </div>
</nav>

<h3 align="center"style="color:orange;">Details Of Temple</h3>
<p class="text-success" align="center">${message}</p>
<p class="text-danger" align="center">${error}</p>
<br>
<form action="save" method="post">
<div class="login-box" align="center">
<div class="user-box">
<b>Name</b><input type="text" name="name" value="${dto.name }" placeholder="Enter Name"><br>
</div>
<div>
<label><b>Location</b></label>
<select name="location">
<option value="">--select location--</option>
<option value="btm">BTM</option>
<option value="jayanagar">JAYANAGAR</option>
<option value="banashankari">BANASHANKARI</option>
</select><br>
</div>
<div>
<label><b>God</b></label>
<select name="god">
<option value="mainGod">--select-God--</option>
<option value="btm">HANUMAN</option>
<option value="jayanagar">SHIVA</option>
<option value="SAIBABA">SAI-BABA</option>
<option value="Ganesha">Ganesha</option>
<option value="Mallayya">Mallayya</option>
<option value="Laxmi">Laxmi</option>
</select>
</div>
<div>
<label align="center"><b>PinCode</b></label>
<select name="pincode">
<option value="">--select pincode--</option>
<option value="587203">587203</option>
<option value="567204">567204</option>
<option value="577205">577205</option>
</select>
</div>
<b>Fees</b><input type="text" name="fees" value="${dto.fees}" placeholder="Enter Fees"><br>
<b>OpenTime</b><input type="text" name="openTime" value="${dto.openTime}" placeholder="Enter Open-Time"><br>
<b>CloseTime</b><input type="text" name="closeTime" value="${dto.closeTime }" placeholder="Enter Close-Time"><br>
<div>
<input type="submit" value="save">
</div>
</div>

</form>
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>