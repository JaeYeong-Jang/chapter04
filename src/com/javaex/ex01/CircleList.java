package com.javaex.ex01;

import java.util.Arrays;

public class CircleList {
	
	//fields
	private Circle[] cArray;
	private int crtPos;
	
	//constructors
	public CircleList() {
		this.cArray = new Circle[5];
		crtPos = 0;
	}
	
	//method g/s
	public Circle[] getcArray() {
		return cArray;
	}

	public void setcArray(Circle[] cArray) {
		this.cArray = cArray;
	}

	//method
	public void add(Circle circle) {
		cArray[crtPos] = circle;
		crtPos += 1;
		
	}
	
	public int size() {
		return crtPos;
	}
	
	public Circle get(int index) {
		return cArray[index];
	}

	@Override
	public String toString() {
		return "CircleList [cArray=" + Arrays.toString(cArray) + ", crtPos=" + crtPos + "]";
	}
	
	
}
