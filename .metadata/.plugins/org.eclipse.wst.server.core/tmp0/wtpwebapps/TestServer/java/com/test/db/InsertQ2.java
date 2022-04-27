package com.test.db;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/lesson04/q2_insert")
public class InsertQ2 extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
		
		String name = request.getParameter("name");
		String url = request.getParameter("url");
		
		MysqlService mysqlService = MysqlService.getInstance(); // DB 연결을 위한 객체 생성(싱글턴이라 한개만 생성됨)
		mysqlService.connection(); // DB 연결
		
		//-- 쿼리 수행
		String query = "insert into `favorite`"
				+ "(`name` , `url`, `createdAt` , `updatedAt` )"
				+ "values"
				+ "('" + name + "', '" + url + "',now(), now())";
		try {
			mysqlService.update(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		mysqlService.disconnect(); // DB 해제
		
		// 목록 화면 이동
		response.sendRedirect("/lesson04/q2/q2.jsp");
	}
}








