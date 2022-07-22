package com.bookshop01.cart.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.bookshop01.cart.vo.CartVO;
import com.bookshop01.goods.vo.GoodsVO;

// 장바구니
public interface CartService {
	public Map<String ,List> myCartList(CartVO cartVO) throws Exception;	// 상품 리스트
	public boolean findCartGoods(CartVO cartVO) throws Exception;			// 상품 찾기
	public void addGoodsInCart(CartVO cartVO) throws Exception;				// 상품 추가
	public boolean modifyCartQty(CartVO cartVO) throws Exception;			// 상품 수정
	public void removeCartGoods(int cart_id) throws Exception;				// 상품 삭제
}
