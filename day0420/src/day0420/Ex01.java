package day0420;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {


		int m = 2500;
		double rate = 0.0;
		
		Scanner sc = new Scanner(System.in);
		
		int ag = sc.nextInt();
		
		if (ag>=65) {
			m = 0;					// 100%
		} else if (ag>=20) {
//			m = 2500 - 2500*1/2;			// 50%
			rate = 1;
		} else if (ag>=14) {
//			m = 2500 - 2500*1/4;	// 25%
			rate = 0.75;
		} else if (ag>=4) {
//			m = 2500;				// 0%
			rate = 0.5;
		} else if(ag<4) {	
			m = 0;					// 100%
		} else {
			System.out.println("잘못된 입력");
		}
		System.out.println((int)(m*rate)+"원");
		
//		if (ag>=65) {
//			ag=1;
//		} else if (ag>=20) {
//			ag=2;
//		} else if (ag>=14) {
//			ag=3;
//		} else if (ag>=4) {
//			ag=4;
//		} 
//		
//		switch (ag) {
//		case 1:
//			m = 0;
//			break;
//		case 2:
//			rate=1;
//			break;
//		case 3:
//			rate=0.75;
//			break;
//		case 4:
//			rate=0.5;
//			break;
//		case 5:
//			m=0;
//			break;
//		default:
//			System.out.println("잘못된 입력");
//			break;
//		}
//		System.out.println((int)(m*rate)+"원");
	}

}











