package com.visa.prj.client;
import java.sql.Date;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.visa.prj.entity.Customer;
import com.visa.prj.entity.Employee;
import com.visa.prj.entity.Ticket;
import com.visa.prj.service.OrderService;
import com.visa.prj.service.TicketService;

public class TicketClient {
	public static void main(String args[]) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		//AppplicationContect ctx = new ClassPathXmlApplicationContext("app.xml");
		ctx.scan("com.visa.prj");
		ctx.refresh();
		
		TicketService ts = ctx.getBean("ticketService", TicketService.class);
		/*
		Employee  e = new Employee();
	    e.setName("r@gmail.com");
	    e.setEid(1);
	    e.setItmem(true);
	    Employee  e2 = new Employee();
	    e2.setName("pr@gmail.com");
	    e2.setEid(2);
	    e2.setItmem(false);
	    ts.addEmp(e);
	    ts.addEmp(e2);*/
		 Employee  e3 = new Employee();
		    e3.setName("princ@gmail.com");
		    e3.setEid(5);
		    e3.setItmem(true);
		    
		   // ts.addEmp(e3);
	    long millis = System.currentTimeMillis();
	   	Date d = new Date(millis);
	   
	   	Ticket t = new Ticket();	   	
	    t.setTid(2);
	    t.setRaidate(d);
	    t.setRaiemp(e3);
	    t.setTdesc("test2");
	    //ts.raiseTicket(t);
	    ts.displayTickets();
	    
	    
	    
	}
}
