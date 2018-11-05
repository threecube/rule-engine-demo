/**
 * 
 */
package com.threecube.test.droolsEngine.service.impl;

import org.kie.api.runtime.rule.FactHandle;

import com.threecube.test.droolsEngine.model.InsuredPersonInfo;
import com.threecube.test.droolsEngine.service.InsuredPlanService;
import com.threecube.test.droolsEngine.util.DroolsManageUtil;

/**
 * @author dingwenbin
 *
 */
public class InsuredPlanServiceImpl implements InsuredPlanService {
	
	/* (non-Javadoc)
	 * @see com.threecube.test.droolsEngine.service.InsuredPlanService#calculateAndUpdate(com.threecube.test.droolsEngine.model.InsuredPersonInfo, double)
	 */
	@Override
	public void calculateAndUpdate(InsuredPersonInfo insuredPersion, double ratio) throws Exception {
		
		FactHandle factHandle = DroolsManageUtil.insuredKieSession.getFactHandle(insuredPersion);
		
		System.out.println("开始计算报销金额");
		double insuredValue = insuredPersion.getCost() * ratio;
		insuredPersion.setInsuranceValue(insuredValue);
		insuredPersion.setInsuredRatio(ratio);
		
		DroolsManageUtil.insuredKieSession.update(factHandle, insuredPersion);
	}

}
