package day0516;

import java.util.ArrayList;
import java.util.List;

class Apple2 {
	@Override
	public String toString() {
	
		return "i am apple";
	}
}

class Orange2 {
	@Override
	public String toString() {
		
		return "i am orange";
	}
}


class Box2<A> {
	private A ob;

	public A getOb() {
		return ob;
	}

	public void setOb(A ob) {
		this.ob = ob;
	}

}

public class GenericsEx2 {

	public static void main(String[] args) {
		
		Box2<Apple2> abox = new Box2<Apple2>();		// <Apple2>만 리턴
		
		Box2<Orange2> obox = new Box2<Orange2>();	// <Orange2>만 리턴
		
		Box2<String> sbox = new Box2<String>();
		
		abox.setOb(new Apple2());
		obox.setOb(new Orange2());
		
		Apple2 ap = abox.getOb();
		Orange2 or = obox.getOb();
		System.out.println(ap);
		System.out.println(or);
		
//		abox.setOb("new Apple2()");
		// The method setOb(Apple2) in the type Box2<Apple2> is not applicable for the arguments (String)
		// <Apple2> 타입만 가능
	}

}












