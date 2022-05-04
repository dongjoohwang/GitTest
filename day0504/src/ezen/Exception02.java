package ezen;

public class Exception02 {

	public static void main(String[] args) throws Exception {
		method1();
	}
	
	static void method1() throws Exception {
		method2();
	}
	
	static void method2() throws Exception {
		throw new Exception();
	}
	

}
