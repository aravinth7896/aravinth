package com.del.dao;

import com.del.exception.MobileException;
import com.del.util.Message;

public class MobileDaoImpl implements MobileDao {

	private double balance;	
	private String login="Deloitte";
	private String password="Del123";
	public void depositAmount(double amount,String mode) {
		balance =balance-amount;
		System.out.println("MODE OF PAYMENT: "+mode);
		if(balance<0) {
			throw new MobileException(Message.ZERO_BALANCE);
		}		
	}
	public double getBalance() {
		return balance;
		
	}
	public boolean authenticate(String login, String password) {
		return this.login.equals(login) && 
				this.password.equals(password);
	}

}
