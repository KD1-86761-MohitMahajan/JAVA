package com.sunbeam;

import java.util.Scanner;

public class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	private int performance;
	private double app;

	public Employee() {

	}

	public Employee(String firstName, String lastName, double salary, int performance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.performance = performance;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getPerformance() {
		return performance;
	}

	public void setPerformance(int performance) {
		this.performance = performance;
	}

	public void acceptData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\t Welcome to the Annual Appraisal System of Stark Industries!!");
		System.out.println("\t Enter the First Name of the employee: ");
		this.firstName = sc.next();
		System.out.println("\t Enter the Last Name of the employee: ");
		this.lastName = sc.next();
		System.out.println("\t Enter the Annual Performance Percentage declared by HR: ");
		this.performance = sc.nextInt();
		System.out.println("\t Enter the Monthly Salary of the employee: ");
		double sal = sc.nextDouble();
		if (sal < 0) {
			System.out.println("\t You have not entered valid salary, hence we are considering Your salary as 0 Rupees");
			this.salary = 0;
		} 
		else 
			this.salary= sal; 
	}
	public double appraisal() {
		double app;
	if(performance<50)
		{
		app = 10;
		}
	else {
	app = 50;
	}
	
	return app;
	}
	
	public void displayData() {
		System.out.println("******************************************************************* \n");
		System.out.println(
				"The Stark Industries has always valued its Employees.- Team JARVIS \n \n The data of the entered is as below: \n");
		System.out.println("\t The Name of the employee: " +firstName+ " " +lastName);
		System.out.println("\t Per Month Salary of the employee is: " +salary);
		System.out.println("\t The Annual CTC of the employee is: " +(salary * 12));
		double app1 = appraisal();
		double app2 = (salary * 12 * (1 +(app1 / 100)));
		System.out.println("\n \t The Annual Appraisal Percentage is: " +app1);
		System.out.println("\t The Employee's new Annual CTC is: Drumrolls please!!" +app2);
		System.out.println("\t Thank You for visiting Stark Industries - Team JARVIS \n");
		System.out.println("******************************************************************* \n");

	}


}
