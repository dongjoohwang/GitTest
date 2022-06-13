<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*, javax.sql.*"%>
<%
	// 한글깨짐 방지
	request.setCharacterEncoding("utf-8");								

	// 사용자가 입력한 데이터 불러오기(servlet 파일 대신에 .jsp에 넣기)
	// request.getParameter는 string 타입으로만 값을 저장할 수 있음
	String custno = request.getParameter("custno");						 
	String custname = request.getParameter("custname");
	String phone = request.getParameter("phone");
	String address = request.getParameter("address");
	String joindate = request.getParameter("joindate");
	String grade = request.getParameter("grade");
	String city = request.getParameter("city");
	
	// developer에서 실행한 sql query(입력한 값 넣기)
	// pstmt로 저장하기 때문에 rs는 필요하지 않음
	String sql = "insert into member_tbl_02 values(?,?,?,?,?,?,?)";
	Connection conn = null;
	PreparedStatement pstmt = null;
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "scott";
	String pwd = "tiger";
	
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url,id,pwd);
		pstmt = conn.prepareStatement(sql);
		
		// 저장한 인덱스(1~7)의 파라미터 값을 custno(~city)로 지정
		// setString은 다른 형태의 데이터도 모두 지정할 수 있다(int, date...).
		pstmt.setString(1, custno);		
		pstmt.setString(2, custname);	
		pstmt.setString(3, phone);		
		pstmt.setString(4, address);		
		pstmt.setString(5, joindate);		
		pstmt.setString(6, grade);		
		pstmt.setString(7, city);		
		int result = pstmt.executeUpdate();
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			if( pstmt != null) pstmt.close();
			if( conn != null) conn.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}	
	// 입력, 저장된 데이터를 memberForm.jsp 파일로 보냄
	response.sendRedirect("memberForm.jsp");	
%>