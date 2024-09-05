package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.PlanEntity;

public interface IPlanRepo extends JpaRepository<PlanEntity, Integer> {

}
