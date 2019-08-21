package com.visa.prj.dao;

import java.sql.SQLException;

public class FetchException extends Exception {

	public FetchException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FetchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public FetchException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public FetchException(String message, SQLException ex) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public FetchException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
