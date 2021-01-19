<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CMS | Active User</title>
<link rel="stylesheet" href="css/style.css">
</head>
<body>
	<div class="container">
		<jsp:include page="./includes/header.jsp"/>
		
		<div class="main">
			<h2>activating User </h2>
			<form method="post" action="UserActivatingController">
				<table>
					<tr>
						<td>Enter User Id</td>
						<td>
							<input type="number" name="id"></input>
						</td>
					</tr>
					<tr>
						<td colspan="2" align="right">
							<input type="submit" value="Active"></input>
						</td>
					</tr>
				</table>
			</form>
		</div>
		
		<jsp:include page="./includes/footer.jsp"/>
	</div>
</body>
</html>