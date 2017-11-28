package com.heepay.enums;

/**          
* 
* 描    述：对外接口返回的所有状态值
*
* 创 建 者： houjc<houjc@9186.com>
* 创建时间： 2016年6月22日 下午5:21:51 
* 创建描述：对外接口返回的所有状态值
* 
* 修 改 者：   刘栋
* 修改时间： 2016年9月23日
* 修改描述： 统一、更新对外返回状态值
* 
* 审 核 者：
* 审核时间：
* 审核描述：
*
*/      
    
public enum InterfaceStatus {
	
	//未知类
	UNKNOWNED(-1,"未知异常"),
	//成功类
	SUCCESS(1000,"成功"),
	ERROR(2000,"失败"),
	COMPLETED(1001,"交易已经完成"),
	FAILED(1002,"交易失败"),
	REALNAME_FAILED(1004,"认证失败"),
	//服务器内部错误类
    INTERNALERROR(1003,"内部服务器错误"),
  
    PAYTIMEOUT(1005,"支付超时"),
	ALREADY(1006,"已记账"),
	CARDBINERROR(1007,"未识别出银行卡"),
	AMONUT_ERROR(1008,"金额验证有误"),
	NOPAYMENTERROR(1009,"交易单不存在"),
	//处理中类
	PROCESS(2001,"处理中"),
	//资格校验错误类 3xxx
	MERCHANTERROR(3001,"商户校验失败"),
	MERCHANTERROR2(30010,"商户用户信息不匹配"),
	MERCHANTERROR3(30011,"未做实名认证"),
	PRODUCTERROR(3002,"产品校验失败，未开通此产品"),
	IPERROR(3003,"IP校验失败"),
	SIGNERROR(3004,"签名校验失败"),
	TOKENERROR(3005,"token校验失败"),
	SMSAUTHERROR(3006,"短信验证码校验失败"),
	ANTIPHISHINGERROR(3007,"防钓鱼校验失败"),
	TIMEOUTERROR(3008,"超时失效"),
	PASSWORDERROR(3009,"支付密码错误"),
	ACCOUNTERROR(3010,"账户校验失败"),
	INSUFFICIENTAVAILABLE(3011,"可用余额不足"),
	WITHDRAWBALANCENOTENOUGH(3012,"可提现余额不足"),
	GETBALANCEERROR(3016,"余额获取异常"),
	AMONUTERROR(3013,"交易金额格式不符合规定"),	
	REFERERROR(3014,"refer校验失败，refer不能为空"),	
	BANKCARDINFOERROR(3017, "银行卡信息错误"),
	MERCHANTHAVENOACCOUNT(3018,"商户的账户不存在"),
	NOMERCHANTERROR(3019,"商户信息不存在，请确认"),
	FEECONFIGERROR(3020,"获取不到手续费费率配置"),
	MERCHANTORDERERROR(3021,"同一订单只可支付一次"),
	BANKCHANNELERROR(3022,"无法获取银行渠道"),
	BANKCARDERROR3(3023,"银行卡限额有误"),
	BANKCARDERROR4(3024,"支付金额超过银行卡限额"),
	BANKCARDERROR5(3034,"绑卡信息与注册用户信息不符"),
	SDKPHONEIDERROR(3025,"设备唯一标识不一致"),
	SDKGATEWAYERROR(3026,"tokenId和传入的gatewayId信息不一致"),
	SDKPROCESSERROR(3027,"sdk未调取发送短信接口"),
	BANKCARDHAVED(3028,"银行卡已经绑定过"),	
	RISKERROR(3029,"已超出限额，无法继续交易"),
	BATCHPAYAMOUNTERROR(3030,"可转账余额不足"),
	MERCHANTSUSEREXIST(3031,"该商户的此用户已存在"),
	MERCHANTSUSERNOTEXIST(3032,"该商户的此用户不存在"),
    PRODUCTCHECKERROR(3033,"产品校验失败！"),
	//业务参数错误类 4xxx
	PARAMSERROR(4001,"参数不完整或不合法"),
	BANKCARDTYPE_ERROR(4002,"银行卡类型不合法"),
	GATEWAYTOKENTIMEOUT(4003,"网关token超时"),
	PAYMENTOUT(4004,"交易超时"),
	NOTIFYURLERROR(4005,"notify_url与设置不匹配"),
	//快捷支付
	CURRENTTRANSERROR(4101,"当前订单校验失败(重复提交/订单找不到/状态非正常)"),
	PAYMENTERROR(4102,"支付单校验失败(支付单找不到/状态非正常)"),
	SIGNCARDERROR(4103,"签约卡信息校验失败(签约卡信息找不到/状态非正常)"),
	SIGNCARDERROR2(4112,"签约卡信息重复"),
	AUTHCODEERROR(4104,"授权码信息错误"),
	NOBUSINESS(4105,"当前商户没有开启该业务"),
	IPLIMIT(4106,"IP受限，当前IP访问太频繁了"),	
	ENDBUSINESS(4107,"商户签约的产品是不生效"),
	BUSINESSTIMENULL(4108,"当前商户产品有效期为空"),
	BUSINESSTIMELIMIT(4109,"当前商户产品有效期过期"),
	BUSINESSDISABLE(4110,"产品已禁用"),
	NOSUPPORT(4111,"不支持当前银行卡"),
	
	
	//快捷支付 需要处理的错误
	BANKCARDERROR(4220,"银行卡号填写错误！"),
	ICARDERRPR(4221,"身份信息填写错误，请核对后重新支付"),
	INNAMEERRPR(4222,"持卡人姓名错误！"),
	MOBILEERRPR(4223,"手机号填写错误！"),		
	SMSEERRPR(4224,"输入验证码错误"),		
	COMPEERRPR(4225,"银行卡没开通网银！"),	
	MONEYLIMITEERRPR(4226,"银行卡余额不足或超限"),	
	SMSOUTTIMEEERRPR(4227,"验证码超时"),		
	CREDITMSGEERRPR(4228,"有效期或校验码错误！"),
	CREDITOUTTIMEEERRPR(4229,"信用卡过期！"),
	FACTORERROR (4230,"卡信息有误，请核对后重新支付"),
	CARD_LOCKED (4231,"此卡已锁！"),
	ISSUING_BANK_REFUSE(4232,"此卡在发卡行受限，请换卡支付"),
	OPERATION_ERROR(4233,"操作有误，请稍后再试"),
	INSUFFICIENT_BALANCE(4234,"银行卡余额不足"),
	ISSUING_OVER_LIMIT(4235,"超出发卡行限额，请联系发卡行或换卡支付"),

