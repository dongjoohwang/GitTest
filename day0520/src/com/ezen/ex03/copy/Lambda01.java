package com.ezen.ex03.copy;

interface Printable {
	void print(String s);
}

class Printer implements Printable {

	@Override
	public void print(String s) {
		System.out.println(s);
	}
	
}

public class Lambda01 {

	public static void main(String[] args) {
		Printable prn = new Printer();
		prn.print("java is lambda");
	}

}















