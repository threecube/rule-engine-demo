/**
 * 
 */
package com.threecube.test.droolsEngine.starter;

import com.threecube.test.droolsEngine.enums.HospitalLevelEnum;
import com.threecube.test.droolsEngine.enums.ZoneTypeEnum;
import com.threecube.test.droolsEngine.model.InsuredPersonInfo;
import com.threecube.test.droolsEngine.util.DroolsManageUtil;

/**
 * @author dingwenbin
 *
 */
public class InsuredPlanTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		InsuredPersonInfo person = new InsuredPersonInfo();
		person.setCost(5000);
		person.setHospital(HospitalLevelEnum.Secondary);
		person.setZoneType(ZoneTypeEnum.PROVINCIAL);
		
		DroolsManageUtil.insuredKieSession.insert(person);
		DroolsManageUtil.insuredKieSession.fireAllRules();
		DroolsManageUtil.insuredKieSession.dispose();
	}

}
