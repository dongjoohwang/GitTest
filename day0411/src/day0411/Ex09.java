package day0411;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		int n = 0, sum = 0;
		int cal = 0;
		
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("연산자 : ");
			cal = sc.nextInt();
			System.out.print("정수 : ");
			n = sc.nextInt();
			if (cal == 1) {
				sum+=n;
				System.out.println("+");
				System.out.println("sum : " + sum);
			} else if (cal == 2) {
				sum*=n;
				System.out.println("*");
				System.out.println("sum : " + sum);
			} else if (cal == 3) {
				sum/=n;
				System.out.println("/");
				System.out.println("sum : " + sum);
			} else if (cal == 4) {
				sum-=n;
				System.out.println("-");
				System.out.println("sum : " + sum);
			} else {
				System.out.println("1~4만 입력해주세요");
			}
		} 
	}

}
