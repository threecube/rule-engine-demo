/**
 * 
 */
package com.threecube.test.droolsEngine.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author dingwenbin
 *
 */
public class ChatMessageModel implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7731462133300998742L;

	private String id;
	
	private String sender;
	
	private String accepter;
	
	private String type;
	
	/**
	 * if system message, 1:system message, 0: common chat message
	 */
	private String msgtype;
		
	private int messageId;
	
	/**
	 * client version
	 */
	private String version;
	
	private Date sendtime;
	
	private String body;

	private Integer value;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

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
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the msgtype
	 */
	public String getMsgtype() {
		return msgtype;
	}

	/**
	 * @param msgtype the msgtype to set
	 */
	public void setMsgtype(String msgtype) {
		this.msgtype = msgtype;
	}

	/**
	 * @return the messageId
	 */
	public int getMessageId() {
		return messageId;
	}

	/**
	 * @param messageId the messageId to set
	 */
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * @return the sendtime
	 */
	public Date getSendtime() {
		return sendtime;
	}

	/**
	 * @param sendtime the sendtime to set
	 */
	public void setSendtime(Date sendtime) {
		this.sendtime = sendtime;
	}

	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}

	/**
	 * @return the value
	 */
	public Integer getValue() {
		return value;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(Integer value) {
		this.value = value;
	}

	
}
