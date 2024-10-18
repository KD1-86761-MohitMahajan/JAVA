package com.sunbeam;

import java.util.Scanner;

// Declaring the class
public class Invoice {
	private String partNumber;
	private int quantity;
	private double price;
	private String partDesc;

// Parameterless Constructor
	public Invoice() {
		partNumber = "";
		quantity = 0;
		price = 0.0;
		partDesc = "";
	}

// Parameterized Constructor
	public Invoice(String partNumber, int quantity, double price, String partDesc) {
		this.partNumber = partNumber;
		this.quantity = quantity;
		this.partDesc = partDesc;
		this.price = price;
	}

	// Setter for partNumber
	public String getPartNumber() {
		return partNumber;
	}

	// Getter for partNumber
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;

	}

	public String getPartDesc() {
		return partDesc;
	}

	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Part Number of the object: ");
		this.partNumber = sc.next();

		System.out.println("Enter the Price of the object: ");
		double p1 = sc.nextDouble();
		if (p1 < 0) {
			System.out.println("Enter valid value");
			System.out.println("Enter the Price of the object: ");
			this.price = sc.nextDouble();
		}
		else
			this.price = sc.nextDouble();

//		setPrice(sc.nextDouble());

		System.out.println("Enter the Description of the object: ");
		this.partDesc = sc.next();

		System.out.println("Enter the Quantity of the object: ");
		// this.quantity = sc.nextInt();
		setQuantity(sc.nextInt());

	}

	public void displayData() {
		System.out.println("The entered Part Number is: " + partNumber);
		System.out.println("The entered Quantity is: " + quantity);
		System.out.println("The entered Price is: " + price);
		System.out.println("The entered Description is: " + partDesc);
		TotalPrice();

	}

	public double TotalPrice() {
		double amt1;
		// amt = getPrice()* getQuantity();
		amt1 = price * quantity;
		System.out.println("The total value of the item is: " + amt1);
		return amt1;
	}

}
