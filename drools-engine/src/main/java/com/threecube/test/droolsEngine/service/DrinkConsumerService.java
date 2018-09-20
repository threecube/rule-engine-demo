/**
 * 
 */
package com.threecube.test.droolsEngine.service;

import com.threecube.test.droolsEngine.model.DrinkConsumerModel;

/**
 * @author dingwenbin
 *
 */
public interface DrinkConsumerService {

	/**
	 * 购买饮料之后，更新drools内存对象
	 * 
	 * @param model
	 * @param buyCount
	 * @throws Exception
	 */
	public void updateAfterBuy(DrinkConsumerModel model, int buyCount) throws Exception;
	
	/**
	 * 置换空瓶，并更新对象
	 * 
	 * @param model
	 * @param exchangeCount
	 * @throws Exception
	 */
	public void updateAfterExchange(DrinkConsumerModel model, int exchangeCount) throws Exception;

	/**
	 * 奖励，并更新对象
	 * 
	 * @param model
	 * @param exchangeCount
	 * @throws Exception
	 */
	public void updateAfterReward(DrinkConsumerModel model, int exchangeCount) throws Exception;
	
	/**
	 * 结果处理
	 * @param model
	 * @throws Exception
	 */
	public void postProcess(DrinkConsumerModel model) throws Exception;
}
