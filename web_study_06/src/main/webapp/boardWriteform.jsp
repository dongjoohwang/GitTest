<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>

	*{margin: 0; padding: 0;}
	.td1 {background-color: lightgray; font-weight: bold;}
	.bt {margin-left: 350px;}
	
</style>
<body>
	<h2>게시판 글쓰기</h2>
	<form method="post" action="boardWrite.jsp">
		<table border="1">
			<tr>
				<td class="td1">작성자</td>
				<td><input type="text" name="name" size="20"></td>
			</tr>
			<tr>
				<td class="td1">비밀번호</td>
				<td><input type="password" name="pwd" size="20">&nbsp(게시물 수정 삭제시 필요)</td>
			</tr>
			<tr>
				<td class="td1">이메일</td>
				<td><input type="text" name="email" size="40"></td>
			</tr>
			<tr>
				<td class="td1">글제목</td>
				<td><input type="text" name="title" size="60"></td>
			</tr>
			<tr>
				<td class="td1">글 내용</td>
				<td><textarea rows="10" cols="80" name="message"></textarea></td>
			</tr>
		</table>
		<div class="bt">
		<input type="submit" value="등록"/>
		<input type="reset" value="다시 작성"/>	
		</div>
	</form>
</body>
</html>