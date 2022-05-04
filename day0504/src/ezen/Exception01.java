package ezen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
	
		int sum=0;
		int[] arr = new int[3];
		int num = 0;
		int a = 0;
		
		if (num!=0) {
			a = 10/num;
		}
		try {
		num = sc.nextInt();
		
		arr[4] = 10;
		// 처리 세분화 : 어떤 오류가 생겼는지 자세하게 알아야 할 때
		
//		} catch (ArithmeticException e) {			// num : 0 => 예외 처리
//			e.printStackTrace();					
//		} catch (InputMismatchException e1) {		// num에 문자 입력 => 예외 처리
//			e1.printStackTrace();
//		}		
		
		// Exception : 간단한 오류 처리
		
		} catch (Exception e) {
			e.printStackTrace();	
		} 
		
		for (int i = 0; i <= 100; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}

}
































