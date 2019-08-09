<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
          <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

</head>
<body>
<center>
<img src="imgprojlogo.png" height="100" width="100">

<body bgcolor="white" background="indexbg.jpeg" text="white">

<f:form action="/" modelAttribute="">
<table bgcolor="black" cellspacing="20" cellpadding="10" align="center">
<tr><td>Username</td><td><f:input type="text" path="userName" name="userName"/></td></tr>
<tr><td>Password</td><td><f:input type="password" path="password" name="password"/></td></tr>
<center><tr><td>    
</td><td><f:input type="submit" value="Signin!"/></td></tr></center>
<tr><td>Don't have an account?<a href="Signup.html">Signup</a>
<h5>2019 Inc.</h5></tr></td>
<br>
</table>
</f:form>
</center>
</body>
</html>