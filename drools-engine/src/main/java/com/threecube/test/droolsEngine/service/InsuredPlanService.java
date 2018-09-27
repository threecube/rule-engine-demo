/**
 * 
 */
package com.threecube.test.droolsEngine.service;

import com.threecube.test.droolsEngine.model.InsuredPersonInfo;

/**
 * @author dingwenbin
 *
 */
public interface InsuredPlanService {
	
	public void calculateAndUpdate(InsuredPersonInfo insuredPersion, double ratio) throws Exception;
}
