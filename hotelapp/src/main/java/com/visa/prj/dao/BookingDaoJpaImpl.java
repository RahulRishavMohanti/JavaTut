package com.visa.prj.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.visa.prj.entity.Booking;
import com.visa.prj.entity.Hotel;
import com.visa.prj.entity.User;
@Repository
public class BookingDaoJpaImpl implements BookingDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Hotel> findHotels(String criteria) {
		String jpql = "select h from Hotel h where h.name like :cr OR h.city like :cr";
		
		TypedQuery<Hotel> query = em.createQuery(jpql,Hotel.class);
		query.setParameter("cr", "%"+criteria+"%");
		return query.getResultList();
	}

	@Override
	public Hotel findHotelById(long id) {
		return em.find(Hotel.class, id);
	}

	@Override
	public User getUser(String email, String password) {
		return em.find(User.class, email);
	}

	@Override
	public long createBooking(Booking booking) {
		em.persist(booking);
		return 0;
	}

	@Override
	public List<Booking> getAllBookingsOfUser(User user) {
		String jpql = "select b from Booking b where b.user.email = :beml";
		TypedQuery<Booking> query = em.createQuery(jpql,Booking.class);
		query.setParameter("beml", user.getEmail());
		return query.getResultList();
	}

}
