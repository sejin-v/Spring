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
	ArrayList<String> list=(ArrayList<String>)request.getAttribute("xxx");
	for(String x:list){
%>
	request.getAttribute >>>><%=x %> <br>
	<%} %>
	<h1>Main2.jsp</h1><br>
	${xxx }
</body>
</html>