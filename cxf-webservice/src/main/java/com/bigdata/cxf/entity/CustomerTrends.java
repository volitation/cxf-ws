package com.bigdata.cxf.entity;
/**
 * 客户趋势
 * 
 * @author volitation
 *
 */
public class CustomerTrends {
	
	private String month;
	
	private Integer total;

	/**
	 * @return the month
	 */
	public String getMonth() {
		return month;
	}

	/**
	 * @param month the month to set
	 */
	public void setMonth(String month) {
		this.month = month;
	}

	/**
	 * @return the total
	 */
	public Integer getTotal() {
		return total;
	}

	/**
	 * @param total the total to set
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CustomerTrends [month=" + month + ", total=" + total + "]";
	}
	
	

}
