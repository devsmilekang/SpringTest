package com.kms.model;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

public class TestModel implements Serializable {
	private int id;
	
	@NotEmpty
	private String name;
	
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
}
