<%@page import="com.dto.loginDTO"%>
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
	<h1>Login.jsp</h1>
	<br>
	<%		loginDTO mdto = (loginDTO) session.getAttribute("member");
		loginDTO dto = (loginDTO) session.getAttribute("login");

		if (mdto.getUserid().equals(dto.getUserid())) {
	%>
	<%=dto.getUserid()%>
	<%
		} else {
	%>
	<%="틀렸다"%>
	<%
		}
	%>
	<a href="logout">로그아웃</a>
</body>
</html>