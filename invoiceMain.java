package com.sunbeam;

public class invoiceMain {

	public static void main(String[] args) {
		double billamt;
		Invoice I1 = new Invoice();
		Invoice I2 = new Invoice();
		Invoice I3 = new Invoice();
		I1.acceptData();
		I1.displayData();
		I2.acceptData();
		I2.displayData();
		I3.acceptData();
		I3.displayData();
		billamt= I1.TotalPrice()+ I2.TotalPrice()+ I3.TotalPrice();
		System.out.println("The total invoice value is: " +billamt);
		
	}

}
