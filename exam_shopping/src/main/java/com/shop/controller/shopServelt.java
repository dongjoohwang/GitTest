package com.shop.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.shop.dao.ShopDAO;
import com.shop.dto.ShopVO;

@WebServlet("/shop.do")
public class shopServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dis = request.getRequestDispatcher("shop/shop.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-DD");
		
		String custno = request.getParameter("custno");
		String custname = request.getParameter("custname");
		String phone = request.getParameter("phone");
		String address = request.getParameter("address");
		String date = request.getParameter("joindate");
		String grade = request.getParameter("grade");
		String city = request.getParameter("city");
		
		Date joindate = null;
		try {
			joindate = format.parse(date);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int no = Integer.parseInt(custno);
		
		ShopVO svo = new ShopVO();
		svo.setCustno(no);
		svo.setCustname(custname);
		svo.setPhone(phone);
		svo.setAddress(address);
		svo.setJoindate(joindate);
		svo.setGrade(grade);
		svo.setCity(city);
		
		ShopDAO sdao = ShopDAO.getInstance();
		List<ShopVO> result = sdao.insertShop(no);
		
		RequestDispatcher dis = request.getRequestDispatcher("shop/shop.jsp");
		dis.forward(request, response);
	}

}














