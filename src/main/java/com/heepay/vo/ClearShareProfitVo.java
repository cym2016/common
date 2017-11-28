package com.heepay.vo;

import java.util.List;



/***
 * 
* 
* 描    述：分润主数据
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
public class ClearShareProfitVo {
  
  private String merchantId; // 商户编码
	private String transNo;   // 交易单号
	private String shareId;   // 分润号
  private boolean isShare;      //是否分润
  
  private String settleCyc;// 结算类型
  
  public String toString() {
    StringBuilder sb = new StringBuilder(128);
      sb.append("merchantId:").append(merchantId).append(",")
      .append("transNo:").append(transNo) .append(",")
      .append("shareId:").append(shareId).append(",")
      .append("isShare:").append(isShare).append(",")
      .append("settleCyc:").append(settleCyc);
    return sb.toString();
  }
  public String getSettleCyc() {
    return settleCyc;
  }

  public void setSettleCyc(String settleCyc) {
    this.settleCyc = settleCyc;
  }
  
	private List<ClearShareProfitDetailVo> shareDetailList ;//包含的分润明细
	
	
	public String getShareId() {
    return shareId;
  }

  public void setShareId(String shareId) {
    this.shareId = shareId;
  }
  
  
	public List<ClearShareProfitDetailVo> getShareDetailList() {
    return shareDetailList;
  }

  public void setShareDetailList(List<ClearShareProfitDetailVo> shareDetailList) {
    this.shareDetailList = shareDetailList;
  }

  public String getMerchantId() {
    return merchantId;
  }
  
  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }
  
  public boolean isShare() {
    return isShare;
  }
  public void setShare(boolean isShare) {
    this.isShare = isShare;
  }
	
	
	public String getTransNo() {
		return transNo;
	}
	
	public void setTransNo(String transNo) {
		this.transNo = transNo;
	}

}
