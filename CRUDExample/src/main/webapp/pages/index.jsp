<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<title>Product Manager</title>
</head>
<body>
<div align="center">
    <h1>Product List</h1>
    <a href="/new">Create New Product</a>
    <br/><br/>
    <table border="1" cellpadding="10">
            <tr>
                <th>Product ID</th>
                <th>Name</th>
           		<th>Brand</th>
                <th>Made In</th>
                <th>Price</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="pr" items="${list}">
            <tr>
                <td>${pr.id}</td> 
                <td>${pr.name}</td>
                <td>${pr.brand} </td>
                <td>${pr.madein} </td>
                <td>${pr.price} </td>        
                <td>
                    <a href="edit/${pr.id}">Edit</a>
                    <a href="delete/${pr.id}">Delete</a>
                </td>
            </tr>
            </c:forEach>
    </table>
</div>   
</body>
</html>