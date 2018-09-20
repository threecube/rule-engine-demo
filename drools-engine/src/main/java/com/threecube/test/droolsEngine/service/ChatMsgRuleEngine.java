/**
 * 
 */
package com.threecube.test.droolsEngine.service;

import java.util.Map;

/**
 * @author dingwenbin
 *
 */
public interface ChatMsgRuleEngine {
	
	/**
	 * 规则触发后的报警
	 */
	public void alarm(String alarmBody) throws Exception;
	
	public void statProcess(Map<String, Integer> statMap) throws Exception;
}
