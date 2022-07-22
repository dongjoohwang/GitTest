package com.bookshop01.admin.member.service;

import java.util.ArrayList;
import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookshop01.goods.vo.GoodsVO;
import com.bookshop01.member.vo.MemberVO;
import com.bookshop01.order.vo.OrderVO;

// 회원
public interface AdminMemberService {
	public ArrayList<MemberVO> listMember(HashMap condMap) throws Exception;	// 회원 목록
	public MemberVO memberDetail(String member_id) throws Exception;			// 회원 상세정보
	public void  modifyMemberInfo(HashMap memberMap) throws Exception;			// 회원 정보 수정
}
