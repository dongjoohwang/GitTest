package ezen9.day0517;

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
	
	public static void peekBox(Box<? extends Integer> box) {	// 와일드카드 하한제한
		System.out.println(box);
	}
}

public class UpperBounderyWildCard {

	public static void main(String[] args) {
		Box<Integer> box = new Box<>();
		box.setOb(123);
//		System.out.println(box.getOb());		
		Unboxer.peekBox(box);	
		
	}

}










