package com.nt.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ISH_CHILD")
public class ChildEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer childId;
	private String childName;
   private LocalDate dob;
   private  Long ssn;
   private Integer caseNo;
public ChildEntity() {
	super();
	// TODO Auto-generated constructor stub
}
public ChildEntity(Integer childId, String childName, LocalDate dob, Long ssn, Integer caseNo) {
	super();
	this.childId = childId;
	this.childName = childName;
	this.dob = dob;
	this.ssn = ssn;
	this.caseNo = caseNo;
}
public Integer getChildId() {
	return childId;
}
public void setChildId(Integer childId) {
	this.childId = childId;
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
	return "ChildEntity [childId=" + childId + ", childName=" + childName + ", dob=" + dob + ", ssn=" + ssn
			+ ", caseNo=" + caseNo + "]";
}
   
}
