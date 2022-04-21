package day0415;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		int max = num[0];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*99)+1;
			System.out.print(num[i] + " ");
			if (max<num[i]) {
				max = num[i];
			}
		}
		System.out.println();
		System.out.println(max);
	}

}











