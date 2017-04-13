package com.piedpiper.restsample.model;

import java.util.List;
import java.util.Map;

import javax.persistence.*;


@SuppressWarnings("serial")
@Entity
@Table(name = "employee")
public class Employee implements java.io.Serializable {

	@Id
	@GeneratedValue
	private Long id;

	@Column
	private String name;

    protected Employee() {

	}
	
	public Employee(String name) {
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
