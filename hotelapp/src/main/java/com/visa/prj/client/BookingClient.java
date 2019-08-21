package com.visa.prj.client;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.visa.prj.entity.*;
import com.visa.prj.service.BookingService;

public class BookingClient {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		//AppplicationContect ctx = new ClassPathXmlApplicationContext("app.xml");
		ctx.scan("com.visa.prj");
		ctx.refresh();
		
		BookingService bs = ctx.getBean("bookingService", BookingService.class);//className is ID but first character is lowercase
		
		List<Hotel> list = bs.findHotels("Southampton");
		for(Hotel h : list) {
			System.out.println(h.getName() + " "+ h.getCity());
		}
		
		Hotel hid = bs.getHotelById(4);
		User uid = bs.getUser("rahul@gmail.com", "secret");
		
		System.out.println(hid.getName());
		System.out.println(uid.getName());
		
	}
}
