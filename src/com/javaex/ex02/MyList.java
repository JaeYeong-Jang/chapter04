package com.javaex.ex02;

public class MyList {

	//fields 
	private Object[] oArray; // Object형으로 전부 관리
	private int crtPos;
	
	//constructors
	public MyList() {
		this.oArray = new Object[3];
		crtPos = 0;
		
	}
	
	//method g/s
	
	//method
	public void add(Object obj) {
		//배열의 크기 가변 로직 생략
		oArray[crtPos] = obj;
		crtPos += 1;
		
	}
	
	public int size() {
		return crtPos;
	}
	
	public Object get(int index) {
		return oArray[index];
	}
}
