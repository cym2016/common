package com.heepay.common.util;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.heepay.enums.CurrencyType;
import com.heepay.enums.ProductType;

/**
* <p>Title: Constants.java</p>
* <p>Description: 这是一个常量类</p>
* <p>Company: hy</p> 
* @author W.X
* 
* @date 2016年6月7日
*/
public class Constants {
  public static final class LimitAmount{
	  public static final String onedayLimitJedisKey="d1limit_";
  }
  public static final class QuickPay{
    public static final String SYSTEM_KEY="112&^2YN_*!@azlk.^i9";
    public static final String SYSTEM_CHARGE_MERCHANTUSERID_KEY="hymerchant";
    public static final String ANTIPHISHING_KEY="antiPhishing";
    public static final BigDecimal MAX_AMOUNT=new BigDecimal("100000000"); 
    public static final BigDecimal TRANSFER_MAX_AMOUNT=new BigDecimal("2000000"); 
    public static final String CALLBACK_KEY="QP_callback";
  }
  public static final class WalletKey{
	  public static final String PAY_PASSWD_KEY="pay_Pass*w.d^K|ey008";
	  public static final String LOGIN_PASSWD_KEY="!Pass*wLogiN.d^Ke|y0zc08";	  
	  public static final String QUERY_CARDNO_KEY="!Keys*w^KeQuerY.d|08y0_c";	  
  }
  public static final class RedisKey{
    public static final String BANKLIST_REDIS_KEY="bankInfoCatch";
    public static final String PRODUCT_REDIS_KEY="productRedis";
    public static final String MERCHANTVO_REDIS_KEY="merchantVo";
    public static final String MERCHANTPRODUCTVO_REDIS_KEY="merchantProductVo";
    public static final String FEECALCULATOR_REDIS_KEY="feeCalculator";
    public static final String QUICKPAYGATEWAYTOKEN_REDIS_KEY="gatewayToken";
    public static final String QUICKPAY2GATEWAYTOKEN_REDIS_KEY="gateway2Token";
    public static final String QUICKPAY2_AUTH_REDIS_KEY="quickpay2Auth";
    public static final String QUICKPAY2_SMS_REDIS_KEY="quickpay2sms";
    
    //获取产品费率(hset:key=PRODUCT_FEE_KEY+merchantId+productCode,field=bankId+cardType)
    public static final String PRODUCT_FEE_PRIFIX="feeprifix";
    //当某产品不需要按银行区分费率时，field=PRODUCT_FEE_NOBANK
    public static final String PRODUCT_FEE_NOBANK="nobank";
    //充值的product_key
    public static final String CHARGE_PRODUCT_KEY="chargeProductKey";
    //提现的product_key
    public static final String WITHDRAW_PRODUCT_KEY="withdrawProductKey";
    //退款的product_key
    public static final String REFUND_PRODUCT_KEY="refundProductKey";
    //分润避免重复下单
    public static final String SHAER_KEY="shareKey";
    //手续费默认费率的默认商户
    public static final String DEFAULT_MERCHANT_ID="1";
    //清结算撤单避免重复下单
    public static final String BILLCLEAR_CANCEL_TRANS="billcancelTrans";
    //交易风控开关
    public static final String PAY_RISK_ON_OFF_STATUS="payRiskOnOffStatus";
    //延时通知队列开关
    public static final String NOTIFY_DELAY_ON_OFF_STATUS="notifyDelayOnOffStatus";
    //邮件开关
    public static final String EMAIL_ON_OFF_STATUS="emailOnOffStatus";

  }
	public static final class Http{
		
		public static final int RESULT_SUCCESS=1;
		
		public static final int RESULT_ERROR=0;
		
		public static final String RESULT_ERROR_STR ="error"; 
		
