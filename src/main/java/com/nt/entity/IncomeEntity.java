package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ISH_Income")
public class IncomeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer incomeId;
	private Double empSalary;
	private Double  	incomeProperty;
	private Integer caseNo;
	public IncomeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IncomeEntity(Integer incomeId, Double empSalary, Double incomeProperty, Integer caseNo) {
		super();
		this.incomeId = incomeId;
		this.empSalary = empSalary;
		this.incomeProperty = incomeProperty;
		this.caseNo = caseNo;
	}
	public Integer getIncomeId() {
		return incomeId;
	}
	public void setIncomeId(Integer incomeId) {
		this.incomeId = incomeId;
	}
	public Double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}
	public Double getIncomeProperty() {
		return incomeProperty;
	}
	public void setIncomeProperty(Double incomeProperty) {
		this.incomeProperty = incomeProperty;
	}
	public Integer getCaseNo() {
		return caseNo;
	}
	public void setCaseNo(Integer caseNo) {
		this.caseNo = caseNo;
	}
	@Override
	public String toString() {
		return "IncomeEntity [incomeId=" + incomeId + ", empSalary=" + empSalary + ", incomeProperty=" + incomeProperty
				+ ", caseNo=" + caseNo + "]";
	}
	
	
	

}
