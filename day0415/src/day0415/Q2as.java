package day0415;

import java.util.Scanner;

public class Q2as {

	public static void main(String[] args) {
		// �Է¹޴� ���ڴ� 0~100���̰��� �Է¹޾Ƽ� ���� ū �� ���ϱ�

		Scanner sc = new Scanner(System.in);
		int num, max=0;
		
		String tmp;
		
		System.out.println("���� 5ȸ : ");
		for (int i = 0; i < 5; i++) {
			tmp = sc.nextLine();
			num = Integer.parseInt(tmp);
			
			if (num<0 || num>100) {
				System.out.println("0~100 ���ڰ� �ƴմϴ�.");
				i--;
//				continue; 
			} else {
				if (max<num) {
					max=num;
				}
			}
		}
		
		System.out.println(max);
		
//		Scanner sc = new Scanner(System.in);
//	      int num, max = 0;
//	      int i =0;
//	      String tmp;
//	      
//	      System.out.println("���� 5ȸ �Է�(0~100)");
//	      
//	     while (i<5) {
//			num = sc.nextInt();
//			if (num>0 && num<101) {
//				if (max<num) max=num;
//					i++;			
//			} else {
//				System.out.println("0~100 ���ڰ� �ƴմϴ�.");
//			}
//			
//		}
//	     System.out.println(max);
		
	}

}












