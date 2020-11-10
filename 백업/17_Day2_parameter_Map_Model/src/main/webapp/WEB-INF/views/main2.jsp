<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.springframework.web.bind.annotation.RequestParam"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String username=(String)request.getAttribute("username");
	String address=(String)request.getAttribute("address");
	
%>
	<%=username  %>
	<%=address %>
	<h1>Main2.jsp</h1><br>
	${username }
	${address }
	${list }
</body>
</html>