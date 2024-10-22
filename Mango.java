package com.app.fruits;

public class Mango extends Fruit {

	public Mango(String color, double weigth, String name, boolean isFresh) {
		super(color, weigth, name, isFresh);
	}

	public Mango() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sweet";
	}

	@Override
	public String toString() {
		return "Mango [color=" + color + ", weigth=" + weigth + ", name=" + name + ", isFresh=" + isFresh + "]";
	}

}
