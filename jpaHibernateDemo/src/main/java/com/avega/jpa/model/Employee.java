package com.avega.jpa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_tbl")
public class Employee {
	
	@Id
	@Column(name="employeeCode")
	private int id;
	
	
	@Column(name="employeeName",nullable = false)
	private String name;
	
	@Column(name="designation",nullable = false)
	private String desg;

	public Employee(int id, String name, String desg) {
		super();
		this.id = id;
		this.name = name;
		this.desg = desg;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desg=" + desg + "]";
	}
	

	
}
