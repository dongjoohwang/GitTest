<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 전용 페이지</title>
<style type="text/css">
	.table {text-align: center;}
	.page {text-align: center;}
	.imgtab {text-align: center;}
	.img {width: 300px; height: 400px;}
</style>
<script type="text/javascript" src="script/manager.js"></script>
</head>
<body>
<table class="table" border="1">
	<tr>
		<td width="10%">${loginUser.name}님 반갑습니다.</td>
		<td width="10%">레벨 : B</td>
		<td width="10%">로그아웃</td>
		<td width="10%">사원 등록<br>(관리자로 로그인 후 사용 가능)</td>
		<td width="10%">마이페이지<br>(로그인 후 사용 가능)</td>
	</tr>
</table>
<h2 class="page">회원 전용 페이지</h2><br>
<div class="imgtab">
<img class="img" src="http://maple9192.cafe24.com/pages/upload/
board/m212/1612/08/20161208_bd2b3d22bb3cacd4786732560fbbb884.jpg">
</div>
</body>
</html>












