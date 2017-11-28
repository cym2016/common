
package com.heepay.vo;

/**
 * 产品VO
 * @author zhangchen
 * 2016年8月15日
 */
public  class ProductVO{
 
    
  //产品名称
  private  String productName;

  //产品编码
  private String productCode;
  
  //产品状态
  private String productStatus;

  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public String getProductCode() {
    return productCode;
  }

  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }

  public String getProductStatus() {
    return productStatus;
  }

  public void setProductStatus(String productStatus) {
    this.productStatus = productStatus;
  }
  
}

