package com.visa.prj.dao;

import java.util.List;

import com.visa.prj.entity.Customer;
import com.visa.prj.entity.Order;

public interface OrderDao {
	List<Order> getOrders(Customer c);
	List<Order> getOrdersOfCustomer(Customer c);
	void placeOrder(Order o);
	
}
