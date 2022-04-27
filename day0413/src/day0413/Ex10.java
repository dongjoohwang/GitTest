package day0413;

import java.util.Arrays;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n1 = new int[5];
		
		for (int i = 0; i < n1.length; i++) {
			n1[i] = (int) ((Math.random()*99)+1);
		}
		System.out.println(Arrays.toString(n1));
		
		int t = 0;
		for (int i = 0; i < n1.length-1; i++) {
			for (int j = 0; j < n1.length; j++) {
				if (n1[i]<n1[j]) {
					t = n1[i];
					n1[i] = n1[j];
					n1[j] = t;
				}
			}
		}
				
		System.out.println(Arrays.toString(n1));
		
		
	}

}
