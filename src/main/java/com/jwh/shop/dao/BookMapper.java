package com.jwh.shop.dao;

import java.util.List;

import com.jwh.shop.dto.Book;
import com.jwh.shop.dto.Sale;
import com.jwh.shop.dto.WishList;

public interface BookMapper {
	//상품 목록
	public List<Book> bookList();
	//상품 정보
	public Book bookInfo(int bookCode);
	//상품 수량 업데이트
	public int updateBookInfo(Sale sale);
	//위시리스트 등록
	public int insertWish(WishList wishList);
	//위시리스트
	public List<WishList> wishList(String userid);
	//위시리스트 삭제
	public int deleteWish(WishList wishList);
}
