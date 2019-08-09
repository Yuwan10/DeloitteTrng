<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Sum is: <%= session.getAttribute("sum") %> </br>
Diff is: <%= session.getAttribute("diff") %> </br>
Product is: <%= session.getAttribute("prod") %> </br>
Division: <%= session.getAttribute("diff") %> </br>
<a href="Index3.html">Go to Index</a>

</body>
</html>