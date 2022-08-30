<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
 		<meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>인테리어</title>
        <!-- Favicon-->
        <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
        <!-- Bootstrap icons-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" type="text/css" />
        <!-- Google fonts-->
        <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css" />
        <!-- Core theme CSS (includes Bootstrap)-->
        <link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css"/>
        <link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick-theme.css"/>
        <link href="../../resources/css/hospitalStyles.css" rel="stylesheet" />
		<link href="../../resources/css/loginCss.css" rel="stylesheet" />
		<link href="../../resources/css/styles.css" rel="stylesheet" />
<div class="navbar">
	<a href="../hospitals/hospitalMain.do" id="logo"> <img alt="logo"
		src="../../resources/assets/img/logoimg.png" width="90">
	</a>
	<ul id="menu">
		<c:if test="${ empty user }">
			<li><a href="../hospitals/terms.do">회원가입</a></li>
			<li><a href="../member/login.do">로그인</a></li>
			<li><a href="../inquiry/list.do">무엇이든 물어보세요</a></li>
		</c:if>
		<c:if test="${ not empty user }">
			<li><a href="../member/logout.do">로그아웃</a></li>
			<li><a href="../member/my_page.do?id=${user.id }">${user.name }님 반갑습니다</a></li>
		</c:if>
	</ul>
</div>