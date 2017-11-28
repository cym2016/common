package com.heepay.risk;

import java.math.BigDecimal;

import com.heepay.common.util.StringUtil;

/**
 * 描    述：类说明 交易信息接口定义说明
 *
 * 创 建 者：王英雷  E-mail:wangyl@9186.com
 * 创建时间： 2016年11月28日 下午5:54:14
 * 创建描述：获取交易系统日志文件
 * 
 * 修 改 者：   王英雷
 * 修改时间：2016年12月21日 
 * 修改描述： 为反欺诈功能增加字段
 * 
 * 审 核 者：
 * 审核时间：
 * 审核描述：
 *
 */

public class RiskTransLogVo {

	private String trans_no;//交易订单号
	private long pay_time;//交易时间
	private BigDecimal pay_amount;//交易金额
	private String trans_type;//交易类型
	private long merchant_id;//商户编号
	private String merchant_login_name;//商户登录名
	private String type;//支付类型
	private String pay_status;//交易状态
	private String product_code;//产品编号
	private String request_type;//请求类型（0=网关接入1=接口接入2=SDK接入3=H5接入）
	private String bankcard_owner_type;//银行卡持卡人类型          0=个人1=企业
	private String bank_id;//银行ID
	
	private String bankcard_type;//银行卡类型             SAVING=储蓄卡 CREDIT=信用卡
	private String bankcard_no;//银行卡号
	private String channel_code;//渠道代码
	private String channel_name;//渠道名称
	private String merchant_order_no;//商户订单号
	private String fee_type; //手续费 类型 坐扣 外扣
	
	//#################################反欺诈开始###################################################
	private String bank_name;//银行名称
	private String trans_id;//交易流水ID号
	private String payment_id; //支付Id号
	private String bank_order_id; //银行流水号
	private String transaction_IP; //交易时IP地址
	private String transInBank_ID; //银行卡机构编码
	//##################################反欺诈结束##################################################
	
	
	public String getFee_type() {
		if (StringUtil.isBlank(fee_type))
		{
			return "null";
		}
		return fee_type;
	}
	public void setFee_type(String fee_type) {
		this.fee_type = fee_type;
	}
	public String getFee_amount() {
		if (StringUtil.isBlank(fee_amount))
		{
			return "0";
		}
		return fee_amount;
	}
	public void setFee_amount(String fee_amount) {
		this.fee_amount = fee_amount;
	}
	private String fee_amount; //手续费金额
	public String getTrans_no() {
		return trans_no;
	}
	public void setTrans_no(String trans_no) {
		this.trans_no = trans_no;
	}
	public long getPay_time() {
	    return pay_time;
	  }
	  public void setPay_time(long pay_time) {
	    this.pay_time = pay_time;
	  }
	
	public BigDecimal getPay_amount() {
		return pay_amount;
	}
	public void setPay_amount(BigDecimal pay_amount) {
		this.pay_amount = pay_amount;
	}
	public String getTrans_type() {
		return trans_type;
	}
	public void setTrans_type(String trans_type) {
		this.trans_type = trans_type;
	}
	public long getMerchant_id() {
		return merchant_id;
	}
	public void setMerchant_id(long merchant_id) {
		this.merchant_id = merchant_id;
	}
	public String getMerchant_login_name() {
		return merchant_login_name;
	}
	public void setMerchant_login_name(String merchant_login_name) {
		this.merchant_login_name = merchant_login_name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPay_status() {
		return pay_status;
	}
	public void setPay_status(String pay_status) {
		this.pay_status = pay_status;
	}
	public String getProduct_code() {
		if (StringUtil.isBlank(product_code))
		{
			return "null";
		}
		return product_code;
	}
	public void setProduct_code(String product_code) {
		this.product_code = product_code;
	}
	public String getRequest_type() {
		if (StringUtil.isBlank(request_type))
		{
			return "null";
		}
		return request_type;
	}
	public void setRequest_type(String request_type) {
		this.request_type = request_type;
	}
	public String getBankcard_owner_type() {
		if (StringUtil.isBlank(bankcard_owner_type))
		{
			return "null";
		}
		return bankcard_owner_type;
	}
	public void setBankcard_owner_type(String bankcard_owner_type) {
		
		this.bankcard_owner_type = bankcard_owner_type;
	}
	public String getBank_id() {
		if (StringUtil.isBlank(bank_id))
		{
			return "null";
		}
		return bank_id;
	}
	public void setBank_id(String bank_id) {
		this.bank_id = bank_id;
	}
	public String getBank_name() {
		if (StringUtil.isBlank(bank_name))
		{
			return "null";
		}
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	public String getBankcard_type() {
		if (StringUtil.isBlank(bankcard_type))
		{
			return "null";
		}
		return bankcard_type;
	}
	public void setBankcard_type(String bankcard_type) {
		this.bankcard_type = bankcard_type;
	}
	public String getBankcard_no() {
		if (StringUtil.isBlank(bankcard_no))
		{
			return "null";
		}
		return bankcard_no;
	}
	public void setBankcard_no(String bankcard_no) {
		this.bankcard_no = bankcard_no;
	}
	public String getChannel_code() {
		if (StringUtil.isBlank(channel_code))
		{
			return "null";
		}
		return channel_code;
	}
	public void setChannel_code(String channel_code) {
		this.channel_code = channel_code;
	}
	public String getChannel_name() {
		if (StringUtil.isBlank(channel_name))
		{
			return "null";
		}
		return channel_name;
	}
	public void setChannel_name(String channel_name) {
		this.channel_name = channel_name;
	}
	public String getMerchant_order_no() {
		if (StringUtil.isBlank(merchant_order_no))
		{
			return "null";
		}
		return merchant_order_no;
	}
	public void setMerchant_order_no(String merchant_order_no) {
		this.merchant_order_no = merchant_order_no;
	}
	public String getTrans_id() {
		if (StringUtil.isBlank(trans_id))
		{
			return "null";
		}
		return trans_id;
	}
	public void setTrans_id(String trans_id) {
		this.trans_id = trans_id;
	}
	public String getPayment_id() {
		if (StringUtil.isBlank(payment_id))
		{
			return "null";
		}
		return payment_id;
	}
	public void setPayment_id(String payment_id) {
		
		this.payment_id = payment_id;
	}
	public String getBank_order_id() {
		if (StringUtil.isBlank(bank_order_id))
		{
			return "null";
		}
		return bank_order_id;
	}
	public void setBank_order_id(String bank_order_id) {
		this.bank_order_id = bank_order_id;
	}
	public String getTransaction_IP() {
		if (StringUtil.isBlank(transaction_IP))
		{
			return "null";
		}
		return transaction_IP;
	}
	public void setTransaction_IP(String transaction_IP) {
		this.transaction_IP = transaction_IP;
	}
	public String getTransInBank_ID() {
		if (StringUtil.isBlank(transInBank_ID))
		{
			return "null";
		}
		return transInBank_ID;
	}
	public void setTransInBank_ID(String transInBank_ID) {
		this.transInBank_ID = transInBank_ID;
	}
	
	
	
}
