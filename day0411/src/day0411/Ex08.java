package day0411;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		int menu = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("�޴� ����(1~3) : ");
			menu = sc.nextInt();
			
			if (menu==0) {
				System.out.println("����");
				break;
			} else if (menu>3 || menu<1) {
				System.out.println("�߸� ����");
				continue;
			}
			System.out.println(menu+"�� ����");
		}
		
	}

}
