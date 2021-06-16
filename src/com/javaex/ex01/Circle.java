package com.javaex.ex01;

public class Circle {

	//fields
	private int radius;
	
	//constructors
	public Circle() {
		
	}
	
	public Circle(int radius) {
		this.radius = radius;
		
	}
	
	//method g/s
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	//method
	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}
	
}
