package com.visa.prj.client;

import java.lang.reflect.InvocationTargetException;

import com.visa.prj.entity.Product;
import com.visa.prj.util.SQLUtil;

public class SQLClient {
	public static void main(String[] args) {
		String CREATE_SQL = SQLUtil.generateCreateSQL(Product.class);
		System.out.println(CREATE_SQL);
		Product p = new Product(120,"iPhone XR", 0, "xx", 0);
			String INSERT_SQL = SQLUtil.generateInsertSQL(p);
		
			System.out.println(INSERT_SQL);
		
	}
}
