package day0412;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("숫자 : ");
			String tmc = sc.nextLine();
			int num = Integer.parseInt(tmc);
			if (num==0) break;
			
			System.out.print("사칙연산 : ");
			String str = sc.nextLine();
			char ch = str.charAt(0);
			
			switch (ch) {
			case '+':
				sum+=num;
				break;
			case '*':
				sum*=num;
				break;
			case '/':
				sum/=num;
				break;
			case '-':
				sum-=num;
				break;
			default:
				System.out.println("잘못된 기호");
				break;
			}
		}
		System.out.println(sum);
	}

}









