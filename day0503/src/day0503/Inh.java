package day0503;

public class Inh {

	public static void main(String[] args) {
		
		B c =  new C(10,20,30);
//		A c =  new A();
		//C c = new A();
		
		System.out.println(c.b);
		c.testA();		// b, c	
		// 클래스 A,B,C의 메소드명이 모두 같을 경우, testA 메소드는 
		// 자기 자신(a)이 아닌 다른 클래스의 메소드를 출력한다.
		
//		B cc = (B) c;
		
//		System.out.println(c.a);
//		System.out.println(cc.b);
		//System.out.println(cc.c);
		
	//상위클래스 참조변수는 하위클래스 참조가능
	//하위클래스 참조변수는 상위클래스 참조불가
	
	}

}