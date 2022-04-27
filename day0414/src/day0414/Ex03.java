package day0414;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		name();
		
		Test ts = new Test();
		ts.sum();
		ts.sum2();
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		System.out.println(num);
		sc.nextLine();
		String str = sc.nextLine();
		System.out.println(str);

	}
	
	public static void name() {
		System.out.println("name");
	}

}

class Test {
	void sum() {
		System.out.println("sum");
	}
	void sum2() {
		System.out.println("sum2");
	}
}
