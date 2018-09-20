/**
 * 
 */
package com.threecube.test.droolsEngine.starter;

import com.threecube.test.droolsEngine.model.DrinkConsumerModel;
import com.threecube.test.droolsEngine.util.DroolsManageUtil;

/**
 * @author dingwenbin
 *
 */
public class CloudRuleTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DrinkConsumerModel model = new DrinkConsumerModel();
		model.setRemainMoney(100);
		model.setEmptyBottleNum(0);
		model.setConsumedNum(0);
		model.setRewardNum(0);
		
		DroolsManageUtil.drinkKieSession.insert(model);
		DroolsManageUtil.drinkKieSession.fireAllRules();
		DroolsManageUtil.drinkKieSession.dispose();
	}

}
