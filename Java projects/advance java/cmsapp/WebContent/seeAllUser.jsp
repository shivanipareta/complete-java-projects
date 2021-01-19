<%@page import="java.util.List"%>
<%@page import="com.yash.cmsapp.domain.User"%>
<%!List<User> allUsers; %>
<% allUsers=(List<User>)session.getAttribute("allUsers");%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CMS | Users</title>
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
				Admin Dashboard :<%=session.getAttribute("name")%></h2>
			<h3>Matched Contact :</h3>

			<div style="overflow-x: auto;">

				<table>
			<%for(User user: allUsers){%>
					<tr>
						<td>Id :</td>
						<td><lable id="formDB"><%=user.getId()%></lable></td>
					</tr>
					<tr>
						<td>Status :</td>
						<td><lable id="formDB"><%=user.getStatus()%></lable></td>
					</tr>
					<tr>
						<td>Name :</td>
						<td><lable id="formDB"><%=user.getName()%></lable></td>
					</tr>
					<tr>
						<td>Contact :</td>
						<td><lable id="formDB"><%=user.getContact()%></lable></td>
					</tr>
					<tr>
						<td>Address :</td>
						<td><lable id="formDB"><%=user.getAddress()%></lable></td>
					</tr>
					<tr>
						<td>Email</td>
						<td><lable id="formDB"><%=user.getEmail()%></lable></td>
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