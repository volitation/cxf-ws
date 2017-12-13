package com.bigdata.cxf.ws;

import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.bigdata.cxf.service.CustomerTrendsService;
import com.bigdata.cxf.utils.AbnormalUtils;
/**
 * 客户趋势
 * 		-- WebService接口层
 * 
 * @author volitation
 *
 */
@WebService
@SOAPBinding(style = Style.RPC)
public class CustomerTrendsWebService {
	
	private static Logger logger = LogManager.getLogger(CustomerTrendsWebService.class);
	
	@Resource
	private CustomerTrendsService customerTrendsService;
	
	/**
	 * 最近12个月的客户趋势数据接口
	 * 
	 * @return
	 */
	@WebMethod 
	public Object showCustomertrends() {
		Object obj = null;
		try{
			long startTime = System.currentTimeMillis();
			obj = customerTrendsService.getCustomerTrends();
			long endTime = System.currentTimeMillis();
			logger.info("获取最近12个月的客户趋势数据，用时： " + (endTime - startTime) + "ms。");
			
		}catch(Exception e){
			logger.error("error message: ", e);
			return AbnormalUtils.getAbnormal(e.getCause().getClass().toString(), e.getCause().getMessage());
		}
		return obj;
	}

}
