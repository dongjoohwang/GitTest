package com.ezen.ex03.copy;

interface Printable3 {
	void print(String s);
}

public class Lambda03 {

	public static void main(String[] args) {
		Printable3 prn = (s) -> System.out.println(s);
		
		prn.print("java is lambda3");
	}
}















