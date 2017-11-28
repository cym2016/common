package com.heepay.enums;
/**
 * 
* 
* 描    述：银行卡，身份证，姓名，手机 4要素鉴权
*
* 创 建 者：zhangchen
* 创建时间： 2017年2月20日 下午2:24:47 
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
public enum AuthenticationResult {

	PENDNG("PENDNG","待处理"),
	SUCCES("SUCCES","鉴权成功"),
	FAILED("FAILED","鉴权失败"),
	ERRORS("ERRORS","异常");
	
	String _value;
	
	String _content;
	
	AuthenticationResult(String value,String content){
		this._value = value;
		this._content=content;
	}
	
	public String getValue(){
		return this._value;
	}
	
	public String getContent(){
		return this._content;
	}
	
	public static String getContentByVal(String value){
		AuthenticationResult[] results = AuthenticationResult.values();
		String content="";
		for(AuthenticationResult result:results){
			if(result.getValue().equals(value)){
				content = result.getContent();
				break;
			}
		}
		return content;
	}
	
	
}
