<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*, javax.sql.*"%>
<%
	request.setCharacterEncoding("utf-8");
	
	String custno = request.getParameter("custno");
	String custname = request.getParameter("custname");
	String phone = request.getParameter("phone");
	String address = request.getParameter("address");
	String joindate = request.getParameter("joindate");
	String grade = request.getParameter("grade");
	String city =  request.getParameter("city");
	
	String sql = "insert into member_tbl_02 values(?,?,?,?,?,?,?)";
	Connection conn = null;
	PreparedStatement pst = null;
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "scott";
	String pwd = "tiger";
	
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url,id,pwd);
		pst.setString(1, custno);
		pst.setString(2, custname);
		pst.setString(3, phone);
		pst.setString(4, address);
		pst.setString(5, joindate);
		pst.setString(6, grade);
		pst.setString(7, city);
		int result = pst.executeUpdate();
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		try {
			if( pst != null) pst.close();
			if( conn != null) conn.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	response.sendRedirect("memberForm.jsp");
%>












