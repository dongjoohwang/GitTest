package ezen;

import java.util.*;

class Card {
	String kind;
	int number;
	
	Card(){
		this("spade", 1);
	}

	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "kind : " + kind + ", num : " + number;
	}
}

public class CardTostring {

	public static void main(String[] args) {
		
		Card c1 = new Card("red", 10);
		Card c2 = new Card();		

		System.out.println(c1);
		System.out.println(c2.toString());
		
		java.util.Date today = new java.util.Date();
		System.out.println(today);
	}

}











