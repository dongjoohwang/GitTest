package day0408;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
//		for (int i = 0; i < 6; i++) {
//			int value = (int)(Math.random()*45) + 1;	
//			System.out.println(i + " : " + value);
//		}
		
		// 2단 => 2줄 / 3단 => 3줄
		
//		for(int i=2; i<=9; i++) {	// 행, 줄
//		for (int j=1; j<=i; j++) {	// 열, 칸
//			System.out.println(i + "x" + j + "=" + i*j);	// 줄 변경
//		}
//			System.out.println();
//			
//		}
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 */
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for (int i = 0; i < num; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}









