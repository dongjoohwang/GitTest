<%@ page import="java.sql.*" %>
<%@ page import="com.manager.dao.ManagerDAO" %>
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
	ManagerDAO manDao = ManagerDAO.getInstance();
	Connection conn = manDao.getConnection();
	out.println("dbcp 연동 성공");
%>
</body>
</html>