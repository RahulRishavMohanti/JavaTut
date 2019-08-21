package com.visa.prj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.visa.prj.dao.EmployeeDao;
import com.visa.prj.dao.TicketDao;
import com.visa.prj.entity.Employee;
import com.visa.prj.entity.Ticket;

@Service
public class TicketService {
	
	@Autowired
	private TicketDao ticketDao; 
	
	@Autowired
	private EmployeeDao empDao;
	
	@Transactional
	public void addEmp(Employee e) {
		empDao.addEmployee(e);
	}
	@Transactional
	public void raiseTicket(Ticket t) {
		if(!t.getRaiemp().isItmem())
		{
			ticketDao.raiseTicket(t);
		}
		else {
			System.out.println("Not Elgiible");
		}
	}
	@Transactional
	public void displayTickets() {
		List<Ticket> L=ticketDao.listAllTickets();	
		for (Ticket l : L) {
			System.out.println(l.getTid());
		}	
	}
	@Transactional
	public void resolveTicket(Ticket t, Employee e) {
		ticketDao.resolveTicket(t, e);
	}
}

