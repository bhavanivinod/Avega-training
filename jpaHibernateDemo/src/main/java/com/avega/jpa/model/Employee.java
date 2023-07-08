package com.avega.jpa.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
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
	
	@OneToOne
	private Department department;
	@ManyToMany
	@JoinTable(name = "employees_skills",
	joinColumns = @JoinColumn(referencedColumnName = "employeeCode"),
	inverseJoinColumns = @JoinColumn(referencedColumnName = "id"))
	private Set<Skill> skills;
	
	@OneToMany(mappedBy = "employee")
	
	private List<Allocation> allocateProjects;
	

	
}
