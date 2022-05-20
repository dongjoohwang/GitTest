package day0519.repeat;

class Box2<T> {
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

class Toy {
	@Override
	public String toString() {
		return "i am toy";
	}
}

class Robot extends Toy {}

class Boxhandler {
	public static void outBox(Box2<? extends Toy> box) {
		Toy t = box.getOb();
		System.out.println(t);
	} 
	
	public static void inBox(Box2<? super Toy> box, Toy t) {
		box.setOb(t);
	}
}

public class BoundedWildcard {
	
	public static void main(String[] args) {
	
		Box2<Toy> box = new Box2<>();
		Boxhandler.inBox(box, new Toy());
		Boxhandler.outBox(box);
	}
}