		public static final String RESPONSE_OK ="ok";
	}
	public static final class ProductCode{
    public static final int QUICKPAYH5=1;
    public static final int QUICKPAYWEB=0;
  }
	public static final class MerchantProductCode{
    public static final Map<String,Object> merchantProductCodeMap = new HashMap<String,Object>();
    static{
      merchantProductCodeMap.put("HY_CHARGE", ProductType.CHARGE.getValue());
      merchantProductCodeMap.put("HY_BATCHPAY", ProductType.BATCHPAY.getValue());
      merchantProductCodeMap.put("HY_BATCHCOLLE", ProductType.BATCHCOLLECTION.getValue());
      merchantProductCodeMap.put("HY_REFUND", ProductType.REFUND.getValue());
      merchantProductCodeMap.put("HY_WITHDRAW", ProductType.WITHDRAW.getValue());
      merchantProductCodeMap.put("HY_QUICKPAYAPI", ProductType.QUICKPAYAPI.getValue());
      merchantProductCodeMap.put("HY_QUICKPAYH5", ProductType.QUICKPAYH5.getValue());
      merchantProductCodeMap.put("HY_QUICKPAYPC", ProductType.QUICKPAYPC.getValue());
      merchantProductCodeMap.put("HY_QUICKPAYSDK", ProductType.QUICKPAYSDK.getValue());
      merchantProductCodeMap.put("HY_B2CEBANKAPI", ProductType.B2CEBANKAPI.getValue());
      merchantProductCodeMap.put("HY_B2CEBANKH5", ProductType.B2CEBANKH5.getValue());
      merchantProductCodeMap.put("HY_B2CEBANKPC", ProductType.B2CEBANKPC.getValue());
      merchantProductCodeMap.put("HY_B2CEBANKSDK", ProductType.B2CEBANKSDK.getValue());
      merchantProductCodeMap.put("HY_B2BEBANK", ProductType.B2BEBANK.getValue());     
      merchantProductCodeMap.put("HY_SHARES", ProductType.SHARES.getValue());
      merchantProductCodeMap.put("HY_QUICKPAYDPT", ProductType.DEPOSIT_QUICKPAY.getValue());
      merchantProductCodeMap.put("HY_EBANKDPT", ProductType.DEPOSIT_GATEWAYPAY.getValue());
      merchantProductCodeMap.put("HY_TEST", ProductType.OBLINEBANK_TEST.getValue());
      merchantProductCodeMap.put("HY_UNIONPAYQRCODE", ProductType.UNIONPAY_ACTIVE_SCANCODE.getValue());
      merchantProductCodeMap.put("HY_HUIJCPAY", ProductType.HUIJC_DUT.getValue());
    }
  }
	
	public static final class WeChatCurrency{
    public static final Map<String,String> weChatCurrencyMap = new HashMap<String,String>();
    static{
    	weChatCurrencyMap.put("CNY", CurrencyType.RMB.getValue());
    }
  }
	
	public static final class Notify{
		public static final int UPDATEOK=1;
		public static final int UPDATEERROR=0;
		public static final int UPDATE_PAYMENTSTATUS_ERROR=-1;
	}

	public static final class SMS{
		public static final String AGENTID = "sms.agentID";
		public static final String VERSION = "sms.version";
		public static final String PASSWORD = "sms.password";
		public static final String REQUESTADDRESS = "sms.requestAddress";
		public static final String PREFIX = "sms.massage.prefix";
		public static final String SUFFIX = "sms.massage.suffix";
	}
	
	public static final class RPCNodeName{
		public static final String PAYMENTRPC = "payment_rpc";
		public static final String BILLINGRPC = "billing_rpc";
		public static final String GATEWAYRPC = "gateway-route";
		public static final String MERCHANTRPC = "manager_server";
		public static final String ACCOUNTRPC = "account_rpc";
		public static final String WALLETRPC = "wallet_rpc";
		public static final String CBMSRPC = "cbms_server_web";
	}
	//清结算系统使用
	public static final class Clear{
		//币种人民币
		public static final String CURRENCY_RMB = "156";
		
		//对账状态：已对
		public static final String CHECK_STATUS_Y = "Y";
		//对账状态：未对
		public static final String CHECK_STATUS_N = "N";
		//结算状态：未结
		public static final String SETTLE_STATUS_N = "N";
		//结算状态：未结
		public static final String SETTLE_STATUS_Y = "Y";
		//结算状态：结算中
		public static final String SETTLE_STATUS_D = "D";
		//交易结算周期
		public static final String T0 = "0";
			//交易结算周期
		public static final String T1 = "1";
		
		//交易结算周期X
		public static final String TX = "X";
		
		public static final String BILLINGRPC = "billing_rpc";
		
		//风控系统后台和清结算系统后台页面显示条件区分
		public static final String RISK = "risk";
		public static final String SETTLE = "settle";
		public static final String MODEL = "model";
		public static final String OTHER = "other";
	}
	
	public static final class PaymentErrorLogDesc{
    public static final String MERCHANTACCOUNTDAILY = "失算平衡异常单";
  }
	
	
	//账单类型
  public static final class BillType{
    //日账单
    public static final String BILL_DAY = "1";
    //月账单
    public static final String BILL_MONTH = "2";
    //是否为第一个账期
    public static final String FIRST_PERIOD = "Y";
    //是否为最后一个账期
    public static final String LAST_PERIOD = "Y";
    //借
    public static final String DEBIT = "D";
    //贷
    public static final String CREDIT = "C";
    //冻结
    public static final String FROZEN = "frozen";
    //解冻
    public static final String THAW = "thaw";
    
    public static final String IS_HOT = "Y";
    
  }
  
  //备付金调拨
  public static final class AllocateRecordType {
    
    //入账备付金开始值
    public static final String ACCOUNT_CODE_START = "11000000";
    //入账备付金结束值
    public static final String ACCOUNT_CODE_END = "11099999";
    
    //入账备付金开始值
    public static final String ACCOUNT_CODE_OTHER_START = "41000000";
    //入账备付金结束值
    public static final String ACCOUNT_CODE_OTHER_END = "41099999";
    
    //审核通过
    public static final String REVIEW_PASS = "1";
    
  }
  
  
  
	
}
