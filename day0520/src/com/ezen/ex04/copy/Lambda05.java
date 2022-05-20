package com.ezen.ex04.copy;

import java.util.Random;

@FunctionalInterface	// 함수형 인터페이스 ..... 추상메소드 1개만 존재
interface Cenerator {
	int rand();
}

class Abc implements Cenerator {

	@Override
	public int rand() {
		return 0;
	}
	
}

// ctrl + shift + {
public class Lambda05 {

	public static void main(String[] args) {
		// 람다
		
		Cenerator gen = ()-> {
			Random rd = new Random();
			return rd.nextInt(50);
		};
		int num = gen.rand();
		System.out.println(num);
	}
}















