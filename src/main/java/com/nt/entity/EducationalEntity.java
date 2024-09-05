package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ISH_Edcation")
public class EducationalEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer eId;
	private String hightQualification;
	private Integer caseNo;
	private Integer passOutyear;
	private Long ssn;
	public EducationalEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EducationalEntity(Integer eId, String hightQualification, Integer caseNo, Integer passOutyear,Long ssn) {
		super();
		this.eId = eId;
		this.hightQualification = hightQualification;
		this.caseNo = caseNo;
		this.ssn=ssn;
		this.passOutyear = passOutyear;
	}
	public Long getSsn() {
		return ssn;
	}
	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}
	public Integer geteId() {
		return eId;
	}
	public void seteId(Integer eId) {
		this.eId = eId;
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
		return "EducationalEntity [eId=" + eId + ",ssn="+ssn+", hightQualification=" + hightQualification + ", caseNo=" + caseNo
				+ ", passOutyear=" + passOutyear + "]";
	}
	

}
