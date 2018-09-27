/**
 * 
 */
package com.threecube.test.droolsEngine.enums;

/**
 * @author dingwenbin
 *
 */
public enum ZoneTypeEnum {
	
	TOWN(1, "乡镇"),
	
	COUNTY(2, "县级"),
	
	MUNICIPAL(3, "市级"),
	
	PROVINCIAL(4, "省级"),
	
	OUTSIDE(5, "外省");
	
	private int code;
	
	private String name;
	
	ZoneTypeEnum(int code, String name) {
		this.code = code;
		this.name = name;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	
	
}
