package com.bigdata.cxf.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bigdata.cxf.entity.CustomerTrends;

/**
 * 客户趋势
 * 		-- Dao层接口
 * 
 * @author volitation
 *
 */
@Repository("customerTrendsDao")
public interface CustomerTrendsDao {
	
	public List<CustomerTrends> listCustomerTrends();

}
