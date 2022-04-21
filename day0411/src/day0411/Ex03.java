package day0411;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	
		int sum = 0, num = 0;
		
		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		
		while (flag) {
			
			num = sc.nextInt();
			
			if (num!=0) {
				sum += num;
			} else {
				flag = false;
			}
		}
		System.out.println(sum);
	}

}
