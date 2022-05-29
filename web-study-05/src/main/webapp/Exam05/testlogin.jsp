<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
		// 실제로 db에서 가져와야 하는 곳
		String id = "pinksung";
		String pw = "1234";
		String name = "성윤정";
		
		if(id.equals(request.getParameter("id")) && 
			pw.equals(request.getParameter("pw")) ) {
			
			// 1. cookie 객체 생성(username에 성윤정 맵핑)
			Cookie cookie = new Cookie("userName", URLEncoder.encode(name, "utf-8"));
			// 2. 속성 부여
			cookie.setMaxAge(365*24*60*60);
			// 3. 클라이언트에 전송
			response.addCookie(cookie);
		%>
		
		<h2>로그인 성공</h2>	
		<p><a href="main.jsp">돌아가기</a>
		<%
		}
		else {
		%>
		<h2>로그인 실패</h2>
		<p><a href="loginform.jsp">되돌아가기</a>
		<%
		}
	%>