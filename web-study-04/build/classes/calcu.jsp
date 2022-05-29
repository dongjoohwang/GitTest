<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<b>1부터 10까지 자연수 구하기</b><br>
	<%
		int n = 0;	
		int num = Integer.parseInt(request.getParameter("sum"));
		
		for(n=1;n<=10;n++) {
			
			if(n<10) {
				out.print(n + "+");
			} else {
				out.print(n + " = ");
			}
			num += n;
		}
		out.print(num);
	%>
	
	
</body>
</html>