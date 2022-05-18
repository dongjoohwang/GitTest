package ezen02.day0518;

class Box<T> {
	private T ob;
	public void set(T o) {
		ob = o;
	}
	public T get() {
		return ob;
	}
}

class Unboxer {
	/*
	 * 제네릭 메소드
	 * 제네릭 메소드 표시 : <T>, Box<T> : 반환형, T o : 매개변수
	 */
	public static <T> T makeBox(Box<T> box) {
		
		return box.get();
	}
}

public class GenericMethod2 {

	public static void main(String[] args) {

		Box<String> sBox = new Box<>();
		sBox.set("generic method");
		
		String str = Unboxer.makeBox(sBox);
		System.out.println(str);
	}

}










