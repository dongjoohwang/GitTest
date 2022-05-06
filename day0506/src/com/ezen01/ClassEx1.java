package com.ezen01;


final class Card {
	String kind;
	int num;
	
	public Card() {
		this("spade",1);
	}
	Card(String kind, int num) {
		this.kind = kind;
		this.num = num;
	}
	
	@Override	// Card 값 출력
	public String toString() {
		return "[" + kind + " : " + num + "]";
	}
}

public class ClassEx1 {

	public static void main(String[] args) throws Exception {
//		Card c = new Card();
//		System.out.println(c);
//		
//		Card c2 = Card.class.newInstance();
//		System.out.println(c2);
//		
//		Class cObj = c.getClass();
		
		Class cObj = Class.forName("com.ezen01.Card");
		
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
	}
}

















