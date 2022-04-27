package day0414;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char lo = 'a';	//97
		char up = 'A';	// 65
		
		System.out.println((char)(lo-32));
		System.out.println((char)(up+32));
		
		float pi = 3.141592f;
		float shortpi = (int)(pi*1000 + 0.5)/1.0f;
		
//		System.out.println((int)Math.ceil(shortpi*1000)/1);
	
		System.out.println((int)shortpi);
		
//		String s1 = "java";
//		String s2 = "java";
//		System.out.println(s1==s2);
//		
//		String s3 = new String("java");
//		String s4 = new String("java");
//		System.out.println(s3 == s4);
		
		String s3 = new String("java");
		String s4 = sc.nextLine();
		
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
		int i = 10;
		System.out.println(i <<= 3);  // 비트연산자(왼쪽으로 이동 => 크기 증가)
		
		// 00001010 => 01010000
	}

}












