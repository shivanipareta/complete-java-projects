<%@page import="com.yash.cmsapp.domain.Contact"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%!Contact contact = new Contact();%>
<%
	contact = (Contact) session.getAttribute("contact");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CMS | Edit Contact</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="container">
		<jsp:include page="./includes/header.jsp"/>
		
		<div class="main">
			<h2>Contact Editing </h2>
			<form method="post" action="ContactUpdationController">
				<table>
					<tr>
						<td>Name</td>
						<td>
							<input type="text" name="name" value="<%=contact.getName()%>"></input>
						</td>
					</tr>
					<tr>
						<td>Contact</td>
						<td>
							<input type="text" name="contact" value="<%=contact.getContact()%>"></input>
						</td>
					</tr>
					<tr>
						<td>Address</td>
						<td>
							<input type="text" name="address" value="<%=contact.getAddress()%>"></input>
						</td>
					</tr>
					<tr>
						<td>Email</td>
						<td>
							<input type="text" name="email" value="<%=contact.getEmail()%>"></input>
						</td>
					</tr>
					<tr>
						<td colspan="2" align="right">
							<input type="submit" value="Update Contact"></input>
						</td>
					</tr>
				</table>
			</form>
		</div>
		
		<jsp:include page="./includes/footer.jsp"/>
	</div>
</body>
</html>