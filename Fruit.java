package com.app.fruits;

import java.util.Scanner;

public abstract class Fruit {
	String color;
	double weigth;
	String name;
	boolean isFresh;
	public Fruit() {
	}
	public Fruit(String color, double weigth, String name, boolean isFresh) {
		this.color = color;
		this.weigth = weigth;
		this.name = name;
		this.isFresh = isFresh;
	}
	public final String getColor() {
		return color;
	}
	public final void setColor(String color) {
		this.color = color;
	}
	public final double getWeigth() {
		return weigth;
	}
	public final void setWeigth(double weigth) {
		this.weigth = weigth;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final boolean isFresh() {
		return isFresh;
	}
	public final void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}
	abstract public String taste();
	@Override
	abstract public String toString();
	public void accept(Scanner sc) {
		System.out.println("Enter fruit details : ");
		System.out.print("\tColor   :");
		String color=sc.next();
		setColor(color);
		System.out.print("\tWeight  : ");
		double weight=sc.nextDouble();
		setWeigth(weight);
		System.out.print("\tIs Fresh:");
		boolean isFresh=sc.nextBoolean();
		setFresh(isFresh);
		
	}
	}
