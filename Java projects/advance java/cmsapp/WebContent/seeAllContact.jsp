<%@page import="java.util.List"%>
<%@page import="com.yash.cmsapp.domain.Contact"%>
<%!List<Contact> allContacts; %>
<% allContacts=(List<Contact>)session.getAttribute("allContacts");%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CMS | Contacts</title>
<style>
table{
	background-color:silver;
	border-spacing: 0;
	width: 50%;
	border:10px solid blue;
	overflow: auto;
	display:block;
	height: 480px;
	margin: auto;
}
#cont{
	background-color: lightblue;
}
form{
 margin-left: 872px;
}
</style>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="container" id="cont">
		<jsp:include page="./includes/header.jsp" />
		<div class="main">
			<h2>
				User Dashboard :<%=session.getAttribute("name")%></h2>
			<h3>Matched Contact :</h3>

			<div style="overflow-x: auto;">

				<table>
			<%for(Contact contact: allContacts){%>
					<tr>
						<td>Id :</td>
						<td><lable id="formDB"><%=contact.getId()%></lable></td>
					</tr>
					<tr>
						<td>User Id :</td>
						<td><lable id="formDB"><%=contact.getUserId()%></lable></td>
					</tr>
					<tr>
						<td>Name :</td>
						<td><lable id="formDB"><%=contact.getName()%></lable></td>
					</tr>
					<tr>
						<td>Contact :</td>
						<td><lable id="formDB"><%=contact.getContact()%></lable></td>
					</tr>
					<tr>
						<td>Address :</td>
						<td><lable id="formDB"><%=contact.getAddress()%></lable></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><lable id="formDB"><%=contact.getEmail()%></lable></td>
					</tr>
					<tr>
						<td>-----------------------------------------</td>
						<td>-----------------------------------------</td>
					</tr>

			<%}%>
		</div>
				</table>
				<form method="post" action="userDashboard.jsp">
					<input type="submit"
							value="Exit"></input>
				</form>
			</div>
		<jsp:include page="./includes/footer.jsp" />
	</div>
</body>
</html>