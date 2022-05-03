package day0503;

public class Abtest {

	public static void main(String[] args) {
//		A2 a2 = new B2();	// 추상 클래스는 new 객체 생성을 할 수 없다.
		A2 a2 = new C2();
		System.out.println(a2.a);
		a2.func();
	}

}

abstract class A2 {		// 추상 클래스
	int a = 10;
	void test() {
		System.out.println("aa");
	}
	abstract void func(); // 추상 메소드
	abstract void func2(); // 추상 메소드
	abstract void func3(); // 추상 메소드
}

abstract class B2 extends A2 {

	@Override
	void func() {
		System.out.println("bbbbbb");
		
	}
	
}

class C2 extends B2 {

	@Override
	void func2() {
			
	}

	@Override
	void func3() {
		
	}
	
}








