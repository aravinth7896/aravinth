package com.del.dao;

public interface MobileDao {
	void depositAmount(double amount,String mode);

	double getBalance();

	boolean authenticate(String login, String password);

	


}
