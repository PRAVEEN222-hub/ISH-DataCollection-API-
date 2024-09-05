package com.nt.binding;

public class IncomeData {

	private Double empSalary;
	private Double  	incomeProperty;
	private Integer caseNo;
	public IncomeData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IncomeData(Double empSalary, Double incomeProperty, Integer caseNo) {
		super();
		this.empSalary = empSalary;
		this.incomeProperty = incomeProperty;
		this.caseNo = caseNo;
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
		return "IncomeData [empSalary=" + empSalary + ", incomeProperty=" + incomeProperty + ", caseNo=" + caseNo + "]";
	}
	
}
