package day0421;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex06as {

	public static void main(String[] args) {

		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		arr[0] = rd.nextInt(10);
		
		for (int i = 1; i < arr.length; i++) {
//			do {
//				arr[i] = rd.nextInt(10);
//			} while (arr[i] == arr[i-1]);
//		}
			
			int j;
			do {
				j=0;
				arr[i] = rd.nextInt(10);
				
				for (j = 0; j < i; j++) {
					if (arr[j]==arr[i]) {
						break;
					}
				} 
					
				} while(j<i);
			
			}
		
		System.out.println(Arrays.toString(arr));
				
	}

}
