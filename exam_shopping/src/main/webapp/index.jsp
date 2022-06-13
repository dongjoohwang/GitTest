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
	section div{ margin: 10px;}
	footer{ background-color: blue; margin: 0 auto; width: 1100px; height: 60px; color: white; }
	footer p{ text-align: center; padding: 20px; }
</style>
</head>
<body>
	<form action="index.do" method="get" name="frm">
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
		<h3>쇼핑몰 회원관리 프로그램</h3>
		<div>쇼핑몰 회원정보와 회원매출정보 데이터베이스를 구축하고 회원관리 프로그램을 작성하는 프로그램이다.<br>
		프로그램 작성 순서<br>
		1. 회원정보 테이블을 생성한다.<br>
		2. 매출정보 테이블을 생성한다.<br>
		3. 회원정보, 매출정보 테이블에 제시된 문제지의 참조데이터를 추가 생성한다.<br>
		4. 회원정보 입력 화면프로그램을 작성한다.<br>
		5. 회원정보 조회 프로그램을 작성한다.<br>
		6. 회원매출정보 조회 프로그램을 작성한다.
		</div>
	</section>
	<footer>
		<p>HRDKOREA Copyrightⓒ2016 All rights reseved. Human Resources Development Service of Korea.</p>
	</footer>
	</form>
</body>
</html>