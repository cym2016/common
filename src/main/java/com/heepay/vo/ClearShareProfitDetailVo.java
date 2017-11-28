package com.heepay.vo;



/***
 * 
* 
* 描    述：分润明细
*
* 创 建 者： xuangang
* 创建时间：  2016年11月2日上午11:28:38
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
public class ClearShareProfitDetailVo {
	
	private String merchantId; // 商户编码
	private String transNo;   // 交易单号
	private String profitAmount; //分润金额
    private String transType;      //交易类型

    private String shareDetailId;         //分润id
	
	public String getMerchantId() {
		return merchantId;
	}
	
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}
	
	public String getTransNo() {
		return transNo;
	}
	
	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}
	public String getProfitAmount() {
		return profitAmount;
	}
	public void setProfitAmount(String profitAmount) {
		this.profitAmount = profitAmount;
	}

	

	public String getTransType() {
		return transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getShareDetailId() {
		return shareDetailId;
	}

	public void setShareDetailId(String shareDetailId) {
		this.shareDetailId = shareDetailId;
	}

}
