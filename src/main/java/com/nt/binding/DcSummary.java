package com.nt.binding;

public class DcSummary {

	private Integer planId;
	private Integer appId;
	private Integer caseNumber;
	public DcSummary() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DcSummary(Integer planId, Integer appId, Integer caseNumber) {
		super();
		this.planId = planId;
		this.appId = appId;
		this.caseNumber = caseNumber;
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
		return "DcSummary [planId=" + planId + ", appId=" + appId + ", caseNumber=" + caseNumber + "]";
	}
	
}
