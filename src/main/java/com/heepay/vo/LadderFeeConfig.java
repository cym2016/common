/**     
*   Copyright © since 2008. All Rights Reserved 
*   汇元银通（北京）在线支付技术有限公司   www.heepay.com    
*/
    
package com.heepay.vo;

import java.math.BigDecimal;

/**          
* 
* 描    述：阶梯费率配置
*
* 创 建 者： 刘栋  
* 创建时间： 2016年8月22日 下午4:14:51 
* 创建描述：存放商户阶梯费率的配置信息
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

public class LadderFeeConfig {
  
  //层级(存放时按照上下限从小到大排序)
  private int level;
  //下限
  private BigDecimal lowerBound;
  //上限
  private BigDecimal upperBound;
  //层级费率计算方式
  private String feeType;
  //层级费率
  private String feeRatio;
  
  public int getLevel() {
    return level;
  }
  
  public void setLevel(int level) {
    this.level = level;
  }
  
  public BigDecimal getLowerBound() {
    return lowerBound;
  }
  
  public void setLowerBound(BigDecimal lowerBound) {
    this.lowerBound = lowerBound;
  }
  
  public BigDecimal getUpperBound() {
    return upperBound;
  }
  
  public void setUpperBound(BigDecimal upperBound) {
    this.upperBound = upperBound;
  }
  
  public String getFeeType() {
    return feeType;
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
  
}
