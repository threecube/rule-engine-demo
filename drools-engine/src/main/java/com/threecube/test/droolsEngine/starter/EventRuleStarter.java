/**
 * 
 */
package com.threecube.test.droolsEngine.starter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import com.threecube.test.droolsEngine.model.ChatMessageModel;
import com.threecube.test.droolsEngine.util.DroolsManageUtil;

/**
 * @author dingwenbin
 *
 */
public class EventRuleStarter {

	public static void main(String[] args) throws InterruptedException {
		
		String[] senderList = new String[] {"sender1", "sender2", "sender3"};
		String[] accepterList = new String[] {"accepter1", "accepter2", "accepter3"};
		String[] bodyLisst = new String[] {"fucker", "你瞅啥", "阿西吧", "阿香"};
		Random rand =new Random();
		int i = 0 ;
		while(!Thread.interrupted()) {
			ChatMessageModel model = new ChatMessageModel();
			model.setSender(senderList[rand.nextInt(3)]);
			model.setAccepter(accepterList[rand.nextInt(3)]);
			model.setBody(bodyLisst[rand.nextInt(4)]);
			model.setMsgtype("1");
			model.setSendtime(new Date());
			model.setValue(rand.nextInt(50));
			DroolsManageUtil.chatKieSession.insert(model);
			DroolsManageUtil.chatKieSession.fireAllRules();
			Thread.sleep(500);
		}
		
		DroolsManageUtil.chatKieSession.dispose();
	}
}
