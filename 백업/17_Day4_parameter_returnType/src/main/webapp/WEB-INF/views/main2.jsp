<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>main2.jsp</h1>
	${username }
	<% String name=(String)request.getAttribute("username"); %>
	<%=name %>
</body>
</html>