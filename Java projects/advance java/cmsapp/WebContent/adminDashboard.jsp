<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CMS | Dashboard</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="container">
		<jsp:include page="./includes/header.jsp"/>
		<div class="main">
			<h2>Admin Dashboard : <%=session.getAttribute("name")%></h2>
			<h3> Services :</h3> 
			<div class="service" >
			<ul>
				<li>
					<a href="allUser.jsp">List Users</a> 
				</li>
				<li>
					<a href="blockUser.jsp">Block User</a> 
				</li>
				<li>
					<a href="activeUser.jsp">Active User</a> 
				</li>
			</ul>
		</div>
		</div>
		<jsp:include page="./includes/footer.jsp"/>
	</div>
</body>
</html>