package com.ezen;

/*
 * 상위클래스는 하위클래스를 참조할 수 있으나,
 * 하위클래스는 상위클래스를 참조할 수 없다.
 * 단, 상위클래스가 참조한 하위클래스를 하위클래스 참조변수에게
 * 타입 변환한 후에는 참조할 수 있다.
 */

public class Test04 {

	public static void main(String[] args) {
		Object obj = new B(new F());
		
//		A a = new C();
//		C c = (C)a;
//		
//		C c = new B();
		
//		b = (BB) new Object();
//		b = (BB) new AA();
	}

}

class D{
	int d;
}
class F{}

class A {
	int a;
	void funcA() {}
}

class B extends A {
	int b;
	public B(Object o) {	// 객체만 집어넣을 것
		if(o instanceof D) {
		D dd = (D)o;
		dd.d = 10;
		} else if(o instanceof F) {
			F f = (F)o;
		}
	}
	void funcB(Object o) {}
}














