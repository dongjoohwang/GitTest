<%@page import="java.sql.Connection" %>
<%@page import="com.shop.dao.ShopDAO" %>
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
	ShopDAO memDao = ShopDAO.getInstance();
	Connection conn = memDao.getConncetion();
	out.println("dbcp 연동 성공");
%>
</body>
</html>