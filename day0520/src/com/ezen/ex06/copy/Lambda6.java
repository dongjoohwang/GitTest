package com.ezen.ex06.copy;

import java.util.Arrays;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;
import java.util.function.IntUnaryOperator;

public class Lambda6 {

	public static void main(String[] args) {
		IntSupplier s = () -> (int)(Math.random()*100)+1;
		IntConsumer c = i -> System.out.print(i + ", ");
		IntPredicate p = i -> i%2==0;
		IntUnaryOperator op = i -> i/10*10;
		
		int[] arr = new int[10];
	
		makeRandomlist(s, arr);
		System.out.println(Arrays.toString(arr));
		printEvennum(p, c, arr);
		int[] newArr = doSomething(op, arr);
		System.out.println(Arrays.toString(newArr));
	}

	static void makeRandomlist(IntSupplier s, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.getAsInt();	// get()이 아니라 getAsInt()임에 주의
		}
	}
						//  i -> i%2==0 i -> system.out.print(i+", ")
	static void printEvennum(IntPredicate p, IntConsumer c, int[] arr) {
		System.out.print("[");
		for(int i:arr) {
			if(p.test(i)) {
				c.accept(i);
			}
			
		}
		System.out.println("]");
	}
	//						i -> i/10*10	[78, 1, 62, 95, 17, 30, 36, 4, 40, 57]
	static int[] doSomething(IntUnaryOperator op, int[] arr) {
		int[] newArr = new int[arr.length];
			
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = op.applyAsInt(arr[i]);	// apply가 아님에 주의
		}
		
		return newArr;
			
	}
}

	









