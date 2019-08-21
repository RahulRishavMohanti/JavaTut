package com.visa.prj.dao;

import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.visa.prj.entity.Employee;
import com.visa.prj.entity.Order;
import com.visa.prj.entity.Report;
import com.visa.prj.entity.Ticket;
@Repository
public class TicketDaoJpaImpl implements TicketDao {
	@PersistenceContext
	private EntityManager em;
	@Override
	public void raiseTicket(Ticket t) {
		// TODO Auto-generated method stub
		em.persist(t);	
	}

	@Override
	public List<Ticket> listAllTickets() {
		// TODO Auto-generated method stub
		String jpql = "from Ticket";
		TypedQuery<Ticket> query = em.createQuery(jpql, Ticket.class);
		return query.getResultList();
	}

	@Override
	public Ticket getTicketById(int t) {
		// TODO Auto-generated method stub
		return em.find(Ticket.class, t);
	}
	
	@Override
	public void resolveTicket(Ticket t,Employee e) {
		String jpql = "update Ticket t set t.resemp= :re and set t.resdate= :rd";
		TypedQuery<Ticket> query = em.createQuery(jpql, Ticket.class);
		query.setParameter("re",e.getEid());
		java.sql.Date date = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		query.setParameter("rd", date);
		query.executeUpdate();
	}

}
