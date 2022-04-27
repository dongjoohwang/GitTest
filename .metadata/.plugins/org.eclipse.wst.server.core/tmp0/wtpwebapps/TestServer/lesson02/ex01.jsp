<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 예제</title>
</head>
<body>
	<!-- html 주석 문법 : 소스 보기에서 보인다. -->
	 <%-- JSP의 주석 문법 : 소스 보기에서 보이지 않는다. --%>
	 <h1>Hello world</h1>
	 
	 <% 
	 	// java 문법 시작 => 자바 주석
	 	// scriptlet
	 	// 1+2+3+..+10
	 	
	 	int sum = 0;
	 	for(int i=1;i<=10;i++){
	 		sum += i;
	 	}
	 %>
	 
	 <strong>합계 : </strong>
	 <input type="text" value="<%= sum%>">
	 <br>
	 
	 <%!
	 	// field
	 	private int num = 100;
	 	
	 	// method
	 	public String getHelloWorld() {
	 		return "hello world";
	 	}
	 %>
	 
	 <%= getHelloWorld() %>
	 <br>
	 
	 <%= num + 200 %>
</body>
</html>







