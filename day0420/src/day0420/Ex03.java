package day0420;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		System.out.println(input(0));

	}
	
	static int input(int age) {
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		return age;
	}
	
	static void feeCalc() {
		int money = 2500;
		double rate = 0.0;
		if (input(0)>=65) {
			rate=0.0;
		} else if (input(0)>=20) {
			rate=1;
		} else if (input(0)>=14) {
			rate=0.75;
		} else if (input(0)>=4) {
			rate=0.5;
		} else {
			rate=0.0;
		}
		money = (int)(money*rate);
		System.out.println(money);
		
	}
	
	
	
}






