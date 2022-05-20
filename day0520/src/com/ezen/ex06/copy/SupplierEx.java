package com.ezen.ex06.copy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierEx {

	// 							random rand = new random();
	//							return rand.nextint(50);
	public static List<Integer> makeIntList(Supplier<Integer> s, int n) {
		 
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<n;i++)
			list.add(s.get());
		return list;
	}
	public static void main(String[] args) {
		// 입력 x, --> 출력 o >>> get
		Supplier<Integer> spr = () -> {
			Random rd = new Random();
			return rd.nextInt(50);
		};
		
		List<Integer> list = makeIntList(spr, 5);
		System.out.println(list);
		
		list = makeIntList(spr, 15);
		System.out.println(list);
		
		Supplier<Integer> s = () -> (int)(Math.random()*100)+1;
		
		for(int i=0;i<5;i++)
		System.out.print(s.get() + " ");
	}

}










