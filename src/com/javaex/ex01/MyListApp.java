package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {
		/*
		PointList pList = new PointList();
		
		Point p01 = new Point(2,2);
		Point p02 = new Point(2,3);
		Point p03 = new Point(2,4);
		
		
		pList.add(p01); // 배열1개
		pList.add(p02);	// 배열2개
		pList.add(p03); // 배열3개 
		
		System.out.println(pList.size()); // --> 3
		System.out.println(pList.get(1)); // --> Point [x=2, y=3]
		
		pList.remove(1); // --> [1]데이터 삭제 (배열3개 --> 배열2개)
		
		Point p04 = new Point(100,100);
		pList.add(p04); // 배열3개
		
		// 구상 --> add(), size(), get(), remove() 등등 메소드를 선언해야함
		
		*/
		
		
		
		
	
		/*
		Point p01 = new Point(2,2);
		Point p02 = new Point(2,3);
		Point p03 = new Point(2,4);
		
		Point[] pArray = new Point[3]; //배열이 추가가 되면 문제가 생긴다. --> (갯수를 정해놓아야 해서 문제)
		
		pArray[0] = p01;
		pArray[1] = p02;
		pArray[2] = p03;
		
		for(int i = 0; i < pArray.length; i++) {
			System.out.println(pArray[i]);
		}
		*/
		//원 관리=====================
		CircleList cList = new CircleList();
		
		Circle c01 = new Circle(3);
		Circle c02 = new Circle(4);
		Circle c03 = new Circle(5);
		Circle c04 = new Circle(6);
		Circle c05 = new Circle(7);
		
		cList.add(c01);
		cList.add(c02);
		cList.add(c03);
		cList.add(c04);
		cList.add(c05);
		
		System.out.println(cList);
		
		System.out.println(cList.size());
		
		System.out.println(cList.get(1).toString());
		System.out.println(cList.get(1));
		System.out.println(cList.get(1).getRadius());
		System.out.println("===============================");
		
		
		for(int i = 0; i < cList.size(); i++) {
			
		}
		
		
	}
		 
}
