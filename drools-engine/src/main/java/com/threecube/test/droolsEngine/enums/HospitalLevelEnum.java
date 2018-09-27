/**
 * 
 */
package com.threecube.test.droolsEngine.enums;

/**
 * @author dingwenbin
 *
 */
public enum HospitalLevelEnum {

	Primary(1, "普通"),
	
	Secondary(2, "二甲"),
	
	Tertiary(3, "三甲");
	
	private int code;
	
	private String level;
	
	HospitalLevelEnum(int code, String level) {
		this.code = code;
		this.level = level;
	}

	/**
	 * @return the code
	 */
	public int getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(int code) {
		this.code = code;
	}

	/**
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * @param level the level to set
	 */
	public void setLevel(String level) {
		this.level = level;
	}

	
	
}
