package com.visa.prj.dao;

import java.util.List;

import com.visa.prj.entity.Employee;
import com.visa.prj.entity.Report;
import com.visa.prj.entity.Ticket;

public interface TicketDao {
	void raiseTicket(Ticket t);
	List<Ticket> listAllTickets();
	Ticket getTicketById(int t);
	void resolveTicket(Ticket t,Employee e);
}
