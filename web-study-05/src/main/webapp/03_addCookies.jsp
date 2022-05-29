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
		Cookie cookie = new Cookie("id", "pinksung");
		cookie.setMaxAge(365*24*60*60);
		response.addCookie(cookie);
	%>
	<h3>id 쿠키가 추가되었습니다.</h3>
	<a href="02_getCookies.jsp">
		쿠키 추가를 확인하려면 클릭하세요.
	</a>
</body>
</html>