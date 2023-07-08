package com.avega.jpa.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
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
@Table(name="allocation_tbl")
public class Allocation {
	
@ManyToOne
private Employee employee;

@Id
private String id;

@ManyToOne
private Project project;

private Date allocationDate;

@OneToOne
private Employee allocatedBy;

}
