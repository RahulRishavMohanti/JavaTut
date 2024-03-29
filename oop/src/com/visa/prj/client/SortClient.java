package com.visa.prj.client;

import com.visa.prj.entity.Mobile;
import com.visa.prj.entity.Product;
import com.visa.prj.entity.Tv;
import com.visa.prj.util.Utility;

public class SortClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Lee", "Kevin" , "Angelina", "George", "Brad"};
		Utility.sort(names);
		for (String name : names) {
			System.out.println(name);
		}
		Product[] products = new Product[5]; // Array of 5 Pointers
		products[0] = new Tv(133,"Sony Bravia",135000.00,"LED");
		products[1] = new Mobile(453, "MotoG", 12999.00, "4G");
		products[2] = new Tv(634,"Onida Thunder",3500.00,"CRT");
		products[3] = new Mobile(621, "iPhone XR", 99999.00, "4G");
		products[4] = new Mobile(844, "Oppo", 9999.00, "4G");
		Utility.sort(products);
		for (Product p : products) {
			System.out.println(p);
			
		}

	}

}
