package day0411;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		/*
		 * ���� ���
		 * 
		 * i=1
		 * i=2
		 * i=3 ¦
		 * i=4
		 * ...
		 * i=97 ¦
		 * i=98 ¦
		 * i=99 ¦¦
		 * i=100
		 */
//		int sum = 0;
//		int i = 1;
//	
//		for (i = 1; i<=10; i++) {
//		
//			if (sum > 100) {
//				break;
//			} if (i%2 == 1) {
//				continue;
//			}
//			sum += i;
//		}
//		System.out.println(i + " , " + sum);
		
		abc : for (int i = 1; i <= 100; i++) {
			
			System.out.printf("i=%d " , i);
			
			int tmp = i;	// tmp(1)
			
			for (;;) {
				
				if (tmp%10%3==0 && tmp%10!=0) 
					System.out.print("¦");
				
				if ((tmp/=10) == 0) 
					continue abc;	
			}
		}
		abc :
			System.out.println("final");
	}

}













