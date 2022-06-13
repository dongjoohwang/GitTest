<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>            
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script type="text/javascript" src="shopping/shopp.js"></script>
<title>쇼핑몰 회원관리</title>
<style type="text/css">
	*{margin: 0; padding: 0;}
	ul,li{list-style: none;}
	a{ text-decoration: none;}
	
	header{ background-color: blue; margin: 0 auto; width: 1100px; height: 100px; color: white; font-size: 20px; }
	header h1{ text-align: center; padding: 20px;}
	nav{ background-color: #87ceeb; margin: 0 auto; width: 1100px; height: 60px; color: white; font-size: 20px; }
	nav ul li{ float: left; margin: 15px; padding: 0 20px 0 0; }
	section{ background-color: #e6e6fa; margin: 0 auto; width: 1100px; height: 600px; }
	section h3{ text-align: center; padding: 30px;}
	section table{ text-align: center; margin: 0 auto;}
	.t1{ padding: 0 10px 0 10px;}
	.t2{ padding: 0 20px 0 20px;}
	footer{ background-color: blue; margin: 0 auto; width: 1100px; height: 60px; color: white; }
	footer p{ text-align: center; padding: 20px; }
</style>
</head>
<body>
<form action="shopsale.do" method="post" name="frm">
	<header><h1>쇼핑몰 회원관리 ver 1.0</h1></header>
	<nav>
		<ul>
			<li><a href="shop.do">회원등록</a></li>
			<li><a href="shopmember.do">회원목록 조회/수정</a></li>
			<li><a href="shopsale.do">회원매출조회</a></li>
			<li><a href="index.do">홈으로</a></li>
		</ul>
	</nav>
	<section>
		<h3>회원매출조회</h3>
		<table border="1">
			<tr>
				<th class="t1">회원정보</th>
				<th class="t1">회원성명</th>
				<th class="t2">고객등급</th>
				<th class="t2">매출</th>
			</tr>
			<tr>
				<td class="t1">100001</td>
				<td class="t1">김행복</td>
				<td class="t2">VIP</td>
				<td class="t2">8000</td>
			</tr>
			<tr>
				<td class="t1">100004</td>
				<td class="t1">최사랑</td>
				<td class="t2">VIP</td>
				<td class="t2">4900</td>
			</tr>
			<tr>
				<td class="t1">100003</td>
				<td class="t1">장믿음</td>
				<td class="t2">일반</td>
				<td class="t2">3000</td>
			</tr>
			<tr>
				<td class="t1">100002</td>
				<td class="t1">이축복</td>
				<td class="t2">일반</td>
				<td class="t2">2500</td>
			</tr>

		</table>
		
	</section>
	<footer>
		<p>HRDKOREA Copyrightⓒ2016 All rights reseved. Human Resources Development Service of Korea.</p>
	</footer>
	</form>
</body>
</html>