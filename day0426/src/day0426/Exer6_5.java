package day0426;

public class Exer6_5 {

	public static void main(String[] args) {
		
		Student2 s = new Student2();
		s.name = "홍길동";
		s.ban = 10;
		
		System.out.println(s.name);
		System.out.println(s.ban);
		System.out.println(s.math);
		s.getAg();
		
		System.out.println("===================");
		Student2 s2 = new Student2();
		s2.name = "이순신";
		s2.kor = 90;
		s2.eng = 80;
		s2.math = 90;
		System.out.println(s2.name);
		System.out.println(s2.kor);
		System.out.println(s2.eng);
		System.out.println(s2.math);
		System.out.println("총점 : " + s2.getTotal());
		System.out.println("평균 : " + s2.getAg());
		
		System.out.println("===================");
		Student2 s3 = new Student2();
		s3 = s;
		System.out.println(s3.name);
		System.out.println(s3.ban);
		System.out.println(s3.math);
		s.getAg();
	}

}

// private < default < protected < public

class Student2 {
	// 변수>> 인스턴스, 클래스, 지역
	
	private String name;
	private int ban;
	private int no;
	private int kor;
	private int eng;
	private int math;
	
	// 함수(메소드)>> 인스턴스, 클래스
	
	int getTotal() {
		int sum = kor+eng+math;
		return sum;
	}
	
	double getAg() {
		return getTotal()/3.0;
	}
}













