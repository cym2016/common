package com.heepay.enums.pbc;

/**
 * *
 * 
* 
* 描    述：PbcPaymentAccount用到的值
*
* 创 建 者： wangl
* 创建时间：  2016年12月13日下午4:27:48
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
public enum PbcPaymentAccountEnums {
	
	/**
	 * 接收机构ID
	 */
	PBC_TOID("111111000000","toId"),
	/**
	 * 交易类型编码
	 */
	PBC_TRANSTYPECODE("A00403","transTypeCode"),
	
	/**
	 * 上报机构编码
	 */
	PBC_REPORTCODES("Z11611000017","reportCodes"),
	
	/**
	 * 反馈机构名称
	 */
	PBC_FEED_NAME("汇元银通（北京）在线支付技术有限公司","feedName"),
	
	/**
	 * 我方经办人电话 默认写风控办公电话（有配置的地方)
	 */
	PBC_NUMBER("010-5979877","operatorPhoneNumber");
	
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
	PbcPaymentAccountEnums(String value, String content) {  
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

	public static PbcPaymentAccountEnums getBean(String value) {
		for (PbcPaymentAccountEnums e : PbcPaymentAccountEnums.values()) {
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
