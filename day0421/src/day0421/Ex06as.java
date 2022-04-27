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
			
		for (int i = 0; i < arr.length; i++) {		// while문이 for문 안에 들어있음 
													// while문에서 아웃될 경우 for(i)문으로 돌아감
//			do {
//				arr[i] = rd.nextInt(10);
//			} while (arr[i] == arr[i-1]);
//		}
			
			int j;
			do {
				j=0;
				arr[i] = rd.nextInt(10);
				System.out.println(arr[i]);
				for (j = 0; j < i; j++) {
					if (arr[j]==arr[i]) {
						break;
					}
				} 
					
				} while(j<i);		// 계속 do문으로 돌아가다가 i와 j의 인덱스 값이 모두 최종값이 될 경우 do를 거쳐서 for문으로 돌아감
			
			}
		
		System.out.println(Arrays.toString(arr));
				
	}

}
