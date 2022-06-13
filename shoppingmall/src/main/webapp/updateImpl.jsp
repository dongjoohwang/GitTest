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
	String city = request.getParameter("city");
	
	String sql = "update member_tbl_02 set custname=?, phone=?, address=?, "
			+ "joindate=?, grade=?, city=? where custno = ?";
	Connection conn = null;
	PreparedStatement pst = null;
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String id = "scott";
	String pwd = "tiger";
	try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, id, pwd);
		pst = conn.prepareStatement(sql);
		pst.setString(1, custname);
		pst.setString(2, phone);
		pst.setString(3, address);
		pst.setString(4, joindate);
		pst.setString(5, grade);
		pst.setString(6, city);
		pst.setString(7, custno);
		int result = pst.executeUpdate();
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		try {
			if(pst!=null) pst.close();
			if(conn!=null) conn.close();
		} catch(Exception e) {
			
		}
	}
	
	response.sendRedirect("memberForm.jsp");
%>












