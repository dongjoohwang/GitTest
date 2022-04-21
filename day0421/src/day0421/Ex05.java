package day0421;

import java.util.Scanner;

public class Ex05 {
	
	static int[][] mdays = {
			
			{31,28,31,30,31,30,31,31,30,31,30,31},	// 평년
			{31,29,31,30,31,30,31,31,30,31,30,31}	// 윤년
	};

	static int isLeap(int year) {	// 평년, 윤년 계산
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)? 1:0;
	}
	
	// 경과 일 수를 구함
	static int dayOfYear(int year, int month, int day) {
		int days=day;
		for (int i = 1; i < month; i++) {
			days += mdays[isLeap(year)][i-1];
		}
		return days;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int re = 0;
		
		System.out.println("그 해 경과 일수를 구한다.");
		
		do {
			System.out.print("년도 : ");
			int y = sc.nextInt();
			System.out.print("월 : ");
			int m = sc.nextInt();
			System.out.print("일 : ");
			int d = sc.nextInt();
			System.out.printf("경과일수 : %d일", (dayOfYear(y, m, d)));
			System.out.println();
			System.out.println("반복(yes:1)(no:0)");
			re = sc.nextInt();
		} while (re==1);
		
	}

}














