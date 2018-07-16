package com.jwh.shop;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jwh.shop.dao.MemberDaoManager;
import com.jwh.shop.dto.Member;

@Controller
public class MemberController {
	
	@Autowired
	MemberDaoManager manager;
	
	//회원가입 폼
	@RequestMapping(value = "/joinForm", method = RequestMethod.GET)
	public String joinForm() {
		return "joinForm";
	}
	
	//회원가입
	@RequestMapping(value = "/join", method = RequestMethod.POST)
	public String join(Member member) {
		
		int result = manager.insertMember(member);
		
		System.out.println(result+" 명 회원 등록 성공!"); //db에 들어갔는지 check
		
		return "redirect:/";
	}
	
	
	//로그인 폼
	@RequestMapping(value = "/loginForm", method = RequestMethod.GET)
	public String loginForm() {
		return "loginForm";
	}
	
	//로그인 체크
	@RequestMapping(value = "/loginCheck", method = RequestMethod.GET)
	public String loginCheck() {
		return "loginCheck";
	}
	
	//로그인
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Member member, HttpSession hsession) {
		
		System.out.println(member);
		Member result = new Member();
		result = manager.login(member);
		
		System.out.println(result);
		
		if(result != null) {	//받아온 id와 pw정보가 db에서 일치하면 세션에 저장
			hsession.setAttribute("userid", result.getUserid());
			hsession.setAttribute("username", result.getUsername());
			
			System.out.println("로그인 정보 세션 저장 완료");
		}
		
		return "redirect:/";
	}
	
	
	//로그아웃
		@RequestMapping(value = "/logout", method = RequestMethod.GET)
		public String logout(HttpSession hsession) {
			
			hsession.invalidate();	//세션삭제
			
			return "redirect:/";
		}

}
