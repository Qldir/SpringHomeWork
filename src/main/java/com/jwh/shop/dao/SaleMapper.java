package com.jwh.shop.dao;

import java.util.List;

import com.jwh.shop.dto.Sale;

public interface SaleMapper {

	// 판매 정보 저장
	public int insertSale(Sale sale);
	// 판매 목록
	public List<Sale> saleList(String userid);
	//베스트셀러
	public Sale saleBest();
}
