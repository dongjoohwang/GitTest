<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	고전적인 방식 : <%-- 스크립트릿에서의 복잡한 자바 코드 --%>
	<%
		String str1 = request.getParameter("n1");
		String str2 = request.getParameter("n2");
		
		int n1 = Integer.parseInt(str1);
		int n2 = Integer.parseInt(str2);
	%>
	<%=n1%> + <%=n2%> = <%=n1 + n2%> <hr>
	
	EL 방식 : <%-- 보다 깔끔하고 간단한 코드 --%>
	${param.n1} + ${param.n2} = ${param.n1 + param.n2}
</body>
</html>










