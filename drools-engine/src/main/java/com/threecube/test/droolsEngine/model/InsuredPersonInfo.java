/**
 * 
 */
package com.threecube.test.droolsEngine.model;

import java.io.Serializable;

import com.threecube.test.droolsEngine.enums.HospitalLevelEnum;
import com.threecube.test.droolsEngine.enums.ZoneTypeEnum;

/**
 * 参保人员信息
 * 
 * @author dingwenbin
 *
 */
public class InsuredPersonInfo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4210670818018475837L;

	/**
	 * id
	 */
	private int id;
	
	/**
	 * 就诊所属地区类别
	 */
	private ZoneTypeEnum zoneType;
	
	/**
	 * 就诊医院所属类别
	 */
	private HospitalLevelEnum hospital;
	
	/**
	 * 就诊花销
	 */
	private double cost;
	
	/**
	 * 医保报销比例
	 */
	private double insuredRatio = 0d;
	
	/**
	 * 报销金额
	 */
	private double insuranceValue = 0d;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the zoneType
	 */
	public ZoneTypeEnum getZoneType() {
		return zoneType;
	}

	/**
	 * @param zoneType the zoneType to set
	 */
	public void setZoneType(ZoneTypeEnum zoneType) {
		this.zoneType = zoneType;
	}

	/**
	 * @return the hospital
	 */
	public HospitalLevelEnum getHospital() {
		return hospital;
	}

	/**
	 * @param hospital the hospital to set
	 */
	public void setHospital(HospitalLevelEnum hospital) {
		this.hospital = hospital;
	}

	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}

	/**
	 * @return the insuredRatio
	 */
	public double getInsuredRatio() {
		return insuredRatio;
	}

	/**
	 * @param insuredRatio the insuredRatio to set
	 */
	public void setInsuredRatio(double insuredRatio) {
		this.insuredRatio = insuredRatio;
	}

	/**
	 * @return the insuranceValue
	 */
	public double getInsuranceValue() {
		return insuranceValue;
	}

	/**
	 * @param insuranceValue the insuranceValue to set
	 */
	public void setInsuranceValue(double insuranceValue) {
		this.insuranceValue = insuranceValue;
	}
	
	@Override
	public String toString() {
		return String.format("报销人员所属地区：%s, 就诊医院类别：%s, 开销： %s", zoneType.getName(), hospital.getLevel(), cost);
	}
}
