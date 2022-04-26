package day0426;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Exercise6_2 {

	public static void main(String[] args) {
		
		sutdaCard card1 = new sutdaCard(3, false);
		sutdaCard card2 = new sutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}

@Getter		// 어노테이션
@Setter
@ToString
class sutdaCard {
	private int num;
	private boolean isKwang;

	public sutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public sutdaCard() {
		this.num = 1;	// 1로 값 지정
		this.isKwang = true;
	}
	
	String info() {
		System.out.print(num);
		if (isKwang==true) {
			return "K";
		}
		return "";
	}
}




















