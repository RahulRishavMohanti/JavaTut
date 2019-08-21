package com.visa.prj.entity;



import java.sql.Date;

import javax.persistence.*;

@Entity
@Table(name="tickets")
public class Ticket {
	@Id
	@Column(name="ticket_id")
	private int tid;
	
	@Column(name="ticket_desc")
	private String tdesc;
	@Column(name="raised_date")
	private Date raidate;
	@Column(name="resolved_date")
	private Date resdate;

	public Ticket() {
	}
	@ManyToOne
	@JoinColumn(name="raised_by",referencedColumnName = "name",insertable=true,updatable=true)
	private Employee raiemp;
	
	@ManyToOne
	@JoinColumn(name="resolved_by",referencedColumnName = "name",insertable=true,updatable=true)
	private Employee resemp;
	@Column(name="resolve_text")
	private String restext;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTdesc() {
		return tdesc;
	}
	public void setTdesc(String tdesc) {
		this.tdesc = tdesc;
	}
	public Date getRaidate() {
		return raidate;
	}
	public void setRaidate(Date raidate) {
		this.raidate = raidate;
	}
	public Date getResdate() {
		return resdate;
	}
	public void setResdate(Date resdate) {
		this.resdate = resdate;
	}
	public String getRestext() {
		return restext;
	}
	public void setRestext(String restext) {
		this.restext = restext;
	}
	public Employee getRaiemp() {
		return raiemp;
	}
	public void setRaiemp(Employee raiemp) {
		this.raiemp = raiemp;
	}
	public Employee getResemp() {
		return resemp;
	}
	public void setResemp(Employee resemp) {
		this.resemp = resemp;
	}
	
}
