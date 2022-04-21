package day0413;

import java.util.Random;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] numbers = {3, 5, 2, 10, 39};
//		
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("변경할 index와 값을 입력하세요:");
//		int id = sc.nextInt();
//		int val = sc.nextInt();
//		numbers[id] = val;
//		
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.print(numbers[i] + " ");
//		}
//		System.out.println();
		
//		System.out.println("==================");
//		char[] scores = {'X', 'O', 'O', 'X', 'X', 'O', 'O', 'O', 'O', 'X'};
//		int score = 0;
//		int c = 0;
//		for (int i = 0; i < scores.length; i++) {
//			if (scores[i]=='O') {
//				c++;
//				score = 10*c;
//			}
//		}
//		System.out.println(score);
//		System.out.println("==================");
//		
//		int[] works = {3, 5, 5, 3, 5, 3, 5};
//		int pay=0;
//		for (int i = 0; i < works.length; i++) {
//			if (i>4) {
//				pay += works[i]*9500;
//			} else {
//				pay += works[i]*8500;
//			}
//		}
//		System.out.println(pay);
//		
//		int[] num = new int[5];
//		int id=0;
//		while (id<5) {
//			int n = sc.nextInt();
//			if (n%2==0) {
//				num[id] = n;
//				id++;
//			}
//		}
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
		
//		int[] num = {3, 5, 2, 10, 39};
//		int i1 = sc.nextInt();
//		int i2 = sc.nextInt();
//		int temp = num[i1];
//		num[i1] = num[i2];
//		num[i2] = temp;
//		
//		for (int i = 0; i < num.length; i++) {
//			System.out.print(num[i] + " ");
//		}
		
		int[] num2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		Random rand = new Random();
		
		for (int i = 0; i < 100; i++) {
		    int randIndex = rand.nextInt(10); 
		    
		    int temp2 = num2[0];
		    num2[0] = num2[randIndex];
		    num2[randIndex] = temp2;
		}
		for (int i = 0; i < num2.length; i++) {
			System.out.println(i+1 + " : " + num2[i] + " ");
		}
		System.out.println();
		System.out.println("===================");
		
		int[] num3 = {5, 3, 2, 1, 2, 4, 3, 3, 2, 1};
		int[] fr = new int[6];
		
		for (int i = 0; i < num3.length; i++) {
			fr[num3[i]] += 1;
		}
		for (int i = 0; i < fr.length; i++) {
			System.out.print(i + " : " + fr[i]+"개\n");
		}
		
	}

}













