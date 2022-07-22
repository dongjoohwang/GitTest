package com.bookshop01.goods.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.bookshop01.goods.vo.GoodsVO;

// 검색
public interface GoodsService {
	
	public Map<String,List<GoodsVO>> listGoods() throws Exception;			// 상품 목록
	public Map goodsDetail(String _goods_id) throws Exception;				// 상품 상세 정보
	
	public List<String> keywordSearch(String keyword) throws Exception;		// 상품 검색
	public List<GoodsVO> searchGoods(String searchWord) throws Exception;
}
