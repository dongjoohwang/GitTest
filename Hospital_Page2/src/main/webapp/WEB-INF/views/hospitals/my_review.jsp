<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
 <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
 <meta name="description" content="" />
 <meta name="author" content="" />

<link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
<link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.css"/>
 <link rel="stylesheet" type="text/css" href="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick-theme.css"/>

 <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css" rel="stylesheet" type="text/css" />
 <!-- Google fonts-->
 <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css" /> 
 
<link href="../../resources/css/hospitalStyles.css" rel="stylesheet" />
<link href="../../resources/css/loginCss.css" rel="stylesheet" />
<link href="../../resources/css/findCss.css" rel="stylesheet" />
<link href="../../resources/css/styles.css" rel="stylesheet" />
<link href="https://fonts.googleapis.com/earlyaccess/notosanskr.css" rel="stylesheet">

<script src="https://code.jquery.com/jquery-3.4.1.js"   
			integrity="sha256-WpOohJOqMqqyKL9FccASB9O0KwACQJpFTUBLTYOVvVU="   
			crossorigin="anonymous">
</script>
<script src="../../resources/js/joinScript.js"></script>
<script src="../../resources/js/doubleChk.js"></script>
<script type="text/javascript" src="//cdn.jsdelivr.net/npm/slick-carousel@1.8.1/slick/slick.min.js">
</script>	
<title>Insert title here</title>
</head>
<body>

<nav class="navbar navbar-light bg-light static-top">
            <div class="container nava">
                <a class="navbar-brand" href="#!">All in one Care</a>
                <ul id="menu">
                 <!-- <li><button type="button" id="login">로그인</button></li> -->
		         <li><a href="login">로그인</a></li>
		         <li><a href="#">로그아웃</a></li>
		         <li><a href="agree">회원가입</a></li>
      			</ul>
            </div>
        </nav>
        <form action="my_review.do" method="post" name="my_page">
<h2 style="margin-top: 70px;"><p style="text-align:center";>내가 쓴 리뷰</p></h2>
<div style="text-align:center;">

   <img class="my_review_image" src="${pagaContext.request.contextPath}/resources/assets/img/review.jpg" width="400px" height="300px" /></i>
  <br> <a href="my_page.do"><button type="button" class="submit-btn">돌아가기</button></a>
<br>
  </div>
  </form>
  
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>
<script>

</script>
<%@include file ="../includes/footer.jsp" %>