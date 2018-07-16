package com.jwh.shop.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jwh.shop.dto.Sale;

@Repository
public class SaleDaoManager implements SaleMapper{
	
	@Autowired
	SqlSession session;
	
	@Override
	public int insertSale(Sale sale) {
		
		int result = 0;
		
		try {
			SaleMapper mapper = session.getMapper(SaleMapper.class);
			result = mapper.insertSale(sale);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	@Override
	public List<Sale> saleList(String userid) {
		
		List<Sale> saleList = new ArrayList<Sale>();
		
		try {
			SaleMapper mapper = session.getMapper(SaleMapper.class);
			saleList = mapper.saleList(userid);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return saleList;
	}
	
	@Override
	public Sale saleBest() {
	
		Sale sale = new Sale();
		
		try {
			SaleMapper mapper = session.getMapper(SaleMapper.class);
			sale = mapper.saleBest();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return sale;
	}
}
