package day0422;

import java.util.Scanner;

/*
 *	3자리 정수 암산 프로그램 
 */

public class LunchMental {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int retry=0;
		System.out.println("암산");
		do {
			int x = (int)(Math.random()*100)+1;
			int y = (int)(Math.random()*100)+1;
			int z = (int)(Math.random()*100)+1;
			
			int num = (int)(Math.random()*4);
			
			int as = 0;
			
			switch (num) {
			case 0:	as = x+y+z;
//				System.out.println(x + " + " + y + " + " + z + " = ");
				break;
			case 1:
				as = x+y-z;				
//				System.out.println(x + " + " + y + " - " + z + " = ");
				break;
			case 2:
				as = x-y+z;								
//				System.out.println(x + " - " + y + " + " + z + " = ");
				break;
			default:				
				as = x-y-z;								
//				System.out.println(x + " - " + y + " - " + z + " = ");
				break;
			}
			System.out.println("num : " + num);
			while (true) {
				System.out.print( x+( (num<2) ? "+" : "-") +
								  y + ( (num%2==0) ? "+" : "-") +
								  z + " = ");
			int an = sc.nextInt();
			if (an==as) break;
			System.out.println("오답");
			} 
			System.out.println("정답");
			System.out.println("재도전(1)/중지(0)");
			retry = sc.nextInt();
			sc.nextLine();
			
		} while (retry==1);
		System.out.println("종료");
		
	}
	
}










