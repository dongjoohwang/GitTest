package com.ezen.ex03.copy;

interface Printable2 {
	void print(String s);
}

class Printer2 implements Printable2 {

	@Override
	public void print(String s) {
		System.out.println(s);
	}
	
}

public class Lambda02 {

	public static void main(String[] args) {
		Printable2 prn = new Printer2() {
			public void print(String s) {
				System.out.println(s);
			}
		};
		prn.print("java is lambda2");
	}

}















