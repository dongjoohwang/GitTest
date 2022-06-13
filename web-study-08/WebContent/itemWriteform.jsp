<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	.bt{margin-left: 280px;}
	.des{margin-bottom: 100px;}
</style>
<body>
	<h2>정보 입력 폼</h2>
	<form method="post" action="itemWriteResult.jsp">
	상품명&nbsp; <input type="text" name="name"><br>
	가격&nbsp;&nbsp;&nbsp;&nbsp; <input type="text" name="price"><br><br>
	
	<span class="des">설명</span>
	&nbsp;<textarea rows="10" cols="80" name="description"></textarea><br>
	
	<div class="bt">
		<input type="submit" value="전송">
		<input type="reset" value="취소">
	</div>
	</form>
</body>
</html>





















