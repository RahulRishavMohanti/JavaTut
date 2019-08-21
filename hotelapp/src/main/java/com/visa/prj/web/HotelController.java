package com.visa.prj.web;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.visa.prj.entity.Booking;
import com.visa.prj.entity.Hotel;
import com.visa.prj.entity.User;
import com.visa.prj.service.BookingService;

@Controller
@SessionAttributes("user")
public class HotelController {
	@Autowired
	private BookingService bs;
	
	@RequestMapping("login.do")
	public String doLogin(@RequestParam("email")String eml,@RequestParam("pass")String pass, Model m) {
		m.addAttribute("user",eml);
		return "index.jsp";
	}
	 
	@RequestMapping("signout.do")
	public String doLogout(HttpServletRequest req) {
		HttpSession ses = req.getSession(false);
		ses.removeAttribute("user");
		ses.invalidate();
		return "redirect:login.html";// Client-side redirection
	}
	
	@RequestMapping("search.do")
	public String searchControl() {
		return "redirect:searchForm.jsp";
	}
	
	@RequestMapping("hotels.do")
	public ModelAndView searchHotel(@RequestParam("searchString") String hotelName,
			@RequestParam("pageSize")int pSize) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("searchResults.jsp");
		List<Hotel> list = bs.findHotels(hotelName);
		List<Hotel> l = list.stream().limit(pSize).collect(Collectors.toList());
		mav.addObject("hotelList",l);
		return mav;
	}
	@RequestMapping("viewHotel.do")
	public ModelAndView viewHotel(@RequestParam("id") long hotelID) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("showHotel.jsp");
		Hotel h = bs.getHotelById(hotelID);
		mav.addObject("hotel",h);
		return mav;
		}
	
	@RequestMapping("bookingForm.do")
	public ModelAndView bookingForm(HttpServletRequest req,@RequestParam("id") Long hotelId)
	{
		HttpSession ses = req.getSession(false);
		String eml = (String) ses.getAttribute("user");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("bookingForm.jsp");
		mav.addObject("id",hotelId);
		Booking b = bs.makeBooking(eml, hotelId);
		Hotel h = bs.getHotelById(hotelId);
		mav.addObject("hotel",h);
		mav.addObject("booking",b);
		ses.setAttribute("bb",b );
		return mav;
}
	@RequestMapping("placeReservation.do")
	public ModelAndView placeReservation(HttpServletRequest req,@ModelAttribute("booking") Booking b) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.jsp");
		HttpSession ses = req.getSession(false);
		Booking bb =  (Booking) ses.getAttribute("bb");
		bb.setCheckinDate(b.getCheckinDate());
		bb.setCheckoutDate(b.getCheckoutDate());
		bs.bookFinal(bb);
		return mav;
		
	}
	@RequestMapping("showBookings.do")
	public ModelAndView showBooking(HttpServletRequest req) {
		HttpSession ses = req.getSession(false);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("showBookings.jsp");
		mav.addObject("booking",(Booking)ses.getAttribute("bb"));
		String us = (String) ses.getAttribute("user");
		User u = new User();
		u.setEmail(us);
		List<Booking> lb = bs.getAllBookingsByUser(u);
		mav.addObject("bookingList",lb);
		return mav;
	}
		
	
}