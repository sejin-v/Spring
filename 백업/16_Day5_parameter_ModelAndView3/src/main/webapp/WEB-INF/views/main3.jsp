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
	ArrayList<String> list=
	(ArrayList<String>)request.getAttribute("stringList");
	
	
	for(String s:list){
%>
	<div> for문 >><%=s %></div>
	<%} %>
	
	<h1>Main3.jsp</h1><br>
	list: ${stringList}
</body>
</html>