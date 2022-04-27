package day0422;

import java.util.Scanner;

// 해당 월의 영어 단어를 입력하는 프로그램

public class MonthCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		
		String[] monthString = {
				"January", "Feburary", "March", "April", "May", "June",
				"July", "August", "September", "October", "November", "December"
		};
		
		System.out.println("해당 월의 영어 단어를 입력하세요.");
		System.out.println("첫 글자는 대문자, 그 이후는 소문자로 입력");
		
		int retry=0;
		int last=-1;	// 이전 월
		int ct = 0;
		do {
			int month;
			do {	// 직전 월과 같은 월이면 반복 / 같은 달이 아니면 do~while 벗어남
				month = (int)(Math.random()*12);
			} while(month==last);	// 직전 월과 같은 월일 경우 while문을 벗어나지 않는다.
			last = month;			// 직전 월과 다른 월일 경우 while문을 빠져나온 다음, last값은 month값이 된다.
			
			while (true) {
				System.out.println(month);
				System.out.print((month+1) + "월 : ");
				String qus = sc.nextLine();
				
				if (qus.equals(monthString[month])) break; 	// 정답
				System.out.println("오답입니다.");
			}
			System.out.println(ct +"번째 시도 : " +  "정답입니다. >> 재도전(1) : 종료(0) : ");
			retry = sc.nextInt();
			sc.nextLine();
		} while (retry==1);
		System.out.println("프로그램 종료");
	}

}












