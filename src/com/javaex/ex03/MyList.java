package com.javaex.ex03;

public class MyList<T> {

	//fields 
	private T[] oArray; // Object형으로 전부 관리 --> Generic문법 사용
	private int crtPos;
	
	//constructors
	public MyList() {
		this.oArray = (T[])new Object[3];
		crtPos = 0;
		
	}
	
	//method g/s
	
	//method
	public void add(T obj) {
		//배열의 크기 가변 로직 생략
		oArray[crtPos] = obj;
		crtPos += 1;
		
	}
	
	public int size() {
		return crtPos;
	}
	
	public T get(int index) {
		return oArray[index];
	}
	
	
}
