package com.visa.prj.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.visa.prj.entity.Customer;
import com.visa.prj.entity.Item;
import com.visa.prj.entity.Order;
import com.visa.prj.entity.Product;
import com.visa.prj.service.OrderService;









public class LoginController {

	@Autowired
	private OrderService os;
	@RequestMapping("login.do")
	public String doLogin(@RequestParam("email") String email, @RequestParam("pwd") String pwd, Model m) {
		m.addAttribute("user", email);
		return "listproducts.do";
	}
	 
	@RequestMapping("signout.do")
	public String doLogout(HttpServletRequest req) {
		HttpSession ses = req.getSession(false);
		ses.removeAttribute("user");
		ses.invalidate();
		return "redirect:login.html";// Client-side redirection
	}
	@RequestMapping("cart.do")
	public String addToCart(HttpServletRequest req) {
		HttpSession ses = req.getSession(false);
		String[] prds = req.getParameterValues("prds");
		String eml = (String) ses.getAttribute("user");
		System.out.println(eml);
		os.addToCart(prds,eml);
		
		return "done";
		
		
		//Get Product for Product ID
		//create item object
		//add product to item
		//creat order object
		//set customer to order based on who has logged in
		//place order
        
	}
}