	//退款
	ORIGINTRANSERROR(4201,"原订单校验失败"),
	REFUNDERROR(4202,"退款单校验失败"),
	REFUNDAMOUNTERROR(4203,"退款金额必须大于0"),
	NOTSETTLED(4204,"原订单尚未结算,不能退款"),
	TIMEOUT30DAYS(4205,"原订单成功距离本次退款已经超过30天,请线下退款"),
	HADSHARED(4206,"原订单已经发起分润,不能退款"),
	REFUNDERROR2(4207,"原订单存在退款单，不可以退款"),
	//充值
	FEEAMOUNT_CALCULATE_ERROR(4300,"手续费计算失败,原因：内部错误"),
	FEEAMOUNT_CALCULATE_ERROR2(4305,"手续费计算失败,原因：手续费大于交易总额"),
	PAY_PASSWORD_ERROR(4301,"支付密码错误"),
	AMOUNT_ERROR(4302,"金额输入有误，必须是正数"),
	MERCHANT_STATUS_NOTNOMAL(4303,"商户是非正常状态"),
	MERCHANT_ACCOUNT_NOTNOMAL(4304,"商户账户状态异常"),
	CARD_OWNER_TYPE_ERROR(4305,"同一个Excel只能是一种付款类型"),
	TRANSFER_AMOUNT_ERROR(4306,"转账金额大于限定金额"),
	TRANSFER_COUNT_ERROR(4307,"转账笔数大于限定笔数"),
	TRANSFER_STYLE_ERROR(4308,"Excel格式错误，请检查Excel文件后再上传"),
	TRANSFER_OWNERTYPE_ERROR(4309,"对公转账中输入了对私银行卡"),
	TRANSFER_FINISH_ERROR(4310,"请勿将模板样式中的10000删除！"),
	TRANSFER_OWNERNAME_ERROR(4311,"收款人姓名只能长度为2-20个字符，且只能输入中文和括号！"),
	TRANSFER_REASON_ERROR(4312,"备注最多只能输入10个字符！"),
	TRANSFER_NOTESHU_ERROR(4313,"不能输入特殊字符！"),
	TRANSFER_BANKCARD_ERROR(4314,"银行卡号错误！"),
	TRANSFER_PAYTYPE_ERROR(4315,"对私对私类型输入错误！"),
	TRANSFER_RISKAMOUNT_ERROR(4316,"转账金额超过限额！"),
	TRANSFER_MOUNT_ERROR(4319,"转账金额必须大于0！"),
	//提现
	WITHDRAW_RISKAMOUNT_LIMIT(4317,"提现金额超过限额！"),
	WITHDRAW_MOUNT_ERROR(4318,"提现金额必须大于0！"),
	//银行卡管理相关
	BANKCARDNOREPEAT(4401,"银行卡号已经存在，不能重复添加"),
	HAVENOTHISBANKCARDNO(4402,"商户没有此银行卡号"),
	
	

