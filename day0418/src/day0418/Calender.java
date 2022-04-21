package day0418;

import java.util.Scanner;

//윤년은 해당 연도를 4로 나눈 값이 0인 것을 의미한다. 
//그중 100으로 나눈 값이 0인 것은 윤년에서 제외하나, 
//400으로 나눈 값이 0인 것은 윤년으로 포함된다. 
//그 외의 나머지 연도는 평년이다.

public class Calender {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int y = sc.nextInt();
		int m = sc.nextInt();
		
		System.out.println(y+"년도 " + m+"월");
//		
		String[] day = {"일", "월", "화", "수", "목", "금", "토"};
		
		for (int i = 0; i < day.length; i++) {
			System.out.print(day[i] + "\t");
		}
		System.out.println();
		
	}

}
