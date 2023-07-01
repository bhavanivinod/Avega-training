package com.avega.jpa.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.avega.jpa.dao.Employeedao;
import com.avega.jpa.model.Employee;

@Repository
public class Employeedaoimpl implements Employeedao {

	@Autowired
	EntityManager entityManager;
	
	@Transactional
	@Override
	public Employee save(Employee employee) {
		entityManager.persist(employee);

		return employee ;
	}

	@Override
	public Employee retrive(int id) {
				
		return entityManager.find(Employee.class, id);
	}

	@Override
	public List<Employee> fetchAllEmployees() {
		@SuppressWarnings("unchecked")
		List<Employee> employees=entityManager.createQuery("from Employee e",Employee.class).getResultList();
		
		return employees;
	}

	@Transactional
	@Override
	public Employee updateEmp(Employee employee) {
		Employee emp=entityManager.find(Employee.class,employee.getId() );
		emp.setDesg(employee.getDesg());
			
		return entityManager.merge(emp);
	}

	@Transactional
	@Override
	public boolean deleteEmp(int id) {
		boolean flag=false;
		Employee emp=entityManager.find(Employee.class,id );
		entityManager.remove(emp);
		if(entityManager.find(Employee.class,id )==null)
			flag=true;
		return flag;
	}
	
	

}
