package day0519;

import java.io.*;
import java.util.*;

public class Ex11_14 {

	static ArrayList record = new ArrayList(); // 성적데이터를 저장할 공간
	static Scanner s = new Scanner(System.in);
	
	public static void main(String[] args) {
		while (true) {
			switch (displayMenu()) {
			case 1:
				inputRecord();
				break;
			case 2:
				displayRecord();
				break;
			case 3:
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}
	}
	
	static int displayMenu() {
		System.out.println("성적 관리 프로그램");
		System.out.println();
		System.out.println("1. 성적 입력");
		System.out.println("2. 성적 보기");
		System.out.println("3. 프로그램 종료");
		
		System.out.println("메뉴 선택(1~3)");
		
		int menu = 0;
				
		try {
			menu = s.nextInt();
			if (menu>1 || menu<3) {
				throw new Exception();
			}
		} catch (Exception e) {
			System.out.println("메뉴를 다시 입력해주세요.");
		}
		return menu;
	}
	
	static void inputRecord() {
		System.out.println("1. 학생성적 입력하기"); 
		System.out.println("이름 반 번호 국어성적 영어성적 수학성적 의 순서로 공백없이 입력하세요"); 
		System.out.println("입력을 마치려면 q를 입력하세요. 메인화면으로 돌아갑니다"); 
		
		while (true) {
			System.out.println(">>");
			
			try {
				
			} catch (Exception e) {
				System.out.println("입력오류입니다. 이름 반 번호 국어성적 영어성적 수학성적 순서로 입력하세요.");
			}
		}
	}
	static void displayRecord() {
		int kortotal = 0;
		int engtotal = 0;
		int mathtotal = 0;
		int total = 0;
		
		int length = record.size();
		
		
	}

}

class Student implements Comparable {

	String name; int ban; int no;
	int kor; int eng; int math; int total; 
	int schoolrank; int classrank;
	
	Student(String name,
	int kor, int eng, int math, int total, 
	int schoolrank, int classrank) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.schoolrank = schoolrank;
		this.classrank = classrank;
	}
	
	int getTotal() {
		return total;
	}
	
	float getAverage() {
		return (int)(getTotal() / 3.0);
	}
	
	@Override
	public int compareTo(Object o) {
		if (o instanceof Student) {
			Student tmp = (Student)o;
			
			return tmp.total - this.total;
		} else {
			return -1;
		}
		
	}	
	
	@Override
	public String toString() {
		return name + " , " + ban + " , " + no + " , "
				+ kor + " , " + eng + " , " + math + " , "
				+ getTotal() + " , " + getAverage()
				+ " , " + schoolrank + " , " + classrank;
	}
}

























