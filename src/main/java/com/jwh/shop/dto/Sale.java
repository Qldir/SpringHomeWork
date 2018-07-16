package com.jwh.shop.dto;

// 판매 정보 테이블 DTO
public class Sale {
	private String userid;			// 구매자 아이디
	private int bookcode;			// 구매 상품 번호
	private int purchasecnt;		// 구매 수량
	private String purchasedate;	// 구매 날짜
	
	
	public Sale() {}
	
	

	public Sale(int bookcode, int purchasecnt) {
		super();
		this.bookcode = bookcode;
		this.purchasecnt = purchasecnt;
	}

	public Sale(String userid, int bookcode, int purchasecnt, String purchasedate) {
		super();
		this.userid = userid;
		this.bookcode = bookcode;
		this.purchasecnt = purchasecnt;
		this.purchasedate = purchasedate;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public int getBookcode() {
		return bookcode;
	}

	public void setBookcode(int bookcode) {
		this.bookcode = bookcode;
	}

	public int getPurchasecnt() {
		return purchasecnt;
	}

	public void setPurchasecnt(int purchasecnt) {
		this.purchasecnt = purchasecnt;
	}

	public String getPurchasedate() {
		return purchasedate;
	}

	public void setPurchasedate(String purchasedate) {
		this.purchasedate = purchasedate;
	}

	@Override
	public String toString() {
		return "Sale [userid=" + userid + ", bookcode=" + bookcode + ", purchasecnt=" + purchasecnt + ", purchasedate="
				+ purchasedate + "]";
	}

	
	
	
}
