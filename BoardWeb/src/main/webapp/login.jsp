<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
  					 "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><spring:message code="message.users.login.title"/></title>
</head>
<body>
	<center>
		<h1><spring:message code="message.users.login.title"/></h1>
		<a href="login.do?lang=en">
		<spring:message code="message.users.login.language.en"/></a>&nbsp;&nbsp;
		<a href="login.do?lang=ko">
		<spring:message code="message.users.login.language.ko"/></a>
		<hr>
		<form action="login.do" method="post">
			<table border="1" cellpadding="0" cellspacing="0">
				<tr>
					<td bgcolor="orange"><spring:message code="message.users.login.id"/></td>
					<td><input type="text" name="id" value="${user.id }"/></td>
				</tr>
				<tr>
					<td bgcolor="orange"><spring:message code="message.users.login.password"/></td>
					<td><input type="password" name="password" value="${userVO.password }"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="<spring:message code="message.users.login.loginBtn"/>"/>
					</td>
				</tr>
			</table>
		</form>
		<hr>
	</center>
</body>
</html>



































