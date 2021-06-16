package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {
		//Object형의 단점 보완
		//포인트 리스트로 관리 ============== 
		
		MyList<Point> pList = new MyList<Point>(); //Generic문법 
		
		Point p01 = new Point(2,4);
		Point p02 = new Point(5,10);
		Circle c03 = new Circle(100);
		
		pList.add(p01);
		pList.add(p02);
		//pList.add(c03); // --> 오류가 발생해야한다.
		
		for(int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		} // --> Object형이라 PointList에서 Circle 값이 입출력된다.
		
		
		
	}

}
