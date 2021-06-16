package com.javaex.ex05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List; // --> 인터페이스

import com.javaex.ex04.Circle;
import com.javaex.ex04.Point;

public class PointApp {

	public static void main(String[] args) {
		
		//List<Point> pList = new ArrayList<Point>();
		List<Point> pList = new LinkedList<Point>();
		
		Point p01 = new Point(2,2);
		Point p02 = new Point(3,3);
		Point p03 = new Point(4,4);
		Point p04 = new Point(5,5);
		
		pList.add(p01);
		
		System.out.println(pList.size()); // --> pList의 갯수
		
		pList.add(p02);
		System.out.println(pList.size());
		
		pList.add(p03);
		
		Point p = pList.get(1);
		
		System.out.println(p.getX());
		System.out.println(p.getY());
		System.out.println(p); // --> println은 .toString 생략 가능
		System.out.println("===========================");
		
		for(int i = 0; i < pList.size(); i++) {
			System.out.println("x : " + pList.get(i).getX());
		}
		System.out.println("===========================");
		System.out.println(pList.toString());
		
		//p04를 --> [1] add
		pList.add(1, p04); // --> 배열의 원하는칸에 요소 넣기
		System.out.println(pList);
		
		//[1]을 삭제
		pList.remove(1);
		System.out.println(pList);
		
		System.out.println("===========================");
		
		//향상된 for문 (무조건 처음 ---> 끝)
		for(Point pp : pList) {
			//System.out.println("x : " + pp.getX());
			System.out.println(pp);
		}
		
		//pList에 원 추가
		Circle c01 = new Circle(100);
		
		//pList.add(c01); --> 원은 추가할 수 없다.
		
		
		
	}

}
