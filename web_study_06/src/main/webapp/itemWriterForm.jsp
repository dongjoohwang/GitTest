<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	.bt {margin-left: 200px;}
</style>
<body>
	<form method="post" action="itemWrite.jsp">
		<h2>정보 입력 폼</h2>
		<table>
			<tr>
				<td>상품명</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>가격</td>
				<td><input type="text" name="price"></td>
			</tr>
			<tr>
				<td>설명</td>
				<td><textarea rows="4" cols="60" name="description"></textarea></td>
			</tr>
		</table>
		<div class="bt">
			<input type="submit" value="접속">
			<input type="reset" value="취소">
		</div>
	</form>
</body>
</html>