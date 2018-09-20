/**
 * 
 */
package com.threecube.test.droolsEngine.service.impl;

import org.kie.api.runtime.rule.FactHandle;

import com.threecube.test.droolsEngine.model.DrinkConsumerModel;
import com.threecube.test.droolsEngine.service.DrinkConsumerService;
import com.threecube.test.droolsEngine.util.DroolsManageUtil;

/**
 * @author dingwenbin
 *
 */
public class DrinkConsumerServiceImpl implements DrinkConsumerService {

	/* (non-Javadoc)
	 * @see com.threecube.test.droolsEngine.service.DrinkConsumerService#updateAfterBuy(int)
	 */
	@Override
	public void updateAfterBuy(DrinkConsumerModel model, int buyCount) throws Exception {
		
		FactHandle factHandle = DroolsManageUtil.drinkKieSession.getFactHandle(model);
		
		System.out.println(String.format("余钱：%s, 花%s元购买%s瓶并喝掉", model.getRemainMoney(), buyCount, buyCount));
		
		model.setRemainMoney(model.getRemainMoney() - buyCount);
		model.setConsumedNum(model.getConsumedNum() + buyCount);
		model.setEmptyBottleNum(model.getEmptyBottleNum() + buyCount);
		
		DroolsManageUtil.drinkKieSession.update(factHandle, model);
	}

	/* (non-Javadoc)
	 * @see com.threecube.test.droolsEngine.service.DrinkConsumerService#updateAfterExchange(int)
	 */
	@Override
	public void updateAfterExchange(DrinkConsumerModel model, int exchangeCount) throws Exception {
		
		System.out.println(String.format("剩余空瓶：%s, 兑换%s个空瓶为%s元钱", model.getEmptyBottleNum(), 2*exchangeCount, exchangeCount));
		
		FactHandle factHandle = DroolsManageUtil.drinkKieSession.getFactHandle(model);
		
		model.setRemainMoney(model.getRemainMoney() + exchangeCount);
		model.setEmptyBottleNum(model.getEmptyBottleNum() - exchangeCount * 2);
		
		DroolsManageUtil.drinkKieSession.update(factHandle, model);	
	}

	@Override
	public void updateAfterReward(DrinkConsumerModel model, int rewardCount) throws Exception {
		
		System.out.println(String.format("已经消费%s瓶, 已经得到%s瓶奖励", model.getConsumedNum(), model.getRewardNum()));
		
		FactHandle factHandle = DroolsManageUtil.drinkKieSession.getFactHandle(model);
		
		//model.setConsumedNum(model.getConsumedNum());
		model.setEmptyBottleNum(model.getEmptyBottleNum() + rewardCount);
		model.setRewardNum(model.getRewardNum() + 1);
		
		DroolsManageUtil.drinkKieSession.update(factHandle, model);
	}
	
	@Override
	public void postProcess(DrinkConsumerModel model) throws Exception {
		
		System.out.println(String.format("总喝掉瓶数: %s, %s", model.getConsumedNum() , model.getRewardNum()));
	}

}
