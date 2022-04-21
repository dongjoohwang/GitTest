package day0421;

import java.util.Random;
import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n] ;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(10);
			System.out.print(arr[i] + " ");
			System.out.println();
			for (int j = 0; j < i; j++) {
				if (arr[j]==arr[i]) {
					i--;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}
