<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:useBean id="emp"
	class="com.ustglobal.mywebapp.dto.EmployeeInfoBean" scope="application"></jsp:useBean>
	<%@ include file="index.jsp" %>
	<%@ page errorPage="error.jsp" %>
	<%
	int i = 1/0;
	%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1><%=emp.getEmpId()%></h1>
	<h1><%=emp.getEmpName()%></h1>
</body>
</html>