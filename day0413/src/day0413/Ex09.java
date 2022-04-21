package day0413;

import java.util.Arrays;

public class Ex09 {

	public static void main(String[] args) {

		int[] n1 = new int[5];
		
//		for (int i = 0; i < n1.length; i++) {
//			n1[i] = (int) ((Math.random()*99)+1);
//		}
//		System.out.println(Arrays.toString(n1));
//		
		int max = 0;
		int min = 100;
		for (int i = 0; i < n1.length; i++) {
			n1[i] = (int) ((Math.random()*99)+1);
			
			
			if (n1[i]>max) {
				max = n1[i];		
			}
			if (n1[i]<min) {
				min = n1[i];
			}
		}
		System.out.println(Arrays.toString(n1));
		System.out.println(max);
		System.out.println(min);
		
//		int min = n1[0];
//		for (int i = 0; i < n1.length; i++) {
////			n1[i] = (int) ((Math.random()*99)+1);
//			if (n1[i]<min) {
//				min = n1[i];
//			}
//		}
//		System.out.println(Arrays.toString(n1));
//		System.out.println(min);
	}

}





