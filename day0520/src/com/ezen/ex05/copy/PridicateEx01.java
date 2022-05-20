package com.ezen.ex05.copy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PridicateEx01 {

						// n -> n%2 == 0		1,5,7,8,10,11,12
	public static int sum(Predicate<Integer> p, List<Integer> list) {
		
		int sum=0;
		for(int n:list)
		if (p.test(n)) {
			sum += n;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,5,7,8,10,11,12);
		
		int result;
		result = sum(n -> n%2==0, list);
		System.out.println("짝수 합 : " + result);
		
		result = sum(n -> n%2==1, list);
		System.out.println("홀수 합 : " + result);
		
//		Predicate<Integer> p = n -> n%2==0;
		
		Predicate<Integer> p = i -> i%2==0;
		
		System.out.println(p.test(50));
		System.out.println(p.test(101));
	}

}











