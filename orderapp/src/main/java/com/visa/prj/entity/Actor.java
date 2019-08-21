package com.visa.prj.entity;

import javax.persistence.*;

@Entity
@Table(name="actors")
public class Actor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int aid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	private String name;
	
	}
	
