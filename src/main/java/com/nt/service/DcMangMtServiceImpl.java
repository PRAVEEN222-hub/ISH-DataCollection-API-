package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.nt.binding.ChildData;
import com.nt.binding.DcSummary;
import com.nt.binding.EducationalData;
import com.nt.binding.IncomeData;
import com.nt.binding.PlanData;
import com.nt.entity.DcCaseEntity;
import com.nt.entity.PlanEntity;
import com.nt.repo.IDccaseRepo;
import com.nt.repo.IPlanRepo;

public class DcMangMtServiceImpl implements IDcMngmtservice {
	@Autowired
	private IDccaseRepo dcRepo;
	@Autowired
	private IPlanRepo planRepo;
	

	@Override
	public Integer generateCaseNo(Integer appId) {
		Optional<DcCaseEntity> opt= dcRepo.findById(appId);
		if(opt.isPresent()) {
			DcCaseEntity entity=new DcCaseEntity();
			entity.setAppId(appId);
			return dcRepo.save(entity).getAppId();
		}
		
		return 0;
	}

	@Override
	public List<String> getPlanNames() {
	List<PlanEntity> planList = planRepo.findAll();
	//get plane name only using straem Api
	List<String> planSteram=planList.stream().map(plan-> plan.getPlanName()).toList();
		return planSteram;
	}

	@Override
	public Integer savePlanSelection(PlanData data) {
	PlanEntity entity=new PlanEntity();
	BeanUtils.copyProperties(data, entity);
	PlanEntity save = planRepo.save(entity);
		return null;
	}

	@Override
	public Integer saveInComeDetails(IncomeData income) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer saveEducationaldetails(EducationalData education) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer saveChildrenDetails(List<ChildData> child) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DcSummary showDcSummary(Integer caseNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
