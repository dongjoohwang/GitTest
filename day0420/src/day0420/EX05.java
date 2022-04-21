package day0420;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		Money mm = new Money();
		int rs = mm.main(0);
		
		System.out.println(rs+"원");
	}

}

class Money {
	int main(int m) {
		m = 2500;
		double rate = 0.0;
		Scanner sc = new Scanner(System.in);
		
		int age = sc.nextInt();
		
		if (age>=65) {
			m=0;
		} else if (age>=20) {
			rate=1;
		} else if (age>=14) {
			rate=0.75;
		} else if (age>=4) {
			rate=0.5;
		} else {
			m=0;
		}
		return (int)(m*rate);
	}
}










