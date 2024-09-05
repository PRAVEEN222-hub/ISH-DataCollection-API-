package com.nt.binding;

public class EducationalData {
	
	private String hightQualification;
	private Integer caseNo;
	private Integer passOutyear;
	private Long ssn;
	public EducationalData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EducationalData(String hightQualification, Integer caseNo, Integer passOutyear,Long ssn) {
		super();
		this.hightQualification = hightQualification;
		this.caseNo = caseNo;
		this.passOutyear = passOutyear;
		this.ssn=ssn;
	}
	public Long getSsn() {
		return ssn;
	}
	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}
	public String getHightQualification() {
		return hightQualification;
	}
	public void setHightQualification(String hightQualification) {
		this.hightQualification = hightQualification;
	}
	public Integer getCaseNo() {
		return caseNo;
	}
	public void setCaseNo(Integer caseNo) {
		this.caseNo = caseNo;
	}
	public Integer getPassOutyear() {
		return passOutyear;
	}
	public void setPassOutyear(Integer passOutyear) {
		this.passOutyear = passOutyear;
	}
	@Override
	public String toString() {
		return "EducationalData [hightQualification=" + hightQualification + ", ssn="+ssn+", caseNo=" + caseNo + ", passOutyear="
				+ passOutyear + "]";
	}

	
}
