package day0421;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		// 세 정수를 큰 순서대로 출력(오름차순)
		
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		int max=0, min = 0, md = 0;
		
		System.out.println(n1 + "," + n2 + "," + n3);
		
		int temp=0;
		if (n2>n1) {
			if (n2>n3) {
				max=n2;
				if (n1>n3) {
					md = n1;
					min = n3;
				} else {
					md = n3;
					md = n1;
				}
			}
			else {
				max = n3;
				md = n2;
				min = n1;
			}
			
		} else if (n3>n1) {
			max = n3;
			md = n1;
			min = n2;
		} else {
			if (n2>n3) {
				max = n1;
				md = n2;
				min = n3;
			} else {
				max = n1;
				md = n3;
				min = n2;
			}
		}
		System.out.println(max + "," + md + "," + min);
	}

}











