package com.heepay.common.util;

import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/***
 * 
* 
* 描    述：
*
* 创 建 者： 杨春龙  
* 创建时间： 2016年8月24日 下午6:46:50 
* 创建描述：正则表达式校验
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
public class RegExpression {
    //手机号
	public static final String Mobile="(^13\\d{9}$)|(^14\\d{9}$)|(^15\\d{9}$)|(^16\\d{9}$)|(^17\\d{9}$)|(^18\\d{9}$)|(^19\\d{9}$)";
	//身份证号
	public static final String IdCard="(^\\d{15}$)|(^\\d{18}$)|(^\\d{17}(\\d|X|x)$)";
	//银行卡号
	public static final String BankCard="^(\\d{14}|\\d{15}|\\d{16}|\\d{17}|\\d{18}|\\d{19})";
	//对公对私账号,规则没有确定
	public static final String PUBLIC_BANK_CARD="^(\\d{1,25})";
	//数字
	public static final String NUMBER="^[0-9]+$";
	//金额
	public static final String Amount="^[0-9]+(.[0-9]{1,2})?$";
	public static final String one2FourPointAmount="^[0-9]+(.[0-9]{1,4})?$";
	
	//[\u4E00-\u9FA5]{2,5}(?:·[\u4E00-\u9FA5]{2,5})* 
	//中文姓名
	public static final String CHINESE_CHARACTER="[\u4E00-\u9FA5]{2,5}(?:·[\u4E00-\u9FA5]{2,5})*";
	
	//校验对公对私银行账号
	public static boolean regPublicBankCard(String bankcardNo){
		if(StringUtil.isBlank(bankcardNo)){
			return false;
		}
		return regExpresMethod(PUBLIC_BANK_CARD,bankcardNo);
	}
	//校验数字
	public static boolean regNumber(String number){
		if(StringUtil.isBlank(number)){
			return false;
		}
		return regExpresMethod(NUMBER,number);
	}
	
	//校验身份证号
	public static boolean regIdCard(String idCardNo){
		if(StringUtil.isBlank(idCardNo)){
			return false;
		}
		return regExpresMethod(IdCard,idCardNo);
	}
	//校验手机号
	public static boolean regMobile(String mobileNo){
		if(StringUtil.isBlank(mobileNo)){
			return false;
		}
		return regExpresMethod(Mobile,mobileNo);
	}
	//校验银行卡号
	public static boolean regBankCard(String bankCardNo){
		if(StringUtil.isBlank(bankCardNo)){
			return false;
		}
		return regExpresMethod(BankCard,bankCardNo);
	}	
	
	public static boolean regChineseName(String name){
		if(StringUtil.isBlank(name)){
			return false;
		}
		return regExpresMethod(CHINESE_CHARACTER,name);
	}
	
	//金额校验  大于0的整数或者小数 小数点后2位
	public static Boolean regAmount(String amount){
		if(StringUtil.isBlank(amount)){
			return false;
		}
		boolean flag= regExpresMethod(Amount,amount);
		if(flag){
		    BigDecimal bd=new BigDecimal(amount);
		    if(bd.compareTo(BigDecimal.ZERO)==0){
		    	flag=false;
		    }		
		}
		return flag;

	}
	//金额校验  大于0的整数或者小数 小数点后1-4位
	public static Boolean regOne2FourPointAmount(String amount){
		if(StringUtil.isBlank(amount)){
			return false;
		}
		boolean flag= regExpresMethod(one2FourPointAmount,amount);

		return flag;
	}
	
	//校验其他 参数:reg 正则表达式  ,param 需要校验的参数 
	public static boolean regExpresMethod(String reg,String param){		
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(param);
		boolean b= matcher.matches();
		return b;
	}

}
