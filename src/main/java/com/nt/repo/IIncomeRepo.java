package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.IncomeEntity;

public interface IIncomeRepo extends JpaRepository<IncomeEntity, Integer> {

}
