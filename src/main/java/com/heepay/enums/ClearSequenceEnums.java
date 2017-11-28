/***
 * 
* 
* 描    述：
*
* 创 建 者： xuangang
* 创建时间：  2016年12月9日上午11:14:52
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
package com.heepay.enums;

/***
 * 
 * 
 * 描    述：清洁算流水
 *
 * 创 建 者： xuangang
 * 创建时间：  2016年12月9日上午11:14:52
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
public enum ClearSequenceEnums {
	
	    CLEARSEQUENCE("clearSequence","清算id"),
	    BATCHSEQUENCE("batchSequence", "结算id");

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
	    ClearSequenceEnums(String value, String content) {
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
}
