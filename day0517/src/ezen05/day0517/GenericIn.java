package ezen05.day0517;

class Box2<T> {
	protected T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}	
}

class SteelBox<T> extends Box2<T> {
	public SteelBox(T t) {
		ob = t;
	}
}

public class GenericIn {
	public static void main(String[] args) {
		
		Box2<Integer> iBox = new SteelBox<>(10);
//		Box2<Integer> iBox = new SteelBox<>("korea");	// Cannot infer type arguments for SteelBox<>
		
		Box2<String> sBox = new SteelBox<>("simple");
//		Box2<String> sBox = new SteelBox<>(100);		// Cannot infer type arguments for SteelBox<>
		
		System.out.println(iBox.getOb());
		System.out.println(sBox.getOb());
	}
}















