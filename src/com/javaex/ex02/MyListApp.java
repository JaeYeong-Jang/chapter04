package com.javaex.ex02;

public class MyListApp {

	public static void main(String[] args) {
		
		System.out.println("Point 관리 =======================");
		
		MyList pList = new MyList();
		
		Point p01 = new Point(1,1);
		Point p02 = new Point(2,2);
		Point p03 = new Point(3,3);
		
		pList.add(p01);
		pList.add(p02);
		pList.add(p03);
		
		for(int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i));
		}
		
		System.out.println("Circle 관리 =======================");
		MyList cList = new MyList();
		
//		Circle c01 = new Circle();
//		Circle c02 = new Circle();
//		Circle c03 = new Circle();
		
		cList.add(new Circle(5));
		cList.add(new Circle(6));
		cList.add(new Circle(7));
	
		for(int i = 0; i < cList.size(); i++) {
			System.out.println(cList.get(i)); // --> toString 이나 마찬가지
		}
		
	}

}
