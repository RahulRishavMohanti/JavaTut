package com.visa.prj.entity;

public class Time {
	private int hrs;
	private int min;
	public Time(int i, int j) {
		// TODO Auto-generated constructor stub
		this.hrs = i;
		this.min = j;
	}
	
	public static Time addtime(Time t1, Time t2) {
		// TODO Auto-generated method st
		Time x = new Time(0,0);
		x.hrs =  t1.getHours() + t2.getHours();
		
		x.min =  t1.getMin() + t2.getMin();
		if(x.min>=60) {
			x.hrs = x.hrs + (x.min/60);
			x.min =  (x.min%60);
		}
		return x;
	}
	public int getMin() {
		// TODO Auto-generated method stub
		return this.min;
	}
	public int getHours() {
		// TODO Auto-generated method stub
		return this.hrs;
	}
	public Time addTime(Time t2) {  
		// TODO Auto-generated method stub
		// TODO Auto-generated method st
				Time x = new Time(0,0);
				x.hrs =  this.getHours() + t2.getHours();
				
				x.min =  this.getMin() + t2.getMin();
				if(x.min>=60) {
				x.hrs = x.hrs + (x.min/60);
				x.min = (x.min%60);}
				
				return x;
	}
	
}
