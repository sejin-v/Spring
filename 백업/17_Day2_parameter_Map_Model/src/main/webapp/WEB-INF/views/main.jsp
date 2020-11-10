<%@page import="org.springframework.web.bind.annotation.ModelAttribute"%>
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
	String username= (String)request.getAttribute("username");
	
%>
	<%=username %>
	<h1>Main.jsp</h1><br>
	${username }
</body>
</html>