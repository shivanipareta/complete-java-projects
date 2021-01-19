<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
<h1>Customer List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th></tr>  
   <c:forEach var="customer" items="${list}">   
   <tr>  
   <td>${customer.id}</td>  
   <td>${customer.name}</td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="customerform">Add New Customer</a>  