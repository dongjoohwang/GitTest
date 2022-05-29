<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 객체 생성 MemberBean member = new MemberBean() -->
	<jsp:useBean id="member" class="com.saeyan.javabeans.MemberBean"/>		
	
	<h1>정보 변경 전</h1>
	
	이름 : <%= member.getName() %>
	아이디 : <%= member.getUserId() %>
	
	<h1>정보 변경 후</h1>
	<%
		member.setName("전수빈");
		member.setUserId("pinksubin");
	%>
	이름 : <%= member.getName() %>
	아이디 : <%= member.getUserId() %>
	
</body>
</html>






