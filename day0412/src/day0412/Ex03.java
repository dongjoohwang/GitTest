package day0412;

import java.util.Scanner;

public class Ex03 {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("몇 단을 출력하시겠습니까? : ");
//		int input = sc.nextInt();
////		int i = 100;
//		
//		dan(input);
//		System.out.println("종료");
//	}
//
//	public static void dan(int n) {
//		
//		int i = 0;
//		System.out.println(n+"단 출력");
//		
//		for (i = 1; i <= 9; i++) {
//			System.out.println(n + " x " + i + " = " +  n*i);
//		}
//		System.out.println(i);
//	}
	
	// 1. 입, 출력(x)
//	public static void main(String[] args) {
//		
//		dan();
//	}
//	
//	public static void dan() {
//		int n = 3;
//		
//		System.out.println(n+"단 출력");
//		for (int i = 0; i <= 9; i++) {
//			System.out.println(n*i);
//		}
//	}
	
	// 2. 입(o), 출력(x)
//	public static void main(String[] args) {
//		int in = 3;
//		dan(in);
//	}
//	
//	public static void dan(int n) {
//		System.out.println(n+"단 출력");
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(n*i);
//		}
//	}
//	
	
	// 3. 입(x), 출력(o)
	
	// 4. 입, 출력(o)
//	public static void main(String[] args) {
//		int in = 3;
//		boolean flag = dan(in);
//		
//		if (flag==true) {
//			System.out.println("출력");
//		} else {
//			System.out.println("실패");
//		}
//	}
//	
//	public static boolean dan(int n) {
//		
//		boolean flag = true;
//		
//		System.out.println(n+"단 출력");
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(n*i);
//			
//		}
//		return flag;
//	}
//	
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		
		System.out.println("before : " + x + " , " + y);
		
		swap(x, y);
		
		System.out.println("after : " + x + " , " + y);
		
	}	
	public static void swap(int x, int y) {
		
		int temp = x;
		x = y;
		y = temp;

		System.out.println(x+ " , " + y);
	}

}















