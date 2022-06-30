<%@ page import="com.springbook.biz.board.impl.BoardDAO" %>
<%@ page import="com.springbook.biz.board.BoardVO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	BoardVO boards = (BoardVO) session.getAttribute("boards");
%>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
  					 "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
<title>글 상세</title>
</head>
<body>
<center>
	<h1>글 상세</h1>
	<a href="logout_proc.jsp">Log-out</a>
	<hr>
	<form action="updateBoards.do" method="post">
	<input name="seq" type="hidden" value="${boards.seq }"/>
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td bgcolor="orange" width="70">제목</td>
			<td align="left"><input name="title" type="text" value="${boards.title }"/></td>
		</tr>
		<tr>
			<td bgcolor="orange">작성자</td>
			<td align="left">${boards.writter }</td>
		</tr>
		<tr>
			<td bgcolor="orange">내용</td>
			<td align="left"><textarea name="content" cols="40" rows="10">${boards.content }</textarea></td>
		</tr>
		<tr>
			<td bgcolor="orange">등록일</td>
			<td align="left">${boards.regDate }</td>
		</tr>
		<tr>
			<td bgcolor="orange">조회수</td>
			<td align="left">${boards.cnt }</td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" value="글 수정"/>
			</td>
		</tr>
	</table>
	</form>
	<hr>
	<a href="insertBoard.jsp">글 등록</a>&nbsp;&nbsp;&nbsp;
	<a href="deleteBoards.do?seq=${boards.seq }">글 삭제</a>&nbsp;&nbsp;&nbsp;
	<a href="getBoardsList.do">글 목록</a>
</center>
</body>
</html>













