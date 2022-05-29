<%@page import="java.net.URLEncoder" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userid = request.getParameter("userid");
	String userpw = request.getParameter("userpw");
	String logincheck = request.getParameter("logincheck");
	
	if(logincheck.equals("user")) {
%>
	<jsp:forward page="09_userMain.jsp">
	<jsp:param value="<%=URLEncoder.encode("전고객", "UTF-8") %>" name="userName"/>
	</jsp:forward>
	<%} else{ %>
	<jsp:forward page="09_managerMain.jsp">
	<jsp:param value="<%=URLEncoder.encode("전고객", "UTF-8") %>" name="userName"/>
	</jsp:forward>
	<%} %>