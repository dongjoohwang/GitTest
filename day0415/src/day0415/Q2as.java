package day0415;

import java.util.Scanner;

public class Q2as {

	public static void main(String[] args) {
		// 입력받는 숫자는 0~100사이값만 입력받아서 가장 큰 수 구하기

		Scanner sc = new Scanner(System.in);
		int num, max=0;
		
		String tmp;
		
		System.out.println("정수 5회 : ");
		for (int i = 0; i < 5; i++) {
			tmp = sc.nextLine();
			num = Integer.parseInt(tmp);
			
			if (num<0 || num>100) {
				System.out.println("0~100 숫자가 아닙니다.");
				i--;
//				continue; 
			} else {
				if (max<num) {
					max=num;
				}
			}
		}
		
		System.out.println(max);
		
//		Scanner sc = new Scanner(System.in);
//	      int num, max = 0;
//	      int i =0;
//	      String tmp;
//	      
//	      System.out.println("정수 5회 입력(0~100)");
//	      
//	     while (i<5) {
//			num = sc.nextInt();
//			if (num>0 && num<101) {
//				if (max<num) max=num;
//					i++;			
//			} else {
//				System.out.println("0~100 숫자가 아닙니다.");
//			}
//			
//		}
//	     System.out.println(max);
		
	}

}












