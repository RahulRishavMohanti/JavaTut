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
	@Override
	public boolean isExpensive() {
		// TODO Auto-generated method stub
		if("3G".equals(connectivity) && getPrice()>30000)
		{
			return true;
			
		}
		else if("4G".equals(connectivity) && getPrice() >50000) {
			return true;
		}
		return false;
	}
		
	
	

}
