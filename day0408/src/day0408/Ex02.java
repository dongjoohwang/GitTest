package day0408;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
//		for (int i = 0; i < 6; i++) {
//			int value = (int)(Math.random()*45) + 1;	
//			System.out.println(i + " : " + value);
//		}
		
		// 2�� => 2�� / 3�� => 3��
		
//		for(int i=2; i<=9; i++) {	// ��, ��
//		for (int j=1; j<=i; j++) {	// ��, ĭ
//			System.out.println(i + "x" + j + "=" + i*j);	// �� ����
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









