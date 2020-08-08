<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create NEw Product</title>
</head>
<body>
<div align="center">
<br>
    <form:form method="post" action="save">    
        <table >    
         <tr>    
          <td>Product Name : </td>   
          <td><form:input path="name"  /></td>  
         </tr>    
         <tr>    
          <td>Brand :</td>    
          <td><form:input path="brand" /></td>  
         </tr>   
         <tr>    
          <td>Made In :</td>    
          <td><form:input path="madein" /></td>  
         </tr>   
         <tr>
         <td>Price :</td>
         <td><form:input path="price"/></td>
         </tr>
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Add" /></td>    
         </tr>    
        </table>    
       </form:form>
</div>

</body>
</html>