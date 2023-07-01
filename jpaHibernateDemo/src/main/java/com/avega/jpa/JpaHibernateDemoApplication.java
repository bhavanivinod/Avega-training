package com.avega.jpa;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.avega.jpa.dao.Employeedao;
import com.avega.jpa.daoimpl.Employeedaoimpl;
import com.avega.jpa.model.Employee;

@SpringBootApplication
public class JpaHibernateDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(JpaHibernateDemoApplication.class, args);
		Employeedao dao=ctx.getBean(Employeedaoimpl.class);
		
		/*
		 * Employee empy=new Employee(102,"bob","training"); Employee
		 * employee=dao.save(empy);
		 * System.out.println(employee.getId()+"Employee creted ");
		 */
		
		System.out.println(">>>>>>>>>>>>find a employee>>>>>>>>>>>");
		System.out.println(dao.retrive(101));
		
		System.out.println(">>>>>>>>>>>>find all employees>>>>>>>>>>>");
		List<Employee> emplist=dao.fetchAllEmployees();
		emplist.forEach(System.out::println);
		
		/*
		 * System.out.println(">>>>>>>>>>>>update employees>>>>>>>>>>>"); Employee
		 * empy=new Employee(101,"xxx","training");
		 * System.out.println(dao.updateEmp(empy));
		 */
		
		System.out.println(">>>>>>>>>>>>dlete employees>>>>>>>>>>>");
		
		System.out.println(dao.deleteEmp(102));
	}

}
