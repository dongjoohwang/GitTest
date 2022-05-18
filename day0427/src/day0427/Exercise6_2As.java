package day0427;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class Exercise6_2As {

	public static void main(String[] args) {
		
		sutdaCard2 c1 = new sutdaCard2(3, false);
		sutdaCard2 c2 = new sutdaCard2();
		
		System.out.println(c1.info());		// 3
		System.out.println(c2.info());		// 1K
	}

}

@Getter		// 어노테이션
@Setter
@ToString
class sutdaCard2 {
	int num;
	boolean isKwang;
	
	public sutdaCard2() {
//		this.num = 1;
//		this.isKwang = true;
		this(1,true);
	}
	
	public sutdaCard2(int num, boolean isKwang) {
		if (num>=1 && num<=10) {
			this.num=num;
		} else {
			this.num=0;
		}
		this.isKwang = isKwang;
	}
	
	String info() {
		return num + (isKwang? "K": "");
	}
}




















