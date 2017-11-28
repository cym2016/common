/**
 *   Copyright © since 2008. All Rights Reserved
 *   汇元银通（北京）在线支付技术有限公司   www.heepay.com
 */
package com.heepay.risk;

import java.util.Date;


/***
 * 
* 
* 描    述：风控管理后台页面中,商户订单冻结页面用的VO类
*
* 创 建 者：wangl
* 创建时间：  Dec 8, 20161:38:57 PM
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
public class RiskForPaymentVO{
	
	private Long merchantId;		// 商户ID
	private String merchantLoginName;		// 商户登录账号
	private Date successTime;		// 成功时间
	
	private String transType;		// 交易类型
	private String successAmount;		// 成功金额
	private String transNo;		// 汇付宝交易号记录各种业务类型的交易订单号
	private String payType;		// 支付类型
	private String feeWay;		// 手续费扣除方式
	private String feeWayVo;		// 手续费扣除方式的中间属性
	private String fee;		// 手续费
	
	//用于页面查询的属性
	private Date beginCreateTime;		// 开始时间
	private Date endCreateTime;		// 结束时间
	private String repeat;//用来判断是否是重复数据
	
	
	public String getFeeWayVo() {
		return feeWayVo;
	}
	public void setFeeWayVo(String feeWayVo) {
		this.feeWayVo = feeWayVo;
	}
	public String getRepeat() {
		return repeat;
	}
	public void setRepeat(String repeat) {
		this.repeat = repeat;
	}
	public Date getBeginCreateTime() {
		return beginCreateTime;
	}
	public void setBeginCreateTime(Date beginCreateTime) {
		this.beginCreateTime = beginCreateTime;
	}
	public Date getEndCreateTime() {
		return endCreateTime;
	}
	public void setEndCreateTime(Date endCreateTime) {
		this.endCreateTime = endCreateTime;
	}
	public Long getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(Long merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantLoginName() {
		return merchantLoginName;
	}
	public void setMerchantLoginName(String merchantLoginName) {
		this.merchantLoginName = merchantLoginName;
	}
	public Date getSuccessTime() {
		return successTime;
	}
	public void setSuccessTime(Date successTime) {
		this.successTime = successTime;
	}
	public String getTransType() {
		return transType;
	}
	public void setTransType(String transType) {
		this.transType = transType;
	}
	public String getSuccessAmount() {
		return successAmount;
	}
	public void setSuccessAmount(String successAmount) {
		this.successAmount = successAmount;
	}
	public String getTransNo() {
		return transNo;
	}
	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public String getFeeWay() {
		return feeWay;
	}
	public void setFeeWay(String feeWay) {
		this.feeWay = feeWay;
	}
	public String getFee() {
		return fee;
	}
	public void setFee(String fee) {
		this.fee = fee;
	}
	public RiskForPaymentVO(Long merchantId, String merchantLoginName, Date successTime, String transType,
			String successAmount, String transNo, String payType, String feeWay, String fee, Date beginCreateTime,
			Date endCreateTime) {
		super();
		this.merchantId = merchantId;
		this.merchantLoginName = merchantLoginName;
		this.successTime = successTime;
		this.transType = transType;
		this.successAmount = successAmount;
		this.transNo = transNo;
		this.payType = payType;
		this.feeWay = feeWay;
		this.fee = fee;
		this.beginCreateTime = beginCreateTime;
		this.endCreateTime = endCreateTime;
	}
	public RiskForPaymentVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}