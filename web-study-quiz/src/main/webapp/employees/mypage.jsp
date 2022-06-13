<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
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
		<td width="12%">마이페이지</td>
	</tr>
</table>
<table class="table3" border="1">
	<tr>
		<td width="345px">아이디</td>
		<td width="345px"><input type="text" name="userid" value="${userid}" size="20"></td>
	</tr>
	<tr>
		<td width="345px">비밀번호</td>
		<td width="345px"><input type="text" name="pwd" size="20"></td>
	</tr>
	<tr>
		<td width="345px">이름</td>
		<td width="345px"><input type="name" name="name" size="20"></td>
	</tr>
	<tr>
		<td width="345px">권한</td>
		<td width="345px">
			<label for="level">
			<select id="level" name="level">
				<option value="A">일반회원</option>
				<option value="B">관리자</option>
			</select>
			</label>
		</td>
	</tr>
	<tr>
		<td width="345px">성별</td>
		<td width="345px">
			<label for="gender">
			<select id="gender" name="gender">
				<option value="male">남자</option>
				<option value="female">여자</option>
			</select>
			</label>
		</td>
	</tr>
	<tr>
		<td width="345px">전화번호</td>
		<td width="345px"><input type="phone" name="phone" size="20"></td>
	</tr>
</table>
<table class="table4" border="1">
	<tr>
		<td width="696px"><input type="submit" value="메인 페이지로 이동"></td>
	</tr>
</table>
</body>
</html>










