<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
body{
font-family: Arial, Helvetica, sans-serif;
  background-color: black;
}
*{
box-sizing:border-box;
}
.container{
padding:16px;
background-color:white;
}
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}
input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}
.registerbtn {
  background-color: #04AA6D;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}
.registerbtn:hover {
  opacity: 1;
}
a {
  color: dodgerblue;
}
.signin {
  background-color: #f1f1f1;
  text-align: center;
}

</style>
</head>
<body>
<form action="reg">
<div class="container">
<h1>Register</h1>
<p>Please fill in this form to create an account.</p>
<hr>
<label for="un"><b>UserName</b></label>
<input type="text" placeholder="Enter User name" name="un" id="un" required>
<label for="ps"><b>Password</b></label>
<input type="password" placeholder="Enter Password" name="ps" id="ps" required>
<label for="name"><b> Name</b></label>
<input type="text" placeholder="Enter Name" name="name" id="name" required>
<label for="address"><b>Address</b></label>
<input type="text" placeholder="Enter Address" name="address" id="address" required>
<label for="age"><b>Age</b></label>
<input type="text" placeholder="Enter Age" name="age" id="age" required>
<hr>
<p>By creating an account you agree to our <a href="#">Terms and Privacy</a>.</p>
<button type="submit" class="registerbtn">Register</button>
</div>
<div class="container signin"> 
<p>Already have an account? <a href="#">Sign in</a>.</p>
</div>
</form>
</body>
</html>