<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!String username;
Date d;
%>
<%
username= request.getParameter("username");
%>
<%
if(username.equals("jay"))
{d=new Date();
RequestDispatcher dispatcher= request.getRequestDispatcher("success.jsp");
dispatcher.include(request, response);
	}
else
{
	response.sendRedirect("name.html");
}

%>
Today's date is <%=d %>

</body>
</html>