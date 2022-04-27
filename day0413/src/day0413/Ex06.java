package day0413;

import java.util.Arrays;

public class Ex06 {

	public static void main(String[] args) {
		
		double[] a1 = new double[10];
		
		for (int i = 0; i < a1.length; i++) {

			a1[i] = (double) Math.round((Math.random() * 10) + 1) / 100.0;

		}
		
		System.out.println(Arrays.toString(a1));

		double[] tmp = new double[a1.length*2];
		
		for (int i = 0; i < a1.length; i++) {
			tmp[i] = (double) Math.round((Math.random() * 10) + 1) / 100.0;
		}
		System.out.println(Arrays.toString(tmp));
//		
//		double[] a1 = new double[10];
//		
//		for (int i = 0; i < a1.length; i++) {
//			a1[i] = (Math.random());
//			
//		}
//		
//		for (int i = 0; i < a1.length; i++) {
//			System.out.printf("%.2f\n",a1[i]);
//		}
//		
//		double[] tmp = new double[a1.length * 2];
//		
//		for (int i = 0; i < a1.length; i++) {
//			tmp[i] = a1[i];
//			
//			a1 = tmp;
//			
//		}
//		System.out.println("===============");
//		for (int i = 0; i < tmp.length; i++) {
//			System.out.printf("%.2f\n",a1[i]);
//		}
	}

}















