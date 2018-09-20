/**
 * 
 */
package com.threecube.test.droolsEngine.model;

/**
 * @author dingwenbin
 *
 */
public class DrinkConsumerModel {

	/**
	 * 剩余的金额
	 */
	private int remainMoney;
	
	/**
	 * 空瓶子数量
	 */
	private int emptyBottleNum;
	
	/**
	 * 奖励的瓶数
	 */
	private int rewardNum;
	
	/**
	 * 已经消费的瓶数
	 */
	private int consumedNum;

	/**
	 * @return the remainMoney
	 */
	public int getRemainMoney() {
		return remainMoney;
	}

	/**
	 * @param remainMoney the remainMoney to set
	 */
	public void setRemainMoney(int remainMoney) {
		this.remainMoney = remainMoney;
	}

	/**
	 * @return the emptyBottleNum
	 */
	public int getEmptyBottleNum() {
		return emptyBottleNum;
	}

	/**
	 * @param emptyBottleNum the emptyBottleNum to set
	 */
	public void setEmptyBottleNum(int emptyBottleNum) {
		this.emptyBottleNum = emptyBottleNum;
	}
	
	/**
	 * @return the rewardNum
	 */
	public int getRewardNum() {
		return rewardNum;
	}

	/**
	 * @param rewardNum the rewardNum to set
	 */
	public void setRewardNum(int rewardNum) {
		this.rewardNum = rewardNum;
	}

	/**
	 * @return the consumedNum
	 */
	public int getConsumedNum() {
		return consumedNum;
	}

	/**
	 * @param consumedNum the consumedNum to set
	 */
	public void setConsumedNum(int consumedNum) {
		this.consumedNum = consumedNum;
	}
	
	
}
