<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<form action="Validate.jsp">
Number 1: <input type="text" name="username"><br/>
Number 2: <input type="password" name="passwrod"><br/>
<input type="submit" value="login">
<%
String errorMessage=(String)session.getAttribute("errorMsg");
if(errorMessage== null)
  errorMessage=" ";
%>
</br>
<font color="red"><%=errorMessage %></font>
</form>
</head>
<body>

</body>
</html>