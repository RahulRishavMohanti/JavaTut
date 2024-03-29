package com.visa.prj.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.*;

/**
 * A hotel where users may book stays.
 */
@Entity
@Table(name="hotels")
public class Hotel implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3749724822566325009L;
	@Id
	@Column(name="hotel_id")
	private Long id;
	@Column(name="hotel_name")
    private String name;

    private String address;

    private String city;

    private String state;

    private String zip;

    private String country;

    private BigDecimal price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Hotel(" + name + "," + address + "," + city + "," + zip + ")";
    }

   
}
