package com.visa.prj.entity;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimeTest {

	

	@Test
	public void x() {
		Time T= new Time(8,20);
		Time T2 = new Time(7,15);
		Time T3 = Time.addtime(T,T2);
		
			
		assertEquals(T3.getHours(),15);
		assertEquals(T3.getMin(),35);
		
	}

	
	@Test
	public void y() {
		
		Time T= new Time(8,20);
		Time T2 = new Time(7,15);
		Time T4 = T.addTime(T2);
		
			
		assertEquals(T4.getHours(),15);
		assertEquals(T4.getMin(),35);
	}

}
