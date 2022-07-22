package com.bookshop01.admin.goods.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookshop01.goods.vo.GoodsVO;
import com.bookshop01.goods.vo.ImageFileVO;
import com.bookshop01.order.vo.OrderVO;

// 상품(책)
public interface AdminGoodsService {
	public int  addNewGoods(Map newGoodsMap) throws Exception;			// 상품 추가
	public List<GoodsVO> listNewGoods(Map condMap) throws Exception;	// 상품 추가 목록
	public Map goodsDetail(int goods_id) throws Exception;				// 상품 상세 정보
	public List goodsImageFile(int goods_id) throws Exception;			// 상품 이미지 출력
	public void modifyGoodsInfo(Map goodsMap) throws Exception;			// 상품 수정
	public void modifyGoodsImage(List<ImageFileVO> imageFileList) throws Exception;		// 상품 이미지 수정
	public List<OrderVO> listOrderGoods(Map condMap) throws Exception;		// 주문한 상품 목록
	public void modifyOrderGoods(Map orderMap) throws Exception;			// 상품 주문 수정
	public void removeGoodsImage(int image_id) throws Exception;			// 상품 삭제
	public void addNewGoodsImage(List imageFileList) throws Exception;		// 상품 이미지 추가
	
}
