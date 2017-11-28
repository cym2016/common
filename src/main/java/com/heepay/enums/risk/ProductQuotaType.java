package com.heepay.enums.risk;

/**
 * 
 *
 * 描    述：风控规则-限额
 *
 * 创 建 者：   wangdong
 * 创建时间：2016年12月27日 下午12:35:43
 * 创建描述：
 *
 * 修 改 者：
 * 修改时间：
 * 修改描述：
 *
 * 审 核 者：
 * 审核时间：
 * 审核描述：
 *
 */
public enum ProductQuotaType {
	/**
	 * 单笔
	 */
	PERITEM("PERITEM", "单笔"),
	/**
	 * 单日
	 */
	PERDAY("PERDAY", "单日"),
	/**
	 * 单月
	 */
	PERMONTH("PERMONTH", "单月"),
	/**
	 * /**
	 * 单日批次
	 */
	PERDAYBATCH("PERDAYBATCH", "单日批次"),
	/**
	 * 单月
	 */
	PERMONTHBATCH("PERMONTHBATCH", "单月批次"),
	/**
	 * 商户产品被禁用
	 */
	DISABLE("DISABLE", "商户产品被禁用"),
	/**
	 * 黑名单
	 */
	BLACK("BLACK", "黑名单");
	
	
	
	String _value; 
	
	/**
	 * 存放内容
	 */
	String _content;
	
	/**
	 * 私有构造函数
	 * @param value 枚举值
	 * @param content 缓存内容
	 * @return 
	 */
	ProductQuotaType(String value, String content) {  
		this._value = value;  
		this._content = content;  
	}  
	
	/**
	 * 取得枚举对象值
	 * @return 枚举对象值
	 */
	public String getValue() {
		return this._value;
	}
	
	/**
	 * 取得内容
	 * @return 内容
	 */
	public String getContent() {
		return this._content;
	}
	/**
	 * 根据值取得内容
	 * 
	 * @return 内容
	 */

	public static ProductQuotaType getBean(String value) {
		for (ProductQuotaType e : ProductQuotaType.values()) {
			if (value.equals(e.getValue())) {
				return e;
			}
		}
		return null;
	}
	
	public static String labelOf(String val) {
		if (getBean(val) != null) {
			return getBean(val).getContent();
		}
		return null;
	}
}
