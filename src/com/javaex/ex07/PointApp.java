package com.javaex.ex07;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		
		Set<Point> pSet = new HashSet<Point>();
		
		Point p01 = new Point(2,4);
		Point p02 = new Point(3,6);
		Point p03 = new Point(4,8);

		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
		/*
		for(Point p : pSet) {
			System.out.println(p.toString());
		}
		*/
		
		System.out.println(pSet.toString());
		
		//중복체크 재정의 필요
		Point p04 = new Point(3,6);
		pSet.add(p04);
		System.out.println("====");
		System.out.println(pSet.toString());
		System.out.println("====");
		
		
		
		//Point 비교
		System.out.println(p02.equals(p04));
		System.out.println(p02 == p04); //주소값 비교
		
		System.out.println(p01.equals(p04));
		System.out.println(p01 == p04); // 변수 안의 값 비교 (주소)
		
		//hashcode 중복 되지 않는 숫자
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println(p03.hashCode());
		System.out.println(p04.hashCode());
		
		
		
	}

}
