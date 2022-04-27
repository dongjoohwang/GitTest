package com.test.db;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.common.MysqlService;

@WebServlet("/db/q2_delete")
public class DeleteQ2 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		int id = Integer.valueOf(request.getParameter("id"));

		MysqlService mysqlService = MysqlService.getInstance(); // DB 연결을 위한 객체 생성(싱글턴이라 한개만 생성됨)
		mysqlService.connection(); // DB 연결

		// -- 쿼리 수행
		String query = "delete from `favorite` where id = " + id;
		
		try {
			mysqlService.update(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}

		mysqlService.disconnect(); // DB 해제

		// 목록 화면 이동
		response.sendRedirect("/db/ex02_1.jsp");
	}
}







