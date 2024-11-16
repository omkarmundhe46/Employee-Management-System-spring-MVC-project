package com.empsys.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empsys.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
