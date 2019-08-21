package com.visa.prj.entity;

public class Report {
	private int ticket_id;
	private String ticket_desc;
	private String resolved_by;
	private int time_taken;
	private int start_date;
	private int end_date;
	public Report(int ticket_id, String ticet_desc, String resolved_by, int time_taken, int start_date, int end_date) {
		this.ticket_id = ticket_id;
		this.ticket_desc = ticet_desc;
		this.resolved_by = resolved_by;
		this.time_taken = time_taken;
		this.start_date = start_date;
		this.end_date = end_date;
	}
	
}
