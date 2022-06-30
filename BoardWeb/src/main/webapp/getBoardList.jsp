<%@ page import="java.util.List" %>
<%@ page import="com.springbook.biz.board.impl.BoardDAO" %>
<%@ page import="com.springbook.biz.board.BoardVO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>    
    <%
    	List<BoardVO> boardsList = (List) session.getAttribute("boardsList");
    %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
  					 "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
<title>글 목록</title>
</head>
<body>
<center>
	<h1>글 목록</h1>
	<h3>테스트님 환영합니다!<a href="logout.do">Log-out</a></h3>
	
	<form action="getBoardList.jsp" method="post">
	<table border="1" cellpadding="0" cellspacing="0" width="700">
		<tr>
		<td align="right">
			<select name="searchCondition">
			<option value="TITLE">
			<option value="CONTENT">
			</select>
			<input name="searchKeyword" type="text"/>
			<input type="submit" value="검색"/>
		</td>
		</tr>
	</table>
	</form>
	<table border="1" cellpadding="0" cellspacing="0" width="700">
	<tr>
		<th bgcolor="orange" width="100">번호</th>
		<th bgcolor="orange" width="200">제목</th>
		<th bgcolor="orange" width="150">작성자</th>
		<th bgcolor="orange" width="150">등록일</th>
		<th bgcolor="orange" width="100">조회수</th>
	</tr>
	
	<c:forEach items="${boardsList }" var="boards">
		<tr>
			<td>${boards.seq }</td>
			<td align="left"><a href="getBoards.do?seq=${boards.seq }">
								${boards.title }</a></td>
			<td>${boards.writter }</td>
			<td>${boards.regDate }</td>
			<td>${boards.cnt }</td>			
		</tr>
	</c:forEach>
	
	<%-- <% for(BoardVO boards : boardsList) { %>
	<tr>
		<td><%= boards.getSeq() %></td>
		<td align="left"><a href="getBoards.do?seq=<%= boards.getSeq() %>">
							<%= boards.getTitle() %></a></td>
		<td><%= boards.getWritter() %></td>
		<td><%= boards.getRegDate() %></td>
		<td><%= boards.getCnt() %></td>					
	</tr>
	<% } %> --%>
	
	</table>
	<br>
	<a href="insertBoard.jsp">새 글 등록</a>
</center>
</body>
</html>



















