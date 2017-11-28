
package com.heepay.vo;

import java.util.List;

/**          
* 
* 描    述：手续费VO
*
* 创 建 者： 刘栋  
* 创建时间： 2016年9月14日 上午11:07:47 
* 创建描述：手续费缓存模型。
* 		         存取方式为hset/hget：
* 			key=Constants.RedisKey.PRODUCT_FEE_PRIFIX+merchantId+productCode;
* 			field=bankId+bankcardType或Constants.RedisKey.PRODUCT_FEE_NOBANK。
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
    
public  class ProductFeeVO{
	//手续费收取方式(坐扣、外扣)
	private String feeCollectType;
	//产品的费率方式(按比例、按笔数)
	private String feeType;
	//产品的费率
	private String feeRatio;
	//手续费下限
	private String minFee;
	//手续费上限
	private String maxFee;
	//阶梯费率配置 暂时不用
//	private List<LadderFeeConfig> ladderFeeConfig;
	
	public String getFeeType() {
		return feeType;
	}
	public String getFeeCollectType() {
		return feeCollectType;
	}
	public void setFeeCollectType(String feeCollectType) {
		this.feeCollectType = feeCollectType;
	}
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}
	public String getFeeRatio() {
		return feeRatio;
	}
	public void setFeeRatio(String feeRatio) {
		this.feeRatio = feeRatio;
	}
	public String getMinFee() {
		return minFee;
	}
	public void setMinFee(String minFee) {
		this.minFee = minFee;
	}
	public String getMaxFee() {
		return maxFee;
	}
	public void setMaxFee(String maxFee) {
		this.maxFee = maxFee;
	}
	@Override
	public String toString() {
		return "ProductFeeVO [feeCollectType=" + feeCollectType + ", feeType=" + feeType + ", feeRatio=" + feeRatio
				+ ", minFee=" + minFee + ", maxFee=" + maxFee + "]";
	}

}

