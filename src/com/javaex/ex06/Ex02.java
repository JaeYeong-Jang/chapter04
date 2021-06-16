package com.javaex.ex06;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		
		//Random randnum = new Random();
		
		Set<Integer> iSet = new HashSet<Integer>();
		
		while(iSet.size() < 6) {
			int num = (int)(Math.random()*45)+1;
			System.out.println(num);
			iSet.add(num); // 중복체크
		}
		
		System.out.println("===========================");
		
		for(Integer num : iSet) {
			System.out.print(num + " ");
		}
		
		
		/*
		for(int i = 0; i < 6; i++) {
			int lottonum = randnum.nextInt(45)+1;
			iSet.add(lottonum);
		}
		
		for(Integer num : iSet) {
			System.out.print(num + " ");
		}
		*/
	}

}
