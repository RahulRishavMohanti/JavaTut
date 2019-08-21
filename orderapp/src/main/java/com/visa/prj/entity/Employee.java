package com.visa.prj.entity;

import javax.persistence.*;

@Entity
@Table(name="employees")
public class Employee {
	@Id
	private int eid;
	private String name;
	private boolean itmem;
	public boolean isItmem() {
		return itmem;
	}
	public void setItmem(boolean itmem) {
		this.itmem = itmem;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	}
	
