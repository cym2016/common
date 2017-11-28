package com.heepay.enums;

/**
 * 钱包使用支付密码时验证的业务类型
 * @author zc
 */
public enum WalletCommondType {

    /**
     * 未知
     */
	pay("pay","消费"),
	trans("trans","转账"),
	withdraw("withdraw","提现"),
	charge("charge","充值");

    String _value;

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
    WalletCommondType(String value, String content) {
        this._value = value;
        this._Content = content;
    }

    /**
     * 取得枚举对象值
     * @return 枚举对象值
     */
    public String getValue() {
        return this._value;
    }

    /**
     * 取得内容
     * @return 内容
     */
    public String getContent() {
        return this._Content;
    }
    
    /**
     * 根据值取相应内容
     * @return 内容
     */
    public static WalletCommondType getBean(String value) {
      for (WalletCommondType e : WalletCommondType.values()) {
        if (value.equals(e.getValue())) {
          return e;
        }
      }
      return null;
    }

    public static String labelOf(String val) {
      if (getBean(val) != null) {
        return getBean(val).getContent();
      }
      return null;
    }
}
