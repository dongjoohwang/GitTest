package day0519.repeat;

class Box3<T> {
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
	public static void peekBox(Box3<? super Integer>box) {
		System.out.println(box);
	}
}

public class LowerBounderyWildCard {

	public static void main(String[] args) {

		Box3<Integer> box = new Box3<>();
		box.setOb(123);
		Unboxer.peekBox(box);
		
		Box3<Number> box2 = new Box3<>();
		box2.setOb(123);
		Unboxer.peekBox(box2);
		
		Box3<Number> box3 = new Box3<>();
		box3.setOb(123);
		Unboxer.peekBox(box3);
	}

}












