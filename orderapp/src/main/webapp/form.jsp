<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Form</title>
<style type="text/css">
.errorClass{
color:red;
}</style>
</head>
<body>
	<h2>Product Form</h2>
	<form:form action="addproduct.do" modelAttribute="product"><!-- commandName maps the form to the class object specified -->
	Name <form:input path="name"/> <br/><form:errors path="name" cssClass="errorClass"> </form:errors>
	Category <form:input path="category"/><form:errors path="category" cssClass="errorClass"> </form:errors> <br/>
	Price <form:input path="price"/><form:errors path="price" cssClass="errorClass"> </form:errors> <br/>
	Count <form:input path="count"/><form:errors path="count" cssClass="errorClass"> </form:errors> <br/>
	<button type="submit">Add product</button>
	</form:form>
</body>
</html>