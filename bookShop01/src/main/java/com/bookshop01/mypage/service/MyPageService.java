package com.bookshop01.mypage.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.bookshop01.member.vo.MemberVO;
import com.bookshop01.order.vo.OrderVO;

// 마이 페이지
public interface MyPageService{
	public List<OrderVO> listMyOrderGoods(String member_id) throws Exception;	// 상품 주문 내역
	public List findMyOrderInfo(String order_id) throws Exception;				// 주문 조회
	public List<OrderVO> listMyOrderHistory(Map dateMap) throws Exception;		
	public MemberVO  modifyMyInfo(Map memberMap) throws Exception;				// 정보 수정
	public void cancelOrder(String order_id) throws Exception;					// 주문 취소
	public MemberVO myDetailInfo(String member_id) throws Exception;			// 회원 상세 정보

}
