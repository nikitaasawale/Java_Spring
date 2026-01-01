<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit User</title>
</head>
<body>
<h2>Edit User</h2>
<form action="updateUser" method="post">
<label>UserId</label>
<input type="hidden" name="uid" value="${user.uid }"/>
<br><br>
<label>UserName</label>
<input type="text" name="un" value="${user.un }"/>
<br><br>
<label>Password:</label>
<input type="text" name="ps" value="${user.ps }"/>
<br><br>
<label>Name</label>
<input type="text" name="name" value="${user.name }"/>
<br><br>
<label>Address:</label>
<input type="text" name="address" value="${user.address }"/>
<br><br>
<label>Age:</label>
<input type="text" name="age" value="${user.age }"/>
<br><br>
<input type="submit" value="Update" />

</form>
</body>
</html>