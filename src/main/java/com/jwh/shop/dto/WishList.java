package com.jwh.shop.dto;

// 관심상품 dto
public class WishList {
	private String userid;	//회원 아이디
	private int bookcode;	//상품 번호
	
	
	public WishList() {}

	public WishList(String userid, int bookcode) {
		super();
		this.userid = userid;
		this.bookcode = bookcode;
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

	@Override
	public String toString() {
		return "WishList [userid=" + userid + ", bookcode=" + bookcode + "]";
	}
	
	
}
