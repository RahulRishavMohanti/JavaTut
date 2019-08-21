package com.visa.prj.entity;

import javax.persistence.*;

import org.hibernate.annotations.Cascade;

import net.bytebuddy.dynamic.scaffold.TypeInitializer.None;

import java.util.*;

@Entity
@Table(name="orders")
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int oid;
	@Column(name="order_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date orderDate = new Date();
	
	@ManyToOne
	@JoinColumn(name="customer")
	//FK to email of Customer
	private Customer customer;
	
	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="order_id") //FK to order in item table
	private List<Item> items = new ArrayList<>();
	
	private double total;
}
	