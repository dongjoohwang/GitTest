<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*, javax.sql.*"%> <!-- dao 파일이 없기 때문에 .jsp 파일에 import -->

<!-- javascript -->
<%
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String url = "jdbc:oracle:thin:@localhost:1521:xe";		// import url(암기 필요 / 시험 때는 직접 작성해야됨)
	String id = "scott";
	String pwd = "tiger";
	String sql = "select max(custno) from member_tbl_02";	// member_tbl_02 테이블에서 가장 큰 custno를 선택하여 출력하시오.
	int custno = 0;
	
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");	// 드라이브 등록(시험 때는 직접 작성)
		conn = DriverManager.getConnection(url,id,pwd);		// 데이터베이스 연결
		pstmt = conn.prepareStatement(sql);					// pst에 위의 sql query 저장 후 DB에 연결 준비
		rs = pstmt.executeQuery();							// pst query 실행 후 그 결과값을 rs에 저장
		if(rs.next()){										// rs에 값이 있을 경우
			custno = rs.getInt(1)+1;						// 1번째 인덱스에 넣은 custno + 1을 출력(가장 큰 값이 출력됨) 
		}													// if문까지만 닫기
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/common.css"/>
<script type="text/javascript" src="script/member.js"></script>	<!-- 유효성 검사 -->
<title>Insert title here</title>
</head>
<body>

	<!-- header 테이블 불러오기  -->
	<%@ include file="header.jsp" %>	
	
	<!-- 섹션 요소 : 글들을 하나의 그룹 또는 묶음으로 다룸 / 반드시 section으로 선언 -->
	<section>							

        <h3>쇼핑몰 회원 등록</h3>			
        <!-- joinImpl.jsp의 데이터 불러오기 -->
		<form method="post" action="joinImpl.jsp" name="frm">	
			<!-- left, right를 모두 설정해야 테이블이 가운데로 이동함 -->
	        <table border="1" style="margin-left: auto; margin-right: auto;">	
	            <tr>
	                <th>회원번호(자동발생)</th>
	                <!-- 번호 자동 기입 -->
	                <td><input type="text"  name="custno" id="custno" value="<%=custno %>"><br></td>	
	            </tr>
	            <tr>
	                <th>회원성명</th>
	                <td><input type="text"  name="custname" id="custname"></td>
	            </tr>
	            <tr>
	                <th>회원전화</th>
	                <td><input type="text"  name="phone" id="phone"></td>
	            </tr>
	            <tr>
	                <th>회원주소</th>
	                <td><input type="text"  name="address" id="address"></td>
	            </tr>
	            <tr>
	                <th>가입일자</th>
	                <td><input type="text" name="joindate" id="joindate"></td>
	            </tr>
	            <tr>
	                <th>고객등급 [A:VIP, B:일반, C:직원]</th>
	                <td><input type="text" name="grade" id="grade"></td>
	            </tr>
	            <tr>
	                <th>도시코드</th>
	                <td><input type="text" name="city" id="city"></td>
	            </tr>
	            <tr>
	                <th colspan="2">
	                	<!-- 유효성 체크 -->
	                    <input type="submit" value="등록" onclick="return joinCheck()" >	
						<!-- location.href => 직원 조회 페이지로 이동 -->
	                    <input type="button" value="조회" onclick="location.href='memberForm.jsp'">	
	
	                </th>
	            </tr>
	        </table>
        </form>

    </section>
    
    <!-- footer 테이블 불러오기 -->
     <%@ include file="footer.jsp" %>
</body>
</html>
<%		
	}catch(Exception e){						// while문 닫고 예외처리
		e.printStackTrace();
	}finally{
		try{
			if( rs != null) rs.close();			// rs에 데이터가 들어갔을 경우(null이 아닐 경우) Resultset(rs)문 종료
			if( pstmt != null) pstmt.close();
			if( conn != null) conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
%>