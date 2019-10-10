<%@page import="java.util.Date"%>
<%!public void jspInit() {
		System.out.println("init");
	}

	public void jspDestroy() {
		System.out.println("destroy");
	}%>
	<%!
	private int i = 100;
	%>
	<% Date date = new Date(); %>
	<% int count = 0; %>

<html>
<body>
	<h2>Hello World!</h2>
	<h2>Count = <%=count%></h2>
	<h2>Current Date and Time is</h2>
	<h2><%= date %></h2>
</body>
</html>
