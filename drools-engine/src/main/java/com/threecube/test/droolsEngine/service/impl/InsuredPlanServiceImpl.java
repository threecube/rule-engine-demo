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
		
		System.out.println(String.format("报销人员%s的报表比例为%s, 开始计算金额", insuredPersion.getId(), ratio));
		double insuredValue = insuredPersion.getCost() * ratio;
		insuredPersion.setInsuranceValue(insuredValue);
		insuredPersion.setInsuredRatio(ratio);
		
		System.out.println(String.format("报销金额为: %s", insuredPersion.getInsuranceValue()));
	}

}
