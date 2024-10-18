package com.sunbeam;

import java.util.Scanner;

public class empmain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Employees you wish to enter: ");
		int no = sc.nextInt();
		Employee [] arr = new Employee[no];
		for( int i = 0; i < arr.length; i++ ) {
			System.out.println("The details of the entered Employee are as follows: ");
			arr[i] = new Employee();
			arr[i].acceptData();
			arr[i].displayData();
			
		}
	}

}
