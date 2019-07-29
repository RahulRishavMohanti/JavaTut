package com.visa.prj.entity;
/**
 * This is a class to represent account business data. 
 * It allows to credit and debit amount.
 * 
 * @author root
 * @version 1.0
 */
public class Account {
	private double balance; // State of Object --> instance variable
	/** method to credit amount into account
	 * 
	 * @param amt Amount to be credited
	 */
	private static int count;
	public Account()
	{
		count++;
	}
	public void deposit(double amt) {//public void deposit(Account this, bal amt)
		balance += amt;

	}
	/** method returns current balance in account
	 * 
	 * @return the current balance
	 */
	public double getBalance() {
		return balance;
	}
	public static int getCount() {
		return count;
	}
}
