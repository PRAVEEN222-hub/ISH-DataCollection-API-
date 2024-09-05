package com.nt.binding;

import java.time.LocalDate;

public class PlanData {
	
	private String planName;
	private LocalDate startDate;
	private LocalDate endDate;
	private String descrption;
	private String activeSW;
	private LocalDate  createdBy;
	private LocalDate updatedBy;
	private String credtedBy;
	private String updated_By;
	public PlanData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PlanData(String planName, LocalDate startDate, LocalDate endDate, String descrption, String activeSW,
			LocalDate createdBy, LocalDate updatedBy, String credtedBy, String updated_By) {
		super();
		this.planName = planName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.descrption = descrption;
		this.activeSW = activeSW;
		this.createdBy = createdBy;
		this.updatedBy = updatedBy;
		this.credtedBy = credtedBy;
		this.updated_By = updated_By;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public LocalDate getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	public String getDescrption() {
		return descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	public String getActiveSW() {
		return activeSW;
	}
	public void setActiveSW(String activeSW) {
		this.activeSW = activeSW;
	}
	public LocalDate getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(LocalDate createdBy) {
		this.createdBy = createdBy;
	}
	public LocalDate getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(LocalDate updatedBy) {
		this.updatedBy = updatedBy;
	}
	public String getCredtedBy() {
		return credtedBy;
	}
	public void setCredtedBy(String credtedBy) {
		this.credtedBy = credtedBy;
	}
	public String getUpdated_By() {
		return updated_By;
	}
	public void setUpdated_By(String updated_By) {
		this.updated_By = updated_By;
	}
	@Override
	public String toString() {
		return "PlanData [planName=" + planName + ", startDate=" + startDate + ", endDate=" + endDate + ", descrption="
				+ descrption + ", activeSW=" + activeSW + ", createdBy=" + createdBy + ", updatedBy=" + updatedBy
				+ ", credtedBy=" + credtedBy + ", updated_By=" + updated_By + "]";
	}
	
	

}
