package day0503;

public class Inhclass {

}

class A {
	int a;
	void testA() {
		System.out.println("a");
	}
	public A() {}
	public A(int a) {
		this.a = a;
	}
}

class B extends A {
	int b;
	void testB() {
		System.out.println("b");
	}
	public B() {}
	public B(int a, int b) {
		super(a);
		this.b = b;
	}
	
}

class C extends B {
	int c;
	void testC() {
		System.out.println("A");
	}
	public C() {}
	public C(int a, int b, int c) {
		super(a,b);
		this.c = c;
	}
}










