package day0421;

import java.util.Scanner;

public class Ex01 {

	static int n1,n2,n3;	// 정적 변수, 클래스 변수 >> class 안에서 
							// 공용으로 사용
	
	public static void main(String[] args) {
		
		// 세 정수 입력 => 최대값(배열 x)
		
		input();
		int max = cal();
		out(max);
		
		// 입력, 계산, 출력 함수
	}

	static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 3개 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
	}
	
	static int cal() {
		
		int max = n1;
		if (n2>max) {
			if (n2>n3) {
				max = n2;
			} else {
				max = n3;
			}
		} else if (n3>max) {
			max = n3;
		}
		return max;
	}
	
	static void out(int num) {
		System.out.println("max : " + num);
	}
}












