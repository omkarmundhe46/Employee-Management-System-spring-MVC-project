package com.empsys.service;

import java.util.List;

import com.empsys.entity.Employee;

public interface EmpService {

	public Employee saveEmp(Employee emp);

	public List<Employee> getAllEmp();

	public Employee getEmpById(int id);

	public boolean deleteEmp(int id);

}
