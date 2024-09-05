package com.nt.service;

import java.util.List;

import com.nt.binding.ChildData;
import com.nt.binding.DcSummary;
import com.nt.binding.EducationalData;
import com.nt.binding.IncomeData;
import com.nt.binding.PlanData;

public interface IDcMngmtservice {
	
	public Integer generateCaseNo(Integer appId);
	
	public List<String> getPlanNames();
	
	public Integer savePlanSelection(PlanData data);
	public Integer saveInComeDetails(IncomeData income);
	
	public Integer saveEducationaldetails(EducationalData education);
	
	public Integer saveChildrenDetails(List<ChildData> child);
	
	public DcSummary showDcSummary(Integer caseNo);
	
	

}
