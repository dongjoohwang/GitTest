<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인</title>
<style type="text/css">
	.table {text-align: center;}
	.table2 {margin-left: 380px; text-align: center;}
	.table3 {margin-left: 380px; text-align: center;}
	.table4 {margin-left: 380px; text-align: center;}
</style>
<script type="text/javascript" src="script/manager.js"></script>
</head>
<body>
<form action="login.do" method="post" name="frm">
<table class="table" border="1">
	<tr>
		<td width="10%"></td>
		<td width="10%"></td>
		<td width="10%">로그인</td>
		<td width="10%">사원 등록<br>(관리자로 로그인 후 사용 가능)</td>
		<td width="10%">마이페이지<br>(로그인 후 사용 가능)</td>
	</tr>
</table>
<table class="table2" border="1">
	<tr>
		<td width="10%">로그인</td>
	</tr>
</table>
<table class="table3" border="1">
	<tr>
		<td width="255px">아이디</td>
		<td width="255px"><input type="text" name="userid" value="${userid}" size="20"></td>
	</tr>
	<tr>
		<td width="255px">비밀번호</td>
		<td width="255px"><input type="text" name="pwd" size="20"></td>
	</tr>
	<tr>
		<td width="255px">레벨</td>
		<td width="255px">
			<label for="level">
			<select id="level" name="level">
				<option value="A">일반회원</option>
				<option value="B">관리자</option>
			</select>
			</label>
		</td>
	</tr>
</table>
<table class="table4" border="1">
	<tr>
		<td width="516px"><input type="submit" value="로그인"
							onclick="return loginCheck()">
		&nbsp; <input type="reset" value="취소">
		</td>
	</tr>
	<tr>
		<td colspan="2">${message}</td>
	</tr>
</table>
</form>
</body>
</html>












