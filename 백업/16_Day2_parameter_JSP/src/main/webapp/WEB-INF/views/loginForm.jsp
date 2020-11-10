<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
	
	<form action="login" method="post">
		id:<input type="text" name="userid"><br>
		비번:<input type="text" name="passwd"><br>
		전화번호1:<input type="text" name="phone"><br>
		전화번호2:<input type="text" name="phone"><br>
		<!-- dto의 멤버변수와 form안에 name db컬럼명 까지 동일하게 맞춰준다 -->
		<input type="submit" value="login">
	</form>
	
</body>
</html>
