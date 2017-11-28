package com.heepay.enums;

/**          
* 
* 描    述：对外接口状态值
*
* 创 建 者： 刘栋  
* 创建时间： 2016年10月26日 下午7:41:53 
* 创建描述：对外接口状态枚举
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
    
public enum ApiStatus {
	
	UNKNOWN(-1, "未知"),
	
	SUCCESS(200, "成功"),
	
	PARAMERROR(400, "参数不全或格式错误"),
	
	UNAUTHORIZED(401, "商户资格校验失败(签名、IP、状态等)"),
	
	FAILED(402, "参数正确但业务出错"),
	
	FORBIDDEN(403, "拒绝连接"),
	
	NOTFOUND(404, "请求的资源不存在"),
	
	SERVERERROR(500, "内部服务器错误");
	
//	//未知类
//	UNKNOWNED(-1,"未知异常"),
//	//成功类
//	SUCCESS(1000,"成功"),
//	COMPLETED(1001,"交易已经完成"),
//	FAILED(1002,"交易失败"),
//	//服务器内部错误类
//  INTERNALERROR(1003,"内部服务器错误"),  
//  
//	//处理中类
//	PROCESS(2001,"处理中"),
//	
//	//资格校验错误类 3xxx
//	MERCHANTERROR(3001,"商户校验失败"),
//	PRODUCTERROR(3002,"产品校验失败，未开通此产品"),
//	IPERROR(3003,"IP校验失败"),
//	SIGNERROR(3004,"签名校验失败"),
//	TOKENERROR(3005,"token校验失败"),
//	SMSAUTHERROR(3006,"短信验证码校验失败"),
//	ANTIPHISHINGERROR(3007,"防钓鱼校验失败"),
//	TIMEOUTERROR(3008,"超时失效"),
//	PASSWORDERROR(3009,"支付密码错误"),
//	ACCOUNTERROR(3010,"账户校验失败"),
//	INSUFFICIENTAVAILABLE(3011,"可用余额不足"),
//	WITHDRAWBALANCENOTENOUGH(3012,"可提现余额不足"),
//	GETBALANCEERROR(3016,"余额获取异常"),
//	AMONUTERROR(3013,"交易金额格式不符合规定"),	
//	REFERERROR(3014,"refer校验失败，refer不能为空"),	
//	BANKCARDERROR(3015,"银行卡不是本人的"),
//	BANKCARDINFOERROR(3017, "银行卡信息错误"),
//	MERCHANTHAVENOACCOUNT(3018,"商户的账户不存在"),
//	NOMERCHANTERROR(3019,"商户信息不存在，请确认"),
//	FEECONFIGERROR(3020,"获取不到手续费费率配置"),
//
//	
//	//业务参数错误类 4xxx
//	PARAMSERROR(4001,"参数不完整或不合法"),
//	BANKCARDTYPE_ERROR(4002,"银行卡类型不合法"),
//	//快捷支付
//	CURRENTTRANSERROR(4101,"当前订单校验失败(重复提交/订单找不到/状态非正常)"),
//	PAYMENTERROR(4102,"支付单校验失败(支付单找不到/状态非正常)"),
//	SIGNCARDERROR(4103,"签约卡信息校验失败(签约卡信息找不到/状态非正常)"),
//	AUTHCODEERROR(4104,"授权码信息错误"),
//	NOBUSINESS(4105,"当前商户没有开启该业务"),
//	IPLIMIT(4106,"IP受限，当前IP访问太频繁了"),	
//	ENDBUSINESS(4107,"商户签约的产品是不生效"),
//	BUSINESSTIMENULL(4108,"当前商户产品有效期为空"),
//	BUSINESSTIMELIMIT(4109,"当前商户产品有效期过期"),
//	//退款
//	ORIGINTRANSERROR(4201,"原订单校验失败"),
//	REFUNDERROR(4202,"退款单校验失败"),
//	REFUNDAMOUNTERROR(4203,"退款金额必须大于0"),
//	NOTSETTLED(4204,"原订单尚未结算,不能退款"),
//	TIMEOUT30DAYS(4205,"原订单成功距离本次退款已经超过30天,请线下退款"),
//	//充值
//	FEEAMOUNT_CALCULATE_ERROR(4300,"手续费计算失败,原因：内部错误"),
//	PAY_PASSWORD_ERROR(4301,"支付密码错误"),
//	AMOUNT_ERROR(4302,"金额输入有误"),
//	MERCHANT_STATUS_NOTNOMAL(4303,"商户是非正常状态"),
//	MERCHANT_ACCOUNT_NOTNOMAL(4304,"商户账户状态异常"),
//	//提现
//	
//	
//	//银行卡管理相关
//	BANKCARDNOREPEAT(4401,"银行卡号已经存在，不能重复添加"),
//	HAVENOTHISBANKCARDNO(4402,"商户没有此银行卡号"),
//	
//	
//
//	//清结算补单，撤单
//	BILLNOTPAYMENTERROR(6001,"交易单不存在"),
//	BILLINSERTREFUNDERROR(6002,"生成退款单失败"),
//	BILLPARAMERROR(6003,"参数异常"),
//	BILLORDERSTATUSERROR(6004,"交易单状态异常"),
//	//账户相关
//	SUCCESS_ACCOUNT_MESSAGE(5000,"获取账户信息成功"),
//  FAILURE_ACCOUNT_MESSAGE(2001,"获取账户信息失败"),
//  SUCCESS_ACCOUNT(5100,"更新账户余额成功"),
//  FAILURE_ACCOUNT(5101,"更新账户余额失败"),
//  SUCCESS_ACCOUNT_LOG(5200,"更新账户流水成功"),
//  FAILURE_ACCOUNT_LOG(5201,"更新账户流水失败"),
//  SUCCESS_ACCOUNT_DETAILS(5300,"更新账户明细流水成功"),
//  FAILURE_ACCOUNT_DETAILS(5301,"更新账户明细流水失败"),
//  //手续费相关异常
//  SUCCESS_SUBTRACT_FEE(5400,"收取手续费成功"),
//  FAILURE_SUBTRACT_FEE_NOENOUGH(5401,"没有足够的金额收取手续费"),
//  FAILURE_SUBTRACT_FEE(5402,"收取手续费失败"),
//  SUCCESS_ADD_FEE(5500,"退还手续费成功"),
//  FAILURE_ADD_FEE(5501,"退还手续费失败");
	
	
	int _value; 
	
	/**
	 * 存放内容
	 */
	String _Content;
	
	/**
	 * 私有构造函数
	 * @param value 枚举值
	 * @param content 缓存内容
	 * @return 
	 */
	ApiStatus(int value, String content) {  
		this._value = value;  
		this._Content = content;  
	}  
	
	/**
	 * 取得枚举对象值
	 * @return 枚举对象值
	 */
	public int getValue() {
		return this._value;
	}
	
	/**
	 * 取得缓存内容
	 * @return 缓存内容
	 */
	public String getContent() {
		return this._Content;
	}
	/**
	 * 
	 * @description 根据错误编码获取错误信息
	 * @author TianYanqing      
	 * @created 2016年9月26日 下午1:58:05     
	 * @param value
	 * @return
	 */
	public static String getContentByValue(int value){
		ApiStatus[] statuses = ApiStatus.values();
		String content="";
		for(ApiStatus status:statuses){
			if(status.getValue()==value){
				content = status.getContent();
				break ;
			}
		}
		return content;
	}
	
	
}
