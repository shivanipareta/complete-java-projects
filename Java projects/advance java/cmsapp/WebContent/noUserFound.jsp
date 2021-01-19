<%@page import="com.yash.cmsapp.domain.Contact"%>
<%! Contact contact=new Contact();%>
<%contact =(Contact)session.getAttribute("contact"); %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CMS | Users</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="container">
		<jsp:include page="./includes/header.jsp" />
		<div class="main">
			<h2>
				Admin Dashboard :
				<%=session.getAttribute("name")%></h2>
			<h3>No Matched Contact Found!</h3>
			<form method="post" action="adminDashboard.jsp">
				<table>
					
					<tr>
						<td colspan="2" align="right"><input type="submit"
							value="Exit"></input></td>
					</tr>

				</table>
			</form>

		</div>
		<jsp:include page="./includes/footer.jsp" />
	</div>
</body>
</html>