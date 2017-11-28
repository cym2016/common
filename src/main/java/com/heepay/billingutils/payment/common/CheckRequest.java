package com.heepay.billingutils.payment.common;

import com.heepay.codec.Md5;
import com.heepay.enums.MerchantStatus;

public class CheckRequest {
  
  /**
   * payment_api必录项校验
   * desc为空则校验通过，否则失败
   * @param desc
   * @return
   */
  public boolean checkRequired(String desc){
    return "".equals(desc);
  }
	
	/** 手机号码校验
	 * @param phoneNo
	 * @return
	 */
	public boolean checkPhoneNo(String phoneNo) {
		if(phoneNo.length() == 11 && phoneNo.startsWith("1")){
			return true;
		} else {
			return false;
		}
	}
	
	/** 银行卡号校验
	 * @param bankcardNo
	 * @return
	 */
	public boolean checkBankcardNo(String bankcardNo) {
		int length = bankcardNo.length();
		if(length >= 16 && length <= 21){
			return true;
		} else {
			return false;
		}
	}
	
	/** 金额校验
	 * @param amount
	 * @return
	 */
	public boolean checkAmount(String amount) {
		try{
			Double.parseDouble(amount);
			return true;
		} catch(NumberFormatException e){
			return false;
		}
		
	}
	
	/** 身份证号校验
	 * @param certNo
	 * @return
	 */
	public boolean checkCertNo(String certNo) {
		if(certNo.length() == 18){
			return true;
		} else {
			return false;
		}
	}
	
	/** 签名校验
	 * @param sign
	 * @return
	 */
	public boolean checkSign(String signWithoutKey, String merchantKey, String signRequest) {
	  String fullSign = signWithoutKey + "key=" + merchantKey;
	  String signGenerated = Md5.encode(fullSign);
		return signGenerated.equals(signRequest);
	}
	
	/** IP校验
	 * @param ip
	 * @return
	 */
	public boolean checkIp(String ip) {
		
		return true;
	}
	
	/**     
	* @discription 商户状态校验
	* @author 刘栋       
	* @created 2016年8月22日 下午8:44:06     
	* @param status
	* @return boolean
	*/
	public boolean checkMerchantStatus(String status) {
	  if(MerchantStatus.NORMAL.getValue().equals(status)){
	    return true;
	  } else {
	    return false;
	  }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(this.checkAmount(".01"));
		
		
		
	}

}
