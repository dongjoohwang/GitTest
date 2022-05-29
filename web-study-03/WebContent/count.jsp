<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%!
    	int global_count=0;
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<!-- 주석문 -->
	<%-- 주석문 2 --%>
	<%
		int local_cnt = 0;
	{
		out.print("local_cnt : ");
		out.print(++local_cnt);
		
		out.print("<br> global_cnt : ");
		out.print(++global_count);
		out.print("<br>");
		
	}
	%>
	
	<%
		out.print("local_cnt2 : ");
		out.print(++local_cnt);
		
		out.print("<br> global_cnt2 : ");
		out.print(++global_count);
	%>
</body>
</html>






