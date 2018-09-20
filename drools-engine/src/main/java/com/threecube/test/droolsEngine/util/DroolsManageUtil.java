/**
 * 
 */
package com.threecube.test.droolsEngine.util;

import org.kie.api.KieBase;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import com.threecube.test.droolsEngine.service.impl.ChatMsgRuleEngineImpl;
import com.threecube.test.droolsEngine.service.impl.DrinkConsumerServiceImpl;

/**
 * @author dingwenbin
 *
 */
public class DroolsManageUtil {
	
	public static KieServices kieService = null;
	
	public static KieContainer kieContainer = null;
	
	public static KieBase kieBase = null;
	
	public static KieSession drinkKieSession = null;
	
	public static KieSession chatKieSession = null;
		
	static {
		
		try {
			
			System.out.println("Start to load drools engine");
			loadDroolsEngine();
			System.out.println("Success to load drools engine");
			startListener();
		} catch(Exception e) {
			
			e.printStackTrace();
		}
	}
	
	/**
	 * 加载规则
	 * 
	 * @throws Exception
	 */
	private static void loadDroolsEngine() throws Exception {
		
		kieService = KieServices.Factory.get();
		
		kieContainer = kieService.getKieClasspathContainer();
		
		//kieBase = kieContainer.getKieBase();
		
		drinkKieSession = kieContainer.newKieSession("ksession-cloud-rules");
		drinkKieSession.setGlobal("drinkConsumerService", new DrinkConsumerServiceImpl());
		
		chatKieSession = kieContainer.newKieSession("ksession-stream-rules");
		chatKieSession.setGlobal("chatMsgRuleEngine", new ChatMsgRuleEngineImpl());
	}

	/**
	 * 启动监听器， 监听规则文件变更事件，并更新规则
	 */
	private static void startListener() {
		// TODO Auto-generated method stub
		
	}
}
