<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:form action="customerDetailsbyId.do">
 
    <table cellspacing="10" cellpadding="10" align="center">
    <tr><td>Customer Id </td> <td> <f:input type="text" path="customerId" name="customerId" id="customerId"></f:input></td></tr>
     <tr><td><input type="submit" value="Search"></td> <td> <input type="reset"></td></tr>
    <tr><td>Customer Name </td><td> <f:input type="text" path="customerName" name="customerName" id="customerName"></f:input></td></tr>
    <tr><td>Customer Address </td><td>
        <f:input type="text" path="customerAddress" name="customerAddress"></f:input>
        </td></tr>     
    <tr><td>Bill Amount </td> <td> <f:input type="text" path="billAmount" name="billAmount" id="billAmount"></f:input></td>
        </tr>
      
    </table>
</f:form> 
</body>
</html>