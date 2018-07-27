package com.del;

import java.util.Scanner;

import com.del.service.Addition;
import com.del.service.Arithmetic;
import com.del.service.Division;
import com.del.service.Multiplication;
import com.del.service.Subtraction;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("My Calculator");
		Scanner scan = new Scanner(System.in);
		System.out.println("enter 0 to add");
		System.out.println("enter 1 to subtract");
		System.out.println("enter 2 to multiply");
		System.out.println("enter 3 for divide");
		System.out.println("Choose Operation");
		int choice = scan.nextInt();

		Arithmetic arr[] = { new Addition(), new Subtraction(), new Multiplication(), new Division() };
		arr[choice].read();

	}

	}


