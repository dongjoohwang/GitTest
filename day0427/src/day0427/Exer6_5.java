package day0427;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Exer6_5 {

	public static void main(String[] args) {
		
		Student2 s2 = new Student2("손",1,10,90,100,60);	// 생성자 호출  >>  디폴트 생성자
		System.out.println(s2.getName());
		System.out.println(s2.getTotal());
		System.out.println("========================");
		
		Student2 s3 = new Student2("이",2,9,90,80,70);	// 생성자 호출  >>  디폴트 생성자
		System.out.println(s3.getName());
		System.out.println(s3.getTotal());
		System.out.println("========================");
		
		Student2 s4 = new Student2("권",2,9);	// 생성자 호출  >>  디폴트 생성자
		System.out.println(s4.getName());
		System.out.println(s4.getTotal());
		
	}

}

// private < default < protected < public

@Getter		// 어노테이션
@Setter
@ToString
class Student2 {
	// 변수>> 인스턴스, 클래스, 지역
	
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	// 함수 오버로딩
	public Student2(String name, int ban, int no, int kor, int eng, int math) {
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public char[] getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Student2(String name, int ban, int no) {
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
	
	int getTotal() {
		int sum = kor+eng+math;
		return sum;
	}

	double getAg() {
		return getTotal()/3.0;
	}

}















