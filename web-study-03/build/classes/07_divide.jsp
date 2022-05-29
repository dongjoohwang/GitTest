<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	0으로는 나눌 수 없습니다.
	<%-- 강제 예외 발생 --%>
	<%= 2/0 %>
</body>
</html>