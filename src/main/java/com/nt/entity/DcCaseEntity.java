package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ISH_DataCollection")
public class DcCaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	 private Integer caseNo;
	private Integer planId;
	private Integer appId;
	private Integer caseNumber;
	public DcCaseEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DcCaseEntity(Integer caseNo, Integer planId, Integer appId, Integer caseNumber) {
		super();
		this.caseNo = caseNo;
		this.planId = planId;
		this.appId = appId;
		this.caseNumber = caseNumber;
	}
	public Integer getCaseNo() {
		return caseNo;
	}
	public void setCaseNo(Integer caseNo) {
		this.caseNo = caseNo;
	}
	public Integer getPlanId() {
		return planId;
	}
	public void setPlanId(Integer planId) {
		this.planId = planId;
	}
	public Integer getAppId() {
		return appId;
	}
	public void setAppId(Integer appId) {
		this.appId = appId;
	}
	public Integer getCaseNumber() {
		return caseNumber;
	}
	public void setCaseNumber(Integer caseNumber) {
		this.caseNumber = caseNumber;
	}
	@Override
	public String toString() {
		return "DcCaseEntity [caseNo=" + caseNo + ", planId=" + planId + ", appId=" + appId + ", caseNumber="
				+ caseNumber + "]";
	}
	
	

}
