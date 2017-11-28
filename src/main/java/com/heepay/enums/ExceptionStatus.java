package com.heepay.enums;

/**
 *      
* 
* 描    述：异常状态值
*
* 创 建 者： yanxb  
* 创建时间： 2016年9月29日 上午11:21:19 
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
    
public enum ExceptionStatus {

	NORMAL("NORMAL","正常"),
	UN_NORMAL("UN_NOR","异常");
	

	//风控拦截类
	
	String _value; 
	
	/**
	 * 存放内容
	 */
	String _Content;
	
	/**
	 * 私有构造函数
	 * @param value 枚举值
	 * @param content 缓存内容
	 * @return 
	 */
	ExceptionStatus(String value, String content) {  
		this._value = value;  
		this._Content = content;  
	}  
	
	/**
	 * 取得枚举对象值
	 * @return 枚举对象值
	 */
	public String getValue() {
		return this._value;
	}
	
	/**
	 * 取得缓存内容
	 * @return 缓存内容
	 */
	public String getContent() {
		return this._Content;
	}
	/**
	 * 
	 * @description 根据错误编码获取错误信息
	 * @author TianYanqing      
	 * @created 2016年9月26日 下午1:58:05     
	 * @param value
	 * @return
	 */
	public static String getContentByValue(String value){
		ExceptionStatus[] statuses = ExceptionStatus.values();
		String content="";
		for(ExceptionStatus status:statuses){
			if(status.getValue()==value){
				content = status.getContent();
				break ;
			}
		}
		return content;
	}
	
	
}
