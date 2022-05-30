<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fmt:requestEncoding value="UTF-8"/>
	<c:choose>
		<c:when test="${param.log == 1}">
			<c:redirect url="q_user.jsp">
			<c:param value="${param.id}" name="userid"></c:param>
			</c:redirect>
		</c:when>
		<c:when test="${param.log == 2}">
			<c:redirect url="q_manager.jsp">
			<c:param value="${param.id}" name="managerid"></c:param>
			</c:redirect>
		</c:when>
	</c:choose>
</body>
</html>