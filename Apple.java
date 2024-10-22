package com.app.fruits;

public class Apple extends Fruit{

	public Apple(String color, double weigth, String name, boolean isFresh) {
		super(color, weigth, name, isFresh);
	}

	public Apple() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String taste() {
		return "sweet n sour" ;
	}

	@Override
	public String toString() {
		return "Apple [color=" + color + ", weigth=" + weigth + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
}
