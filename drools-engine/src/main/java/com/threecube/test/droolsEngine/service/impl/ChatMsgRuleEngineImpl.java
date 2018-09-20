/**
 * 
 */
package com.threecube.test.droolsEngine.service.impl;

import java.util.Map;

import com.threecube.test.droolsEngine.service.ChatMsgRuleEngine;

/**
 * @author dingwenbin
 *
 */
public class ChatMsgRuleEngineImpl implements ChatMsgRuleEngine {

	@Override
	public void alarm(String alarmBody) throws Exception {
		
		System.out.println(alarmBody);
	}

	@Override
	public void statProcess(Map<String, Integer> statMap) throws Exception {
		System.out.println("30s内发送者发出的消息量为：" + statMap);
	}
	
	
}
