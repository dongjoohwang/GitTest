package day0421;

import java.util.Random;

public class Ex06 {

	public static void main(String[] args) {
		// int[] arr = new int[10] ; 난수(0~9)를 배열 입력
		// 단, 붙어있는 아이는 중복되면 안된다. 	0 5 7 9 8
		
		Random rd = new Random();
		int[] arr = new int[10] ;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(10);
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
