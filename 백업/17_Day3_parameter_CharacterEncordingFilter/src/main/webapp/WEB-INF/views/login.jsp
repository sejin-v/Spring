<%@page import="com.dto.Login"%>
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
	<h1>Login.jsp</h1><br>
	 id: ${sessionScope.login.userid}<br>
	 passwd: ${sessionScope.login.passwd}<br>
	 
	 <% Login dto=(Login)session.getAttribute("login"); %>
	 <%= dto.getUserid() %>
	 <a href="logout">로그아웃</a>
</body>
</html>