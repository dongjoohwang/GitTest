package day0421;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		// 숫자만 입력하고, 2자리 정수를 입력하기 전까지 무한 반복(10~99)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두 자리 정수를 입력하세요");
		
//		while (true) {
//			int n = sc.nextInt();
//			int t = n/10;
//			if (t>=1 && t<=9) {
//				System.out.println("두자리 정수 입력 : " + n);
//				System.out.println("반복문 종료");
//				break;
//			} else {
//				System.out.println("두 자리 정수~");
//			}
//		}
		
		int num = 0;
		do {
			System.out.print("입력 >> ");
			num = sc.nextInt();
		} while (num<10 || num>99);
		System.out.println(num);
	}
}
