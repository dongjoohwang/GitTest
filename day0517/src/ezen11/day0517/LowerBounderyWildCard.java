package ezen11.day0517;

class Box<T> {
	protected T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}	
	
	@Override
	public String toString() {
		return ob.toString();
	}
}

class Unboxer {
	
	public static void peekBox(Box<? super Integer> box) {	// 와일드카드 상한제한(integer, number, object)
		System.out.println(box);
	}
}

public class LowerBounderyWildCard {

	public static void main(String[] args) {
		Box<Integer> box = new Box<>();
		box.setOb(123);		
		Unboxer.peekBox(box);	
		
		Box<Number> box2 = new Box<>();
		box2.setOb(123.4);		
		Unboxer.peekBox(box2);	
		
		Box<Object> box3 = new Box<>();
		box3.setOb("st");	
		Unboxer.peekBox(box3);
		
	}

}










