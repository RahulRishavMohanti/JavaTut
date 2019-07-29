package com.visa.prj.entity;

public class Tv extends Product {
private String connectivity;
	public Tv() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Tv(int id, String name, double price, String connectivity) {
		super(id, name, price);
		this.connectivity = connectivity;
		// TODO Auto-generated constructor stub
	}
	public String getConnectivity() {
		return connectivity;
	}
	public void setConnectivity(String connectivity) {
		this.connectivity = connectivity;
	}
	

}
