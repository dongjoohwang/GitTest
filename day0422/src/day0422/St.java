package day0422;

import java.util.Scanner;

/*
 * 5명 학생 / 2개 과목(영어, 수학)을 입력받아서 과목별 평균을 구하는 프로그램
 */

public class St {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num = 5;
		
		int[][] sub = new int[num][2];
		int[] totalst = new int[num];
		int[] totalsub = new int[2];
		
		System.out.println(num+"명 영어, 수학 점수 입력");
		
		for (int i = 0; i < num; i++) {
			System.out.print(i+1+"번 영어 점수 : ");
			sub[i][0] = sc.nextInt();
			System.out.print(i+1+"번 수학 점수 : ");
			sub[i][1] = sc.nextInt();
			
			totalst[i] = sub[i][0] + sub[i][1];
			totalsub[0] += sub[i][0];
			totalsub[1] += sub[i][1];
		}
		System.out.println("no.    영어    수학   평균");
		for (int i = 0; i < num; i++) 
			System.out.printf("%2d %6d %6d %6.1f\n", i+1 ,sub[i][0], 
					sub[i][1], (double)totalst[i]/2);
			
		System.out.printf("평균 %6.1f %6.1f\n", (double)totalsub[0]/num,
							(double)totalsub[1]/num);	
	}

}









