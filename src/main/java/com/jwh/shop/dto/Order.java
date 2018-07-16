package com.jwh.shop.dto;

// 주문 정보 화면 DTO
public class Order {
	private String purchasedate;	//구입일
	private int bookcode;		//상품코드
	private String title;			//제목
	private int price;				//가격
	private int quantity;			//수량
	
	
	public Order() {}

	public Order(String purchasedate, int bookcode, String title, int price, int quantity) {
		super();
		this.purchasedate = purchasedate;
		this.bookcode = bookcode;
		this.title = title;
		this.price = price;
		this.quantity = quantity;
	}


	public String getPurchasedate() {
		return purchasedate;
	}


	public void setPurchasedate(String purchasedate) {
		this.purchasedate = purchasedate;
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
		return "orderList [purchasedate=" + purchasedate + ", bookcode=" + bookcode + ", title=" + title + ", price="
				+ price + ", quantity=" + quantity + "]";
	}
	
	
}
