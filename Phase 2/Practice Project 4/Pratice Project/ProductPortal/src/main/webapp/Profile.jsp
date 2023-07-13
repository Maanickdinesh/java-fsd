<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.details.ProductClass"%>
<%@page import="java.util.Iterator"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	ArrayList<ProductClass> p1 = (ArrayList)request.getAttribute("data");
	%>

	<div align="center">
	<h1>Product List</h2>
		<table border="1">

			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Color</th>
				<th>Price</th>
			</tr>
			<%
			if (request.getAttribute("data") != null) {
				Iterator<ProductClass> iterator = p1.iterator();

				while (iterator.hasNext()) {
					ProductClass pc = iterator.next();
			%>
			<tr>
				<td><%=pc.getId()%></td>
				<td><%=pc.getName()%></td>
				<td><%=pc.getColor()%></td>
				<td><%=pc.getPrice()%></td>
			</tr>
			<%
			}
			}
			%>
		</table>
	</div>
</body>
</html>