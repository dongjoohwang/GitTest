package day0413;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {	// jvm 호출
				
//	int num1 = sc.nextInt();
//	int num2 = sc.nextInt();	
//		
//	int rs = add(num1,num2);		// 함수 호출

//	System.out.println(rs);
		
		double rs = add();
		System.out.println(rs);
	}
	
	
//	public static void add(int num1, int num2) {
////		Scanner sc = new Scanner(System.in);
////
////		int num1 = sc.nextInt();
////		int num2 = sc.nextInt();
////		
//		System.out.println(num1+num2);
//	}
	
//	public static int add(int num1, int num2) {
//		return num1+num2;
//		
//	}
	
	public static double add() {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		return (num1+num2)/2.0;
			
	}

}












