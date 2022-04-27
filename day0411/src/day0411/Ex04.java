package day0411;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		int n = 0;
		int as = (int)(Math.random()*100) + 1;

		Scanner sc = new Scanner(System.in);
		
		do {
			n = sc.nextInt();
			if (n>as) {
				System.out.println("down");
			} else if (n<as) {
				System.out.println("up");
			}
		} while (n!=as);
		
		System.out.println("bingo");
	}

}
