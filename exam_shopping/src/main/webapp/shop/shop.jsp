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
	section h2{ text-align: center; padding: 30px;}
	#table{ margin: 90px auto; }
	.t2{ padding: 5px 150px 5px 0; }
	.t1{ font-weight: bold; text-align: center; padding: 5px 30px 5px 30px;}
	footer{ background-color: blue; margin: 0 auto; width: 1100px; height: 60px; color: white; }
	footer p{ text-align: center; padding: 20px; }
</style>

</head>
<body>
<form action="shop.do" method="post" name="frm">
	<header>
		<h1>쇼핑몰 회원관리 ver 1.0</h1>
	</header>
	<nav>
		<ul>
			<li><a href="shop.do">회원등록</a></li>
			<li><a href="shopmember.do">회원목록 조회/수정</a></li>
			<li><a href="shopsale.do">회원매출조회</a></li>
			<li><a href="index.do">홈으로</a></li>
		</ul>
	</nav>
	<section>
		<h2>쇼핑몰 회원 등록</h2>
		
		<table border="1" id="table">
			<tr>
				<th class="t1">회원번호(자동발생)</th>
				<td class="t2"><input type="text" name="custno"></td>
			</tr>
			<tr>
				<th class="t1">회원성명</th>
				<td class="t2"><input type="text" name="custname"></td>
			</tr>
			<tr>
				<th class="t1">회원전화</th>
				<td class="t2"><input type="text" name="phone"></td>
			</tr>
			<tr>
				<th class="t1">회원주소</th>
				<td class="t2"><input type="text" name="address"></td>
			</tr>
			<tr>
				<th class="t1">가입일자</th>
				<td class="t2"><input type="text" name="joindate"></td>
			</tr>
			<tr>
				<th class="t1">고객등급 [A:VIP, B:일반, C:직원]</th>
				<td class="t2"><input type="text" name="grade"></td>
			</tr>
			<tr>
				<th class="t1">도시코드</th>
				<td class="t2"><input type="text" name="pcode"></td>
			</tr>
			<tr>
				<th colspan="2" class="t1">
				<input type="submit" value="등록">
				<input type="button" value="조회" onclick="location.href='shopupdate.do'">
				</th>
			</tr>
		</table>
	</section>
	<footer>
		<p>HRDKOREA Copyrightⓒ2016 All rights reseved. Human Resources Development Service of Korea.</p>
	</footer>
	</form>
</body>
</html>