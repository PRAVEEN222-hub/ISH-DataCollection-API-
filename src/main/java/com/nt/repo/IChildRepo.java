package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.ChildEntity;

public interface IChildRepo extends JpaRepository<ChildEntity, Integer> {

}
