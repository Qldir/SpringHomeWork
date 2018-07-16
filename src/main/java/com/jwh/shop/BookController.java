package com.jwh.shop;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jwh.shop.dao.BookDaoManager;
import com.jwh.shop.dao.SaleDaoManager;
import com.jwh.shop.dto.Book;
import com.jwh.shop.dto.Order;
import com.jwh.shop.dto.Sale;
import com.jwh.shop.dto.WishList;

@Controller
public class BookController {
	
	@Autowired
	BookDaoManager bookManager;
	
	@Autowired
	SaleDaoManager saleManager;
	
	
	//상품 목록
	@RequestMapping(value = "/bookList", method = RequestMethod.GET)
	public String bookList(Model model) {
		
		List<Book> bookList = bookManager.bookList();
		model.addAttribute("bookList",bookList);
		
		return "bookList";
	}
	
	
	//상품 정보
	@RequestMapping(value = "/bookInfo", method = RequestMethod.GET)
	public String bookInfo(Model model, Book book) {
		
		Book bookInfo = bookManager.bookInfo(book.getBookcode());
		model.addAttribute("book", bookInfo);
		
		return "bookInfo";
	}
	
	
	//상품 구매
	@RequestMapping(value = "/buyBook", method = RequestMethod.POST)
	public String buyBook(Sale sale) {
		
		int insertResult = saleManager.insertSale(sale);
		int updateResult = bookManager.updateBookInfo(sale);
		
		System.out.println("구매완료!!");
		
		return "redirect:/orderList";
	}
	
	
	//관심상품 추가
	@RequestMapping(value = "/addWishList", method = RequestMethod.POST)
	public String addWishList(HttpSession hsession, WishList wishList) {
		
		String userid = (String) hsession.getAttribute("userid");
		wishList.setUserid(userid);
				
		int result = bookManager.insertWish(wishList);
		
		return "redirect:/wishList";
	}
	
	
	//주문 목록
	@RequestMapping(value = "/orderList", method = RequestMethod.GET)
	public String orderList(Model model, HttpSession hsession) {
		
		//세션의 userid 부분 가져옴
		String userid = (String) hsession.getAttribute("userid");
		
		ArrayList<Order> orderList = new ArrayList<Order>();
		
		List<Sale> saleList = saleManager.saleList(userid);
		
		int totalPrice = 0;
		
		for(Sale sale : saleList) {
			Book book = bookManager.bookInfo(sale.getBookcode());
			
			Order order = new Order(sale.getPurchasedate(),
									sale.getBookcode(),
									book.getTitle(),
									book.getPrice(),
									sale.getPurchasecnt());
			
			orderList.add(order);
			
			totalPrice += order.getPrice() * order.getQuantity();
		}

		
		model.addAttribute("orderList", orderList);
		model.addAttribute("totalPrice", totalPrice);
		
		return "orderList";
	}
	
	
	//관심상품 목록
	@RequestMapping(value = "/wishList", method = RequestMethod.GET)
	public String wishList(Model model, HttpSession hsession) {
		
		String userid = (String) hsession.getAttribute("userid");
		
		List<WishList> list = bookManager.wishList(userid);
		
		
		List<Book> wishList = new ArrayList<Book>();
		
		for(WishList wish : list) {
			Book book = bookManager.bookInfo(wish.getBookcode());
			
			wishList.add(book);
		}
		System.out.println(wishList);
		
		model.addAttribute("wishList", wishList);
		
		return "wishList";
	}
	
	
	//관심상품 삭제
	@RequestMapping(value = "/wishDelete", method = RequestMethod.POST)
	public String wishDelete(HttpSession hsession, WishList wishList) {
		
		String userid = (String) hsession.getAttribute("userid");
		wishList.setUserid(userid);
		
		int result = bookManager.deleteWish(wishList);
		
		return "redirect:/wishList";
	}
	
	
	//베스트셀러
	@RequestMapping(value = "/bestSeller", method = RequestMethod.GET)
	public String bestSeller(Model model) {
		
		Sale sale = saleManager.saleBest();
		
		Book book = bookManager.bookInfo(sale.getBookcode());
		
		model.addAttribute("book", book);
		model.addAttribute("totalAmount", sale.getPurchasecnt());
		
		return "bestSeller";
	}
}
