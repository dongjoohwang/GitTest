package day0415;

public class Q1_as {

	public static void main(String[] args) {
		
		int fee=1500;
		double rate=0;
		int age = (int)(Math.random()*120)+1;

		if (age>=65) {
			rate=0.0;
		}
		else if (age>=20) {
			rate=1.0;
		}
		else if (age>=14) {
			rate=0.75;
		}
		else if (age>=4) {
			rate=0.5;
		} else {
			rate=0.0;
		}
		System.out.println(age);
		System.out.println((int)(fee*rate));
	}

}
