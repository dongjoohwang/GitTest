package day0412;

import java.util.Scanner;

public class Ex03 {

//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("�� ���� ����Ͻðڽ��ϱ�? : ");
//		int input = sc.nextInt();
////		int i = 100;
//		
//		dan(input);
//		System.out.println("����");
//	}
//
//	public static void dan(int n) {
//		
//		int i = 0;
//		System.out.println(n+"�� ���");
//		
//		for (i = 1; i <= 9; i++) {
//			System.out.println(n + " x " + i + " = " +  n*i);
//		}
//		System.out.println(i);
//	}
	
	// 1. ��, ���(x)
//	public static void main(String[] args) {
//		
//		dan();
//	}
//	
//	public static void dan() {
//		int n = 3;
//		
//		System.out.println(n+"�� ���");
//		for (int i = 0; i <= 9; i++) {
//			System.out.println(n*i);
//		}
//	}
	
	// 2. ��(o), ���(x)
//	public static void main(String[] args) {
//		int in = 3;
//		dan(in);
//	}
//	
//	public static void dan(int n) {
//		System.out.println(n+"�� ���");
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(n*i);
//		}
//	}
//	
	
	// 3. ��(x), ���(o)
	
	// 4. ��, ���(o)
//	public static void main(String[] args) {
//		int in = 3;
//		boolean flag = dan(in);
//		
//		if (flag==true) {
//			System.out.println("���");
//		} else {
//			System.out.println("����");
//		}
//	}
//	
//	public static boolean dan(int n) {
//		
//		boolean flag = true;
//		
//		System.out.println(n+"�� ���");
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















