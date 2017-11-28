package com.heepay.vo;

public class ClearChannelRecordVO {

	
	 
    private String channelCode; // 通道编码
	  private String paymentId; // 支付订单号
	  private String paymentIdOld;  //原支付订单号
	  private String payAmount; //订单金额（商户的）
	  
	  
   
    private String settleCyc;//结算类型     订单结算周期    对应查询路由信息字段  OrderSettlePeriod
    private String costWay; // 手续费扣除方式   对应查询路由信息字段  ChargeDeductType
    //private String costSettleCyc; // 手续费结算周期     对应查询路由信息字段  SettlePeriod
    //private String channelType; // 通道类型       对应查询路由信息字段  ChannelTypeCode

    private String transType; // 交易类型
    private String bankId;//银行id
    private String bankName;//银行名称
    private String bankSerialNo;//银行流水号
  
    private String merchantId; // 商户编码
	private String merchantCompany;// 商户公司名
	private String merchantType; // 商户类型
	private String productCode; // 业务类型
	private String currency; // 币种
	private String transNo; // 交易单号
	private String paymentID; // 支付单号
	private String merchantOrderNo;// 用户订单号
	private String transNoOld; // 原交易单号
	private String requestAmount; // 订单金额
	private String feeAmount; // // 手续费

	private String payTime; // 交易日期
	private String successTime; // 交易支付日期
	private String successAmount; // 交易金额（银行返回的）

	//private String feeSettleCyc; // 手续费结算周期
	private String feeWay; // 手续费扣除方式

	private String  createTime; //创建时间
	private String  bankcardType;//银行卡类型
	private String  payType;//支付类型

	private String channelFee; //通道成本
	private String checkBatch; //对账批次
    
    
    public String getMerchantId() {
		return merchantId;
	}

	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantCompany() {
		return merchantCompany;
	}

	public void setMerchantCompany(String merchantCompany) {
		this.merchantCompany = merchantCompany;
	}

	public String getMerchantType() {
		return merchantType;
	}

	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getPaymentID() {
		return paymentID;
	}

	public void setPaymentID(String paymentID) {
		this.paymentID = paymentID;
	}

	public String getMerchantOrderNo() {
		return merchantOrderNo;
	}

	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getRequestAmount() {
		return requestAmount;
	}

	public void setRequestAmount(String requestAmount) {
		this.requestAmount = requestAmount;
	}

	public String getFeeAmount() {
		return feeAmount;
	}

	public void setFeeAmount(String feeAmount) {
		this.feeAmount = feeAmount;
	}

	public String getSuccessTime() {
		return successTime;
	}

	public void setSuccessTime(String successTime) {
		this.successTime = successTime;
	}

	public String getFeeWay() {
		return feeWay;
	}

	public void setFeeWay(String feeWay) {
		this.feeWay = feeWay;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getBankcardType() {
		return bankcardType;
	}

	public void setBankcardType(String bankcardType) {
		this.bankcardType = bankcardType;
	}

	public String getPayType() {
		return payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public String toString(){
      StringBuilder sb=new StringBuilder(128);
      sb.append("{\"channelCode\":\"").append(channelCode).append("\",")
        .append("\"currency\":\"").append(currency).append("\",")
        .append("\"payTime\":\"").append(payTime).append("\",")
        .append("\"paymentId\":\"").append(paymentId).append("\",")
        .append("\"transNo\":\"").append(transNo).append("\",")
        .append("\"transNoOld\":\"").append(transNoOld).append("\",")
        .append("\"paymentIdOld\":\"").append(paymentIdOld).append("\",")
        .append("\"successAmount\":\"").append(successAmount).append("\",")
        .append("\"payAmount\":\"").append(payAmount).append("\",")
        .append("\"settleCyc\":\"").append(settleCyc).append("\",")
        .append("\"costWay\":\"").append(costWay).append("\",")
        .append("\"transType\":\"").append(transType).append("\",")
        .append("\"bankId\":\"").append(bankId).append("\",")
        .append("\"bankName\":\"").append(bankName).append("\",")
        .append("\"bankSerialNo\":\"").append(bankSerialNo).append("\",")
        .append("\"merchantId\":\"").append(merchantId).append("\",")
        .append("\"merchantCompany\":\"").append(merchantCompany).append("\",")
        .append("\"merchantType\":\"").append(merchantType).append("\",")
        .append("\"productCode\":\"").append(productCode).append("\",")
        .append("\"paymentID\":\"").append(paymentID).append("\",")
        .append("\"merchantOrderNo\":\"").append(merchantOrderNo).append("\",")
        .append("\"requestAmount\":\"").append(requestAmount).append("\",")
        .append("\"feeAmount\":\"").append(feeAmount).append("\",")
        .append("\"successTime\":\"").append(successTime).append("\",")
        .append("\"feeWay\":\"").append(feeWay).append("\",")
        .append("\"createTime\":\"").append(createTime).append("\",")
        .append("\"bankcardType\":\"").append(bankcardType).append("\",")
        .append("\"payType\":\"").append(payType).append("\",")
        .append("\"}");
      return sb.toString();
    }
  
    public String getBankId() {
      return bankId;
    }



    public void setBankId(String bankId) {
      this.bankId = bankId;
    }



    public String getBankName() {
      return bankName;
    }



    public void setBankName(String bankName) {
      this.bankName = bankName;
    }



    public String getBankSerialNo() {
      return bankSerialNo;
    }



    public void setBankSerialNo(String bankSerialNo) {
      this.bankSerialNo = bankSerialNo;
    }

    public String getSettleCyc() {
      return settleCyc;
    }



    


 



	public String getCostWay() {
		return costWay;
	}



	public void setCostWay(String costWay) {
		this.costWay = costWay;
	}



	



	public void setSettleCyc(String settleCyc) {
      this.settleCyc = settleCyc;
    }

    public String getPayAmount() {
      return payAmount;
    }
    public void setPayAmount(String payAmount) {
      this.payAmount = payAmount;
    }
    public String getTransType() {
      return transType;
    }
    public void setTransType(String transType) {
      this.transType = transType;
    }
    public String getChannelCode() {
      return channelCode;
    }
    public void setChannelCode(String channelCode) {
      this.channelCode = channelCode;
    }
    public String getCurrency() {
      return currency;
    }
    public void setCurrency(String currency) {
      this.currency = currency;
    }
    public String getPayTime() {
      return payTime;
    }
    public void setPayTime(String payTime) {
      this.payTime = payTime;
    }
    public String getPaymentId() {
      return paymentId;
    }
    public void setPaymentId(String paymentId) {
      this.paymentId = paymentId;
    }
   
    public String getTransNo() {
      return transNo;
    }
    public void setTransNo(String transNo) {
      this.transNo = transNo;
    }
    public String getTransNoOld() {
      return transNoOld;
    }
    public void setTransNoOld(String transNoOld) {
      this.transNoOld = transNoOld;
    }
    public String getPaymentIdOld() {
		return paymentIdOld;
	}
	public void setPaymentIdOld(String paymentIdOld) {
		this.paymentIdOld = paymentIdOld;
	}
	public String getSuccessAmount() {
      return successAmount;
    }
    public void setSuccessAmount(String successAmount) {
      this.successAmount = successAmount;
    }

	public String getChannelFee() {
		return channelFee;
	}

	public void setChannelFee(String channelFee) {
		this.channelFee = channelFee;
	}

	public String getCheckBatch() {
		return checkBatch;
	}

	public void setCheckBatch(String checkBatch) {
		this.checkBatch = checkBatch;
	}
}
