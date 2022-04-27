package com.q;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/q2")
public class Q2 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/plain");
		
		Date current = new Date();
		SimpleDateFormat format = new SimpleDateFormat("현재 시간은 HH시 mm분 ss초 입니다.");

		PrintWriter out = response.getWriter();
		out.print(format.format(current));
	}
}
