package com.del.service;

public class Subtraction extends Arithmetic{

	@Override
	public void calculate(int num1, int num2) {
		int res = num1 - num2;
		this.display(res);
	}

}