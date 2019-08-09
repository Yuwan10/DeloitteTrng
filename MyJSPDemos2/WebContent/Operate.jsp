<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Operations</title>
</head>
<body>
<%!int num1,num2,sum,prod,diff;
 double div;
%>
<%
num1=Integer.parseInt(request.getParameter("num1"));
num2=Integer.parseInt(request.getParameter("num2"));
sum=num1+num2;
diff=num1-num2;
prod=num1*num2;
div=(double)num1/(double)num2;
session.setAttribute("sum", sum);
session.setAttribute("diff", diff);
session.setAttribute("prod", prod);
session.setAttribute("div", div);
%>
<jsp:forward page="Result.jsp" ></jsp:forward>
</body>
</html>