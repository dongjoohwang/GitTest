package day0422;

import java.util.Random;

/*
 * 주사위 2개를 던진다.
 * (1,2)
 * (4,5)
 * (6,6)
 * (3,2)
 */

public class DiceGame {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int d1 = 0;
		int d2 = 0;
		
		System.out.println("주사위 두 개 던지기(단, 두 개의 합이 5가 나올 경우 게임 종료)");
		while (true) {
			d1 = rd.nextInt(6)+1;
			d2 = rd.nextInt(6)+1;
			
			System.out.println("("+d1 + "," +d2 +")");
			if (d1+d2==5) {
				System.out.println("주사위 두 개의 합이 5가 나왔으므로 게임을 종료합니다.");
				break;
			}
		}
	}

}










