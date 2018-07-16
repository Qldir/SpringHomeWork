package com.jwh.shop.dao;

import com.jwh.shop.dto.Member;

public interface MemberMapper {
	public int insertMember(Member member);
	public Member login(Member member);
}
