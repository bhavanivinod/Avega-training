package com.avega.jpa.dao;

import java.util.List;

import com.avega.jpa.model.Employee;

public interface Employeedao {

	Employee save(Employee employee);
	Employee retrive(int id);
	List<Employee> fetchAllEmployees();
	Employee updateEmp(Employee employee);
	boolean deleteEmp(int id);
}
