<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Q1</title>
</head>
<body>
	<%!
	// 일반 클래스처럼 사용하는 공간
	// 1. 합계	input => 구현 => output
	
		private int N = 50;
		int sum = 0;	
	
		public int getSum(){
			return sum;
		}
	%>
	<%
		for(int i=1;i<=N;i++){
			sum += i;
		}
	%>
	<%= getSum() %>
	<br>
	<% 
	
		int[] scores = {80, 90, 100, 95, 80};
		
		double scoresum = 0.0;
		double ag = 0.0;
		
		for(int i=0;i<scores.length;i++){
			scoresum += scores[i];
			ag = scoresum / 5;
		}
	%>
	
	<input type="text" value="<%= ag%>">
	<br>
	
	<%
	
	List<String> scoreList = Arrays.asList
	(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
	
	int count = 0;
	
	
	%>
	
	<%
	
	String birthDay = "20010820";
	int year = 2021;
	
	
	%>
</body>
</html>








