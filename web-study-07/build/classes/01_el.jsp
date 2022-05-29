<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 표현 언어(EL, Expression language : 이렇게 값을 가져오면 편하다. -->
${"hello"}		<br>


<%="hello" %>	<br> <!-- 표현식(expression) -->
<% out.println("hello"); %>	<br> <!-- 스크립트릿 -->
</body>
</html>