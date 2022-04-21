package day0411;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		int n = 0, sum = 0;
		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (cnt++ < 5) {
			n = sc.nextInt();
			
				sum += n;
				
				System.out.println(cnt+"회 정수 입력 : ");
				System.out.println("sum : " + sum);
			
		}

		System.out.println("sum : " + sum);
	}

}
