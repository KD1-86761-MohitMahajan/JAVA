package com.app.fruits;

public class Orange extends Fruit {

	public Orange(String color, double weigth, String name, boolean isFresh) {
		super(color, weigth, name, isFresh);
	}

	public Orange() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sour";
	}

	@Override
	public String toString() {
		return "Orange [color=" + color + ", weigth=" + weigth + ", name=" + name + ", isFresh=" + isFresh + "]";
	}

}

