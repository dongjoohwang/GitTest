package day0503;

public class Inh {

	public static void main(String[] args) {
		
		A c = new C(10, 20, 30);
//		C c = new A();	하위 => 상위 참조(불가능)
//		A a = new C();	// 상위 => 하위 참조(가능)
		
//		A c = new A();	=> 에러(A밖에 참조하지 못함)
		
		System.out.println(c.a);
	
		c.testA();
		
		B cc = (B)c;
		
		System.out.println(cc.a);
		System.out.println(cc.b);
//		System.out.println(cc.c);
		
		/*
		 * 상위 클래스 참조변수는 하위클래스 참조 가능
		 * 하위 클래스 참조변수는 상위클래스 참조 가능
		 */
		
	}

}










