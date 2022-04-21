package day0421;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		// 세 정수 입력 => 최대값(배열 x)
		
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		System.out.println("정수 3개 : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		max = n1;
		
		if (n2>max) {
			if (n2>n3) {
				max=n2;
			} else {
				max=n3;
			}
		}
		System.out.println(max);
		System.out.println("------------------");
		
		
	}

}
