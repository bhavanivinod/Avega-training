package com.avega.jpa.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
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
@Table(name="skill_tbl")
public class Skill {

	@Id
	private String id;
	private String description;
	private String category;
	@ManyToMany(mappedBy = "skills")
	private List<Employee> employees;
	
	
}
