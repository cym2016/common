package com.heepay.enums.pbc;


/***
 * 
* 
* 描    述：交易编码
*
* 创 建 者：wangl
* 创建时间：  Dec 13, 201611:09:09 AM
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
public enum PbcTransCode {

	/**
	 * 案件举报
	 */
	PBC_TRANS_CODE_1("A00401","交易编码"),
	
	/**
	 * 可疑名单上报-异常开户报文格式
	 */
	PBC_TRANS_CODE_2("A00402","交易编码"),
	
	/**
	 * 可疑名单上报-涉案账户报文格式
	 */
	PBC_TRANS_CODE_3("A00403","交易编码"),

	/**
	 * 可疑名单上报-异常事件报文格式
	 */
	PBC_TRANS_CODE_404("A00404","交易编码"),
	
	/**
	 * 可疑名单上报-涉案账户历史明细
	 */
	PBC_TRANS_CODE_405("A00405","交易编码"),
	
	/**
	 * 可疑交易上报-单笔交易上报
	 */
	PBC_TRANS_CODE_406("A00406","交易编码"),

	/**
	 * 账户涉案/可疑名单验证报文格式
	 */
	PBC_TRANS_CODE_501("A00501","交易编码"),

	/**
	 * 身份涉案/可疑名单验证报文格式
	 */
	PBC_TRANS_CODE_502("A00502","交易编码");
	
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
	PbcTransCode(String value, String content) {  
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

	public static PbcTransCode getBean(String value) {
		for (PbcTransCode e : PbcTransCode.values()) {
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
