package com.jwh.shop.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwh.shop.dto.Member;

@Repository
public class MemberDaoManager implements MemberMapper{
	
	@Autowired
	SqlSession session;

	@Override
	public int insertMember(Member member) {

		int result = 0;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			result = mapper.insertMember(member);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public Member login(Member member) {
		
		Member result = null;
		
		try {
			MemberMapper mapper = session.getMapper(MemberMapper.class);
			result = mapper.login(member);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
