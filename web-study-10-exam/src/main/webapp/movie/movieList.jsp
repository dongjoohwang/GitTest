<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"%>    
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/movie.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div id="wrap" align="center">
		<h1>영화 리스트</h1>
		<table class="list">
			<tr>
				<td colspan="5" style="border: white; text-align: right">
					<a href="movieWrite.do">
						<button type="button" class="btn btn-info">영화 등록</button>
					</a>
				</td>
			</tr>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>감독</th>
				<th>가격</th>
				<th>배우</th>
				<th>수정</th>
				<th>삭제</th>
			</tr>
			<c:forEach var="movie" items="${movieList}">
				<tr class="record">
					<td>${movie.code}</td>
					<td>${movie.title}</td>
					<td>${movie.director}</td>
					<td><fmt:formatNumber value="${movie.price}" pattern="#,###" /> 원</td>
					<td>${movie.actor}</td>
					<td><a href="movieUpdate.do?code=${movie.code}">상품 수정</a></td>
					<td><a href="movieDelete.do?code=${movie.code}">상품 삭제</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>






