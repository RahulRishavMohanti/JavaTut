package com.visa.prj.entity;

import javax.persistence.*;

@Entity
@Table(name="customers")
public class Customer {
	@Id
	private String email;
	@Column(name="first_name")
	private String firstName;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
}
