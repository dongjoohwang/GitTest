package com.ezen.util;
import java.util.Scanner;
public class BuildTest {
	int n1;
	int n2;
	String name;
	Scanner sc = new Scanner(System.in);

	public BuildTest() {
		this(0,0);
	}
	public BuildTest(int x, int y) {
		n1 = x;
		n2 = y;
	}
	int add() {
		return n1+n2;
	}
	int sub() {
		return n1-n2;
	}
	int mul() {
		return n1*n2;
	}
	double div() {
		return n1/(double)n2;
	}
	public void getInfo() {
		System.out.print("수험생 이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.println("이름 : " + name);
		System.out.printf("두 정수 %d, %d\n", n1, n2);
		System.out.printf("더하기 : %d\n", add());
		System.out.printf("빼기 : %d\n", sub());
		System.out.printf("곱하기 : %d\n", mul());
		System.out.printf("나누기 : %.2f\n", div());
	}
}
