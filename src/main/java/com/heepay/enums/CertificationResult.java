package com.heepay.enums;
public enum CertificationResult {

	PENDNG("PENDNG","待处理"),
	SUCCES("SUCCES","认证成功"),
	FAILED("FAILED","认证失败"),
	ERRORS("ERRORS","异常");
	
	String _value;
	
	String _content;
	
	CertificationResult(String value,String content){
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
		CertificationResult[] results = CertificationResult.values();
		String content="";
		for(CertificationResult result:results){
			if(result.getValue().equals(value)){
				content = result.getContent();
				break;
			}
		}
		return content;
	}
	
	
}
