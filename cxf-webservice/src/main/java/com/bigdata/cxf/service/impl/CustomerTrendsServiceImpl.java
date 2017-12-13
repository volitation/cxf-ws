package com.bigdata.cxf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bigdata.cxf.dao.CustomerTrendsDao;
import com.bigdata.cxf.entity.CustomerTrends;
import com.bigdata.cxf.service.CustomerTrendsService;
import com.bigdata.cxf.utils.JsonUtils;

/**
 * 客户趋势
 * 		-- Service层实现类
 * 
 * @author volitation
 *
 */
@Service("customerTrendsService")
public class CustomerTrendsServiceImpl implements CustomerTrendsService {
	
	@Autowired
	private CustomerTrendsDao customerTrendsDao;

	public Object getCustomerTrends() {
		List<CustomerTrends> list = customerTrendsDao.listCustomerTrends();
		return JsonUtils.toJSON(list,false);
	}

}
