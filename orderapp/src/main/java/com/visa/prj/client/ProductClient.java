package com.visa.prj.client;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.visa.prj.entity.Product;
import com.visa.prj.service.OrderService;

public class ProductClient {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		//AppplicationContect ctx = new ClassPathXmlApplicationContext("app.xml");
		ctx.scan("com.visa.prj");
		ctx.refresh();
		
		OrderService os = ctx.getBean("orderService", OrderService.class);//className is ID but first character is lowercase
		/*
		Product p = new Product(0,"Logitech mouse","computer",450.00,1000);
		//os.insertProduct(p);
		p = os.getById(5);
		System.out.println(p.getName() + "," + p.getCategory() + "," + p.getPrice());
		*/
		List<Product> list = os.fetchProducts();
		for(Product p : list) {
			System.out.println(p.getName()+ "," + p.getPrice());
		}
	}
}
