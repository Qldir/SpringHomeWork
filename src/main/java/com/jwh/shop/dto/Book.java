package com.jwh.shop.dto;

// 상품 정보 테이블 DTO
public class Book {
	private int bookcode;	//상품일련번호
	private String title;	//책 제목
	private int price;		//상품 단가
	private int quantity;	//재고 수량
	
	public Book() {}

	public Book(int bookcode, String title, int price, int quantity) {
		super();
		this.bookcode = bookcode;
		this.title = title;
		this.price = price;
		this.quantity = quantity;
	}

	public int getBookcode() {
		return bookcode;
	}

	public void setBookcode(int bookcode) {
		this.bookcode = bookcode;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Book [bookcode=" + bookcode + ", title=" + title + ", price="+ price
				+ ", quantity=" + quantity + "]";
	}
	
}
