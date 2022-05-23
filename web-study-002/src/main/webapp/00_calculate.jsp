<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>계산</title>
</head>
<body>
	<form method="get" action="CalculateServlet">
		이름 : <input type="text" name = "name"><br>
		숫자1 : <input type="text" name = "n1"><br>
		숫자2 : <input type="text" name = "n2"><br>
		<input type="submit" value="전송">
	</form>
</body>
</html>