<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
body{font-family:Arial,Helvetica,sans-serif;}
form{
border:3px solid #f1f1f1;
}
input[type=text],input[type=password]{
width:100%;
padding:12px 20px;
margin:8px 0;
display:inline-block;
border:1px solid #ccc;
box-sizing:border-box;
}
button{
background-color:#04AA6D;
color:white;
padding:14px 20px;
margin:8px 0;
border:none;
cursor:pointer;
width:100%;
}
button:hover{
opacity:0.8;
}
.cancelbtn{
width:auto;
padding:10px 18px;
background-color:#f44336;
}
.imgcontainer{
text-align:center;
margin:24px 0 12px 0;
}
img.avtar{
width:40%;
border-radius:50%;
}
.container{
padding:16px;
}
span.psw{
float:right;
padding-top:16px;
}
@media screen and (max-width:300px){
span.psw{
display:block;
float:none;
}
.cancelbtn{
width:100%;
}
}
</style>
</head>
<body>
<h2>Login form</h2>
<form action="log">
<div class="imgcontainer">
<img alt="Avatar" src="https://png.pngtree.com/png-vector/20191110/ourmid/pngtree-avatar-icon-profile-icon-member-login-vector-isolated-png-image_1978396.jpg" class="avatar">
</div>

       <div class="container">  
       <label for="un"><b>UserName</b></label>
       <input type="text" placeholder="Enter Username" name="un" required>
       <label for="ps"><b>Password</b></label>
       <input type="text" placeholder="Enter the password" name="ps" required>
       <button type="submit">Login</button>
       <label>
       <input type="checkbox" checked="checked" name="remember"> Remember me 
       </label>
       </div> 
       <div class="container" style="background-color:#f1f1f1">
       <button type="button" class="cancelbtn">Cancel</button>
       <span class="ps">Forgot <a href="#">password?</a></span>
       </div>
</form>

</body>
</html>