package com.jwh.shop.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwh.shop.dto.Book;
import com.jwh.shop.dto.Sale;
import com.jwh.shop.dto.WishList;

@Repository
public class BookDaoManager implements BookMapper {
	
	@Autowired
	SqlSession session;

	@Override
	public List<Book> bookList() {
		
		List<Book> bookList = new ArrayList<Book>();
		
		try {
			BookMapper mapper = session.getMapper(BookMapper.class);
			bookList = mapper.bookList();
			System.out.println(bookList);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return bookList;
	}

	@Override
	public Book bookInfo(int bookCode) {

		Book bookInfo = new Book();
		
		try {
			BookMapper mapper = session.getMapper(BookMapper.class);
			bookInfo = mapper.bookInfo(bookCode);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return bookInfo;
	}

	@Override
	public int updateBookInfo(Sale sale) {

		int result = 0;
		
		try {
			BookMapper mapper = session.getMapper(BookMapper.class);
			result = mapper.updateBookInfo(sale);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public int insertWish(WishList wishList) {

		int result = 0;
		
		try {
			BookMapper mapper = session.getMapper(BookMapper.class);
			result = mapper.insertWish(wishList);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public List<WishList> wishList(String userid) {
		
		List<WishList> wishList = new ArrayList<WishList>();
		
		try {
			BookMapper mapper = session.getMapper(BookMapper.class);
			wishList = mapper.wishList(userid);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return wishList;
	}

	@Override
	public int deleteWish(WishList wishList) {

		int result = 0;
		
		try {
			BookMapper mapper = session.getMapper(BookMapper.class);
			result = mapper.deleteWish(wishList);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}


}
