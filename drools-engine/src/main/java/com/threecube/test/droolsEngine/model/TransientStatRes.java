/**
 * 
 */
package com.threecube.test.droolsEngine.model;

import java.io.Serializable;
import java.util.Date;

import com.threecube.test.droolsEngine.enums.StatTypeEnum;

/**
 * @author dingwenbin
 *
 */
public class TransientStatRes implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7582589800638821650L;

	/**
	 * 消息发送者
	 */
	private String sender;
	
	/**
	 * 消息接收者
	 */
	private String accepter;
	
	/**
	 * 统计类型
	 */
	private StatTypeEnum statType;
	
	/**
	 * 统计开始时间
	 */
	private Date startTime;
	
	/**
	 * 统计结果数
	 */
	private long count;

	/**
	 * @return the sender
	 */
	public String getSender() {
		return sender;
	}

	/**
	 * @param sender the sender to set
	 */
	public void setSender(String sender) {
		this.sender = sender;
	}

	/**
	 * @return the accepter
	 */
	public String getAccepter() {
		return accepter;
	}

	/**
	 * @param accepter the accepter to set
	 */
	public void setAccepter(String accepter) {
		this.accepter = accepter;
	}

	/**
	 * @return the statType
	 */
	public StatTypeEnum getStatType() {
		return statType;
	}

	/**
	 * @param statType the statType to set
	 */
	public void setStatType(StatTypeEnum statType) {
		this.statType = statType;
	}

	/**
	 * @return the startTime
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the count
	 */
	public long getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(long count) {
		this.count = count;
	}
	
	
	
}
