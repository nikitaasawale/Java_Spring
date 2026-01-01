<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="com.Model.User"%>
<%@page import="java.util.List"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <% List<User> list=(List<User>)request.getAttribute("users");%>
     <table border="1">
       <tr>
       <th>UserId</th>
       <th>UserName</th>
       <th>Password</th>
       <th>Name</th>
       <th>Address</th>
       <th>Age</th>
       <th>Delete</th>
       <th>Edit</th>
       </tr>
       
       <tr>
       <%for(User user:list){ %>
       <td><%=user.getUid() %></td>
       <td><%=user.getUn() %></td>
       <td><%=user.getPs() %></td>
       <td><%=user.getName() %></td>
       <td><%=user.getAddress() %></td>
       <td><%=user.getAge()%></td>
       <td>
       <form action="deleteUser">
       <input type="hidden" name="userId" value="<%=user.getUid()%>">
       <input type="submit" value="Delete">
       
       </form>
       </td>
       <td>
       <form action="editUser">
       <input type="hidden" name="userId" value="<%=user.getUid()%>">
       <input type="submit" value="Edit">
       </form>
       
       </tr>
       
       <%
       } 
       %>
     </table>
</body>
</html>