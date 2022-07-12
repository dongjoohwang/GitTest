<%@ page import="java.util.List" %>
<%@ page import="com.springbook.biz.board.impl.BoardDAO" %>
<%@ page import="com.springbook.biz.board.BoardVO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>    
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>    
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
	<h1><spring:message code="message.boards.list.mainTitle"/></h1>
	<h3>${userName }<spring:message code="message.boards.list.welcomeMsg"/>
	<a href="logout.do">Log-out</a></h3>
	
	<form action="getBoardsList.do" method="post">
	<table border="1" cellpadding="0" cellspacing="0" width="700">
		<tr>
		<td align="right">
			<select name="searchCondition">
			<c:forEach items="${conditionMap}" var="option">
				<option value="${option.value}">${option.key}
			</c:forEach>
			</select>
			<input name="searchKeyword" type="text"/>
			<input type="submit" value="<spring:message code="message.boards.list.search.condition.btn"/>"/>
		</td>
		</tr>
	</table>
	</form>
	<table border="1" cellpadding="0" cellspacing="0" width="700">
	<tr>
		<th bgcolor="orange" width="100">
		<spring:message code="message.boards.list.table.head.seq"/></th>
		<th bgcolor="orange" width="200">
		<spring:message code="message.boards.list.table.head.title"/></th>
		<th bgcolor="orange" width="150">
		<spring:message code="message.boards.list.table.head.writter"/></th>
		<th bgcolor="orange" width="150">
		<spring:message code="message.boards.list.table.head.regDate"/></th>
		<th bgcolor="orange" width="100">
		<spring:message code="message.boards.list.table.head.cnt"/></th>
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
	<a href="insertBoard.jsp">
	<spring:message code="message.boards.list.link.insertBoards"/></a>
</center>
</body>
</html>



















