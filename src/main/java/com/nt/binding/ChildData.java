package com.nt.binding;

import java.time.LocalDate;

public class ChildData {

	private String childName;
	   private LocalDate dob;
	   private  Long ssn;
	   private Integer caseNo;
	public ChildData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChildData(String childName, LocalDate dob, Long ssn, Integer caseNo) {
		super();
		this.childName = childName;
		this.dob = dob;
		this.ssn = ssn;
		this.caseNo = caseNo;
	}
	public String getChildName() {
		return childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Long getSsn() {
		return ssn;
	}
	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}
	public Integer getCaseNo() {
		return caseNo;
	}
	public void setCaseNo(Integer caseNo) {
		this.caseNo = caseNo;
	}
	@Override
	public String toString() {
		return "ChildData [childName=" + childName + ", dob=" + dob + ", ssn=" + ssn + ", caseNo=" + caseNo + "]";
	}
}
