<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정</title>
<style type="text/css">
	.table {text-align: center;}
	.table2 {margin-left: 280px; text-align: center;}
	.table3 {margin-left: 280px; text-align: center;}
	.table4 {margin-left: 280px; text-align: center;}
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
<table class="table2" border="1">
	<tr>
		<td width="696px"><strong><br>사원 정보</strong><br><br>
		회원 정보가 수정되었습니다.
		</td>
	</tr>
</table>
<table class="table3" border="1">
	<tr>
		<td width="345px">아이디</td>
		<td width="345px">${loginUser.userid}</td>
	</tr>
	<tr>
		<td width="345px">비밀번호</td>
		<td width="345px">${loginUser.pwd}</td>
	</tr>
	<tr>
		<td width="345px">이름</td>
		<td width="345px">${loginUser.name}</td>
	</tr>
	<tr>
		<td width="345px">권한</td>
		<td width="345px">${loginUser.level}</td>
	</tr>
	<tr>
		<td width="345px">성별</td>
		<td width="345px">${loginUser.gender}</td>
	</tr>
	<tr>
		<td width="345px">전화번호</td>
		<td width="345px">${loginUser.phone}</td>
	</tr>
</table>
<table class="table4" border="1">
	<tr>
		<td width="696px"><input type="submit" value="메인 페이지로 이동"></td>
	</tr>
</table>
</body>
</html>










