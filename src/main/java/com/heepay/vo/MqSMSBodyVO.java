package com.heepay.vo;

/**
 * 
* 
* 描    述：消息队列内容vo
*
* 创 建 者：zhangchen
* 创建时间： 2016年8月25日 下午5:16:25 
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
public class MqSMSBodyVO {

  
    private String phone;

    public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private String msg;

    private String type;

}
