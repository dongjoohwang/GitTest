<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<jsp:useBean id="member" class="com.saeyan.javabeans.MemberBean"/>		
	<hr>
	
	<h1>정보 변경 전</h1>	
	이름 : <jsp:getProperty property="name" name="member"/>
	아이디 : <jsp:getProperty property="userId" name="member"/>
	<hr>
	
	<h1>정보 변경 후</h1>
	<jsp:setProperty property="name" name="member" value="전수빈2"/>
	<jsp:setProperty property="userId" name="member" value="pinksubin2"/>
	
	이름 : <jsp:getProperty property="name" name="member"/>
	아이디 : <jsp:getProperty property="userId" name="member"/>
</body>
</html>








