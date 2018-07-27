package com.del;

import java.util.Scanner;

public class ClassMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter size of array");
		int length = scan.nextInt();
		System.out.println("enter elements of array");
		
		int arr[] = new int[length];
		for (int i = 0; i < length; i++) {
		        arr[i] = scan.nextInt();
		}
		
		UserMainCode obj=new UserMainCode();
		boolean check=obj.checkTriplets(arr);
		
		System.out.println(check);
		

	}

	}


