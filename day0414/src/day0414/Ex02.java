package day0414;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		
		int sum = 0;
		double ag = 0;
		
		int n[] = new int[10];
		
		for (int i = 0; i < n.length; i++) {
			n[i] = (int)(Math.random()*99)+1;
		}
		System.out.println(Arrays.toString(n));

		for (int i = 0; i < n.length; i++) {
			sum += n[i];
			ag = (double)sum/n.length;
		}
		System.out.println(sum);
		System.out.println(ag);
	}

}
