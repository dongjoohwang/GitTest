package day0413;

import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		
//		int[] sc = new int[10];
//		int k = 1;
//		
//		sc[0]=50;
//		sc[1]=60;
//		sc[k+1]=70;
//		sc[3]=80;
//		sc[4]=90;
//
//		int tmp = sc[k+2] + sc[4];
//		
//		for (int i = 0; i < sc.length; i++) {
//			System.out.print(sc[i] + " ");
//		}
//		System.out.println();
//		
//		System.out.println(tmp);	
//		System.out.println(sc[7]);	  java.lang.ArrayIndexOutOfBoundsException
		
//		int[] iArr1 = new int[10];
//		int[] iArr2 = new int[10];
////		int[] iArr3 = new int[] {100,95,80,70,60};
//		int[] iArr3 = {100,95,80,70,60};
//		char[] chArr = {'a','b','c','d'};
//		
//		for (int i = 0; i < iArr1.length; i++) {
//			iArr1[i] = i+1;
//		}
//		for (int i = 0; i < iArr2.length; i++) {
//			iArr2[i] = (int)(Math.random()*10) + 1;
//		}
//		for (int i = 0; i < iArr1.length; i++) {
//			System.out.print(iArr1[i] + ",");
//		}
//		System.out.println();
//		System.out.println(Arrays.toString(iArr2));
//		System.out.println(Arrays.toString(iArr3));
//		System.out.println(Arrays.toString(chArr));
//		System.out.println(iArr3);
//		System.out.println(chArr);
		
		int[] iArr1 = new int[5];
		
		int[] tmp = new int[iArr1.length*2];
		
		for (int i = 0; i < iArr1.length; i++) {
			iArr1[i] = (int)(Math.random() * 10) + 1;
		}
		System.out.println(Arrays.toString(iArr1));
		
		for (int i = 0; i < iArr1.length; i++) {
			tmp[i] = iArr1[i];
			
			iArr1 = tmp;
			
			System.out.println(Arrays.toString(iArr1));
		}
	}

}

















