package com.heepay.enums.billing;


import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 
 *
 * 描    述：差异处理的备注
 *
 * 创 建 者：   wangdong
 * 创建时间：2016年12月27日 下午1:52:55
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
public enum ErrorNoteType {
	/**
	 * 通道有该笔记录
	 */
	CHANNEL_Y("Y","通道有该笔记录"),
	
	/**
	 * 通道无该笔记录
	 */
	CHANNEL_N("N","通道无该笔记录"),
	
	/**
	 * 交易无记录
	 */
	CHANNEL_S("S","交易无记录");
  
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
	ErrorNoteType(String value, String content) {  
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
	 * 取得内容
	 * @return 内容
	 */
	public String getContent() {
		return this._Content;
	}

	/**
	 * 
	 * @description 根据value获取content,用于页面显示
	 * @author TianYanqing      
	 * @created 2016年9月23日 下午12:02:11     
	 * @param value
	 * @return
	 */
	public static String getContentByValue(String value){
		ErrorNoteType[] types = ErrorNoteType.values();
		String content="";
		for(ErrorNoteType type:types){
			if(type.getValue().equals(value)){
				content=type.getContent();
				break;
			}
		}
		return content;
	}

	/**
	 * 查看是否包含参数值
	 * @param value
	 * @return
	 */
	public static Map<String,String> transTypeMap(){
		Map<String,String> map = new LinkedHashMap<String,String>();
		for(ErrorNoteType transType : ErrorNoteType.values()){
			map.put(transType.getValue(),transType.getContent());
		}
		return map;
	}
	
	/**
	 * 根据值取得内容
	 * 
	 * @return 内容
	 */
	public static ErrorNoteType getBean(String value) {
		for (ErrorNoteType e : ErrorNoteType.values()) {
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
