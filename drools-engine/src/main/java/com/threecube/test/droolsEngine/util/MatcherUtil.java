/**
 * 
 */
package com.threecube.test.droolsEngine.util;

import org.codehaus.plexus.util.StringUtils;

import com.threecube.test.droolsEngine.enums.HospitalLevelEnum;
import com.threecube.test.droolsEngine.enums.ZoneTypeEnum;
import com.threecube.test.droolsEngine.model.InsuredPersonInfo;

/**
 * @author dingwenbin
 *
 */
public class MatcherUtil {

	public static boolean isInsuredZoneMatch(ZoneTypeEnum persion, String zone) {
		
		if(StringUtils.isBlank(zone)) {
			return true;
		}
		
		if(persion != null && StringUtils.equals(persion.getName(), zone)) {
			return true;
		} else {
			return false;
		}
	} 
	
	public static boolean isInsuredHospitalMatch(HospitalLevelEnum hos, String hospital) {
		
		if(StringUtils.isBlank(hospital)) {
			return true;
		}
		
		if(hos != null && StringUtils.equals(hos.getLevel(), hospital)) {
			return true;
		} else {
			return false;
		}
	}
}
