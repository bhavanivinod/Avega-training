package com.avega.jpa.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
@Table(name="project_tbl")
public class Project {
@Id
private String projectid;
private String desc;
private Date startDate;
private Date endDate;
@OneToOne
private Employee manager;


@OneToMany(mappedBy = "project")
private List<Allocation> allocatedEmployees;

}