	//电子签章
	ELECTRONICS_SEAL_ALWAYS(4501,"已经存在签约记录"),
	ELECTRONICS_SEAL_SAVE_MERCHANT_EXCEPTION(4502,"保存商户电子签章订单异常"),
	ELECTRONICS_SEAL_SAVE_SELF_EXCEPTION(4503,"保存自身电子签章订单异常"),
	ELECTRONICS_SEAL_QB_ACCOUNT_EXCEPTION(4504,"创建鉴宝账户异常"),
	ELECTRONICS_SEAL_QB_TEPLATE_EXCEPTION(4505,"创建模板异常"),
	ELECTRONICS_SEAL_MERCHANT_EXCEPTION(4506,"商户签署异常"),
	ELECTRONICS_SEAL_SELF_EXCEPTION(4507,"自身签署异常"),
	ELECTRONICS_SEAL_MERCHANT_ACCOUNT_EXCEPTION(4508,"记录商户账务异常"),
	ELECTRONICS_SEAL_CHNANL_ACCOUNT_EXCEPTION(4509,"记录通道账务异常"),
	ELECTRONICS_SEAL_UPLOAD_MERCHANT_CONTRACT_EXCEPTION(4510,"上传商户电子合同异常"),
	ELECTRONICS_SEAL_UPLOAD_SELF_CONTRACT_EXCEPTION(4511,"上传自身电子合同异常"),
	ELECTRONICS_SEAL_SAVE_CONTRACT_EXCEPTION(4512,"保存已签约合同异常"),
	ELECTRONICS_SEAL_M_REMOTE_FLIE_EXCEPTION(4513,"读取商户合同文件异常"),
	ELECTRONICS_SEAL_SELF_GETACCOUNT_EXCEPTION(4514,"获取签宝账户异常"),
	ELECTRONICS_SEAL_SELF_ACCOUNT_CONF_EXCEPTION(4515,"获取自身配置异常"),

	//账户相关
	SUCCESS_ACCOUNT_MESSAGE(5000,"获取账户信息成功"),
  FAILURE_ACCOUNT_MESSAGE(2001,"获取账户信息失败"),
  SUCCESS_ACCOUNT(5100,"更新账户余额成功"),
  FAILURE_ACCOUNT(5101,"更新账户余额失败"),
  SUCCESS_ACCOUNT_LOG(5200,"更新账户流水成功"),
  FAILURE_ACCOUNT_LOG(5201,"更新账户流水失败"),
  SUCCESS_ACCOUNT_DETAILS(5300,"更新账户明细流水成功"),
  FAILURE_ACCOUNT_DETAILS(5301,"更新账户明细流水失败"),
  //手续费相关异常
  SUCCESS_SUBTRACT_FEE(5400,"收取手续费成功"),
  FAILURE_SUBTRACT_FEE_NOENOUGH(5401,"没有足够的金额收取手续费"),
  FAILURE_SUBTRACT_FEE(5402,"收取手续费失败"),
  SUCCESS_ADD_FEE(5500,"退还手续费成功"),
  FAILURE_ADD_FEE(5501,"退还手续费失败"),
  
  //冻结/解冻账户
  ACCOUNT_FROZEN_SUCCESS(5600, "冻结余额成功"),
  ACCOUNT_FROZEN_FAILURE(5601, "冻结余额失败"),
  ACCOUNT_THAW_SUCCESS(5700, "解冻余额成功"),
  ACCOUNT_THAW_FAILURE(5701, "解冻余额失败"),
  MERCHANTID_PARAME_NOTNULL(5800, "商户Id不能为空"),
  MERCHANTID_PARAME_ERROR(5801, "商户Id不存在"),
  MERCHANTID_GET_ERROR(5802, "获取账户信息失败"),
  TRANSNO_PARAME_NOTNULL(5803, "交易流水号不能为空"),
  RISKORDER_PARAME_NOTNULL(5804, "冻结单号不能为空"),
  THAWORDER_PARAME_NOTNULL(5805, "解冻单号不能为空"),
  BALANCECHANGE_PARAME_NOTNULL(5806, "冻结金额不能为空"),
  BALANCECHANGE_PARAME_MINUS(5807, "冻结金额不能小于等于0"),
  BALANCECHANGE_PARAME_ERROR(5808, "冻结金额参数异常"),
  BALANCECHANGE_MORETHAN_BALANCE(5809, "冻结金额大于账户余额"),
  BALANCECHANGE_MORETHAN_AVAILABLE_BALANCE(5810, "冻结金额大于账户可用余额"),
  ACCOUNT_FROZENED(5811, "已经解冻过了"),
  ACCOUNT_THAWED(5812, "已经解冻过了"),

