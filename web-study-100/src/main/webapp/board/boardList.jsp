<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>게시판</title>
<link rel="stylesheet" type="text/css" href="css/shopping.css">
</head>
<body>
<div id="wrap" align="center">
<h1>게시글 리스트</h1>
<table class="list">
<tr>
<td colspan="5" style="border: white; text-align : reight">
	<a href="BoardServlet?command=board_write_from">게시글 등록</a>
	</td>
	</tr>
<tr><th>번호</th><th>제목</th><th>작성자</th><th>작성일</th><th>조회</th></tr>
<c:forEach var="board" items="${boardList }"> 
<tr class="record">
<td>${board.num }</td>
<td>
<a href="BoardServlet?command=board_view&num=${board.num }">
${board.title }</a>
</td>
<td><fmt:formatDate value="${board.writedate }"/></td>
<td>${board.readcount }</td>
</tr>
</c:forEach>
</table>
</div>
</body>
</html>