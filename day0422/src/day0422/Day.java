package day0422;

import java.util.Random;
import java.util.Scanner;

/*
 * 일 월 화 수 목 토 일 -> 랜덤하게 이 중 하나가 나오면
 * 그에 맞는 소문자로 요일 입력	-> sunday, monday, tuesday...
 */

public class Day {

	public static void main(String[] args) {
		
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		int re=0;
		int last = -1;
		
		String[] day = {"일","월","화","수","목","금","토"};
		String[] eng = {"sunday","monday","tuesday",
				"wednesday","thursday","friday","saturday"};
		
		do {
			int num;
			do {
				num = rd.nextInt(7);
			} while(num==last);
			last=num;
			
			int id = 0;
			for (int i = 0; i < day.length; i++) {
				id = i;
				if (id==num) {
					day[id] = day[num];
					System.out.print(day[num]+"요일을 영어 소문자로 입력하시오. : ");
				}
			
				}
				while (true) {
					String input = sc.next();
					if (input.equals(eng[num])) break;
						System.out.println("오답");
					
				}
				
				System.out.println("정답! / 재도전(1), 종료(0)");
				re = sc.nextInt();
				sc.nextLine();
			}while (re==1);
			System.out.println("종료");
			
	}	

}












