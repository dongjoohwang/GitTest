package com.q;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/q1")
public class Q1 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setContentType("text/plain");
		response.setCharacterEncoding("utf-8");
		Date today = new Date();
		SimpleDateFormat format = new SimpleDateFormat("오늘의 날짜는 yyyy년 MM월 dd일");
		
		PrintWriter out = response.getWriter();
		out.print(format.format(today));
		
	}
}
