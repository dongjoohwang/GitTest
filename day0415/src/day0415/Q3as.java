package day0415;

import java.util.Iterator;
import java.util.Scanner;

public class Q3as {

	public static void main(String[] args) {
//		 for (int i = 0; i < 5; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		 
//		 System.out.println("=============");
		 
//		 for (int i = 0; i < 5; i++) {
//			for (int j = 5; j > i; j--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		 
//		 System.out.println("=============");
		 
		
		 for (int i = 0; i < 5; i++) {
			for (int j = 4; j > 4-i; j--) {
				System.out.print(" ");
			}
			for (int j = 9; j > (i*2); j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		 
		 for (int i = 1; i < 5; i++) {
			for (int j = 0; j < 4-i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (i*2)+1; j++) {
				System.out.print("*");
			}
		System.out.println();
	   }
			 
	   System.out.println("==============");
	   
	   	for (int i = 0; i < 5; i++) {
	   		for (int j = 0; j < 4-i; j++) {
				System.out.print(" ");
			}
	   		for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
	   		System.out.println();
	   	}
	}

}








