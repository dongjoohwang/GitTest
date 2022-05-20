package com.ezen.ex04.copy;


interface Calculate {
	int cal(int n1, int n2);
}

class Cal implements Calculate {

	@Override
	public int cal(int n1, int n2) {
		return n1+n2;
	}
	
}

// ctrl + shift + {
public class Lambda04 {

	public static void main(String[] args) {
		// 람다
		
		Calculate c = (int n1, int n2) -> {
			return n1+n2;
		};
		
		System.out.println(c.cal(5, 2));
	
		c = (n1, n2) -> n1+n2;
		System.out.println(c.cal(3, 2));

		c = (n1, n2) -> n1*n2;
		System.out.println(c.cal(3, 2));
		
		c = new Cal();
		System.out.println(c.cal(5, 5));
	}
}















