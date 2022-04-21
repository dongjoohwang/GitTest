package day0411;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, sum = 0;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		while (num!=0) {
			sum += num%10;
//			System.out.println("sum : " + sum + " , num : " + num);
//			
			num /= 10;
		}
		System.out.println(sum);
	}

}
