package com.ezen.ex03.copy;

interface Printable4 {
	void print(String s);
}

interface Calculate {
	void cal(int n1, int n2);
}

class Cal implements Calculate {

	@Override
	public void cal(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
}

// ctrl + shift + {
public class Lambda04 {

	public static void main(String[] args) {
		// 람다
		Printable4 prn;
		
		prn = (String s) -> {System.out.println(s);};
		prn.print("java is lambda1");
		
		prn = (String s) -> System.out.println(s);
		prn.print("java is lambda2");
		
		prn = (s) -> System.out.println(s);
		prn.print("java is lambda3");
		
		prn = s -> System.out.println(s);
		prn.print("java is lambda4");
		
		System.out.println("===================");
		
		Calculate c = new Cal();
		c.cal(10, 10);
		
		Calculate cc;
		
		c = (int n1, int n2) -> {System.out.println(n1+n2);};
		c.cal(5, 2);
		
		c = (n1, n2) -> {System.out.println(n1*n2);};
		c.cal(3, 2);
		
		c = (n1, n2) -> System.out.println(n1-n2);
		c.cal(1, 2);
	
	}
}















