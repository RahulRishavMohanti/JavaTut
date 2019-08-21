package com.visa.prj.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.visa.prj.dao.BookingDao;
import com.visa.prj.entity.Booking;
import com.visa.prj.entity.Hotel;
import com.visa.prj.entity.User;

@Service
public class BookingService {
	
	@Autowired
	private BookingDao bookingDao;
	
	public List<Booking> getAllBookingsByUser(User user){
		return bookingDao.getAllBookingsOfUser(user);
	}
	
	public List<Hotel> findHotels(String criteria) {
		return bookingDao.findHotels(criteria);
	}
	
	public Hotel getHotelById(long id) {
		return bookingDao.findHotelById(id);
	}
	
	public User getUser(String email, String password) {
		return bookingDao.getUser(email, password);
	}
	
	public Booking makeBooking(String eml, long hID) {
		User us = new User();
		us.setEmail(eml);
		
		Hotel h = new Hotel();
		h.setId(hID);
		
		Booking b = new Booking();
		b.setUser(us);
		b.setHotel(h);
		b.setBeds(1);
		b.setSmoking(true);
		return b;
	}
	@Transactional
	public void bookFinal(Booking b) {
		bookingDao.createBooking(b);
	}

}