  //关联账户
  RELA_ACCOUNT_NOT_CONSISTENT(5900,"关联账户配置和账户信息不一致"),
  RELA_ACCOUNT_NOT_CONFIG(5901,"没有配置关联账户"),
  RELA_ACCOUNT_STATUS_ERROR(5902,"关联账户状态有误"),


  //清结算补单，撤单
  BILLNOTPAYMENTERROR(6001,"交易单不存在"),
  BILLINSERTREFUNDERROR(6002,"生成退款单失败"),
  BILLPARAMERROR(6003,"参数异常"),
  BILLORDERSTATUSERROR(6004,"交易单状态异常"),
  
  
	//分润
  SHARE_ORDER_ERROR1(7001,"此交易单已经申请过"),
  SHARE_ORDER_ERROR2(7002,"此交易单不存在"),
  SHARE_ORDER_ERROR6(7015,"不可以重复提交"),
  SHARE_JSONFORMAT_ERROR(7003,"分润对象json参数解析有误"),  
  SHARE_MERCHANT_ERROR1(700501,"分润对象商户不能重复"),
  SHARE_MERCHANT_ERROR2(700502,"分润对象商户校验失败"),
  SHARE_MERCHANT_ERROR3(700503,"不能跟自己分润"),
  SHARE_MONEY_ERROR(7006,"分润商户对象金额之和不等于分润总额"),
  SHARE_MONEY_ERROR2(7007,"分润金额大于订单总额"),
  SHARE_MERCHANT_ACCOUNT_ERROR1(7008,"分润账户异常"),
  SHARE_MERCHANT_FEESET_ERROR(7009,"商户未开通此产品或结算周期不是t+1"),
  SHARE_ORDER_ERROR3(7010,"此交易单已经结算"),
  SHARE_ORDER_ERROR4(7011,"此交易单已经结算"),
  SHARE_ORDER_ERROR5(7012,"此交易单存在退款单，不可以分润"),
  SHARE_FEE_ERROR(7013,"分润手续费计算异常"),
  SHARE_MERCHANT_ACCOUNT_ERROR2(7020,"分润账户余额不足，无法扣除手续费"),
  SHARE_ACCOUNT_CONFIRM_ERROR(7021,"分润确认修改账户余额异常"),
  //风控拦截类
  RISK_MERCHANT_QUOTA(8001,"交易金额超过限额"),
  RISK_MERCHANT_DISABLE(8002,"商户产品被禁用"),
  RISK_MERCHANT_BATCH_QUOTA(8003,"批次交易金额超过限额"),
  RISK_BLACK(8004,"黑名单"),
  RISK_CHANNEL_QUOTA(8005,"通道超过限额"),
  RISK_MERCHANT_NO_INCOME(8006,"商户90天无入金"),
  RISK_MERCHANT_INCOME_Quota(8007,"商户日入金超过限额"),
  RISK_FOREIGN_IP(8008,"境外IP"),
	RISK_COMPARE_PROVINCE(8009,"归属地身份不一致"),
	RISK_BATCHPAY_CROSS(8010,"批付不能交叉付款"),
	
	//优惠券
	COUPON_CODE_ERROR(9001,"优惠劵不存在"),
	COUPON_STATUS_ERROR(9002,"优惠劵状态有误"),
	COUPON_AMOUNT_ERROR(9003,"交易金额不满足优惠券使用条件");
	
	
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
	InterfaceStatus(int value, String content) {  
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
		InterfaceStatus[] statuses = InterfaceStatus.values();
		String content="";
		for(InterfaceStatus status:statuses){
			if(status.getValue()==value){
				content = status.getContent();
				break ;
			}
		}
		if("".equals(content)){
			return  InterfaceStatus.UNKNOWNED.getContent();
		}
		return content;
	}
	
	
}
