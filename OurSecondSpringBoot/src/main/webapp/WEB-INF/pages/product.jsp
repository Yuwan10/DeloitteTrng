<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:url var="addAction" value="/saveProduct" ></c:url>
<form:form action="${addAction}" modelAttribute="product">

<h2>Product Form</h2>
Product Id      : <form:input path="productId" name="productId"/><br/>
Product Name    : <form:input path="productname" name="productname"/><br/>
Product Quantity: <form:input path="quantity" name="quantity"/><br/>
Product Price   : <form:input path="price" name="price"/><br/>
<c:if test="${!empty product.productname}">
				<input type="submit" 
				formaction="add/update"
					value="<spring:message text="Edit Product" />" />
			</c:if>
			<c:if test="${empty product.productname}">
				<input type="submit"
					value="<spring:message text="Add Product"/>" />
			</c:if>
</form:form>
${message}
<br>
<h3>Products List</h3>
<c:if test="${!empty listProducts}">
	<table class="tg">
	<tr>
		<th width="80">Product ID</th>
		<th width="120">Product Name</th>
		<th width="120">Quantity</th>
		<th width="120">Price</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listProducts}" var="product">
		<tr>
			<td>${product.productId}</td>
			<td>${product.productname}</td>
			<td>${product.quantity}</td>
			<td>${product.price}</td>
			<td><a href="<c:url value='/edit/${product.productId}' />" >Edit</a></td>
			<td><a href="<c:url value='/remove/${product.productId}' />" >Delete</a></td>
		</tr>
	</c:forEach>
	</table>
	
</c:if>

</body>
</html>