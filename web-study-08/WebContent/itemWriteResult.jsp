<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<%
	Connection con = null;
	PreparedStatement pst = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:XE";
	String uid = "scott";
	String pass = "tiger";
	String sql = "insert into item values(?, ?, ?)";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("utf-8");

	String name = request.getParameter("name");
	int price = Integer.parseInt(request.getParameter("price"));
	String description = request.getParameter("description");
	
	try {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		con = DriverManager.getConnection(url, uid, pass);
		
		pst = con.prepareStatement(sql);
		
		pst.setString(1, name);
		pst.setInt(2, price);
		pst.setString(3, description);
		pst.executeUpdate();
		
	} catch(Exception e) {
		e.printStackTrace();
	} finally {
		try {
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
%>

<a href="itemWrite.jsp">결과 보기</a>
</body>
</html>










