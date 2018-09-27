/**
 * 
 */
package com.threecube.test.droolsEngine.enums;

import org.apache.commons.lang.StringUtils;

/**
 * 统计类型
 * 
 * @author dingwenbin
 *
 */
public enum StatTypeEnum {
	
	SENDER_MSG_COUNT("同一发送者的单位时间内消息量"),
		
	GIVEN_KEYWORD_COUNT("包含指定关键字的单位时间消息量");
	
	private String desc;
	
	StatTypeEnum(String desc) {
		this.desc = desc;
	}

	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}

	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
}
