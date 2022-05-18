package ezen03.day0518;

import ezen03.day0518.Box;
import ezen03.day0518.BoxFactory;

class Box<T> {
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class BoxFactory {
	/*
	 * 제네릭 메소드
	 * 제네릭 메소드 표시 : <T>, Box<T> : 반환형, T o : 매개변수
	 */
	public static <T extends Number> Box<T> makeBox(T o) {
		Box<T> box = new Box<T>();
		box.set(o);
		
		System.out.println("box data : " + o.intValue());
		return box;
	}
}

class Unboxer {
	public static <T extends Number> T openBox(Box<T> box){
		System.out.println("unboxer data : " + box.get().intValue());
		return box.get();
	}
}

public class GenericMethod3 {

	public static void main(String[] args) {

		Box<Integer> iBox = BoxFactory.makeBox(8989);
		int num = Unboxer.openBox(iBox);
		System.out.println("result : " + num);
	}

}










