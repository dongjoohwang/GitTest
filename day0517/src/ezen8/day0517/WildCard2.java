package ezen8.day0517;

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
	public static <T> T openBox(Box<T>box) {
		return box.getOb();	
	}
	
	public static void peekBox(Box<?> box) {	// 와일드카드 기반 메소드 정의
		System.out.println(box);
	}
}

public class WildCard2 {

	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.setOb("apple");
		
//		Unboxer.peekBox(box);		=> 타입 불일치
		/*
		 * The method peekBox(Box<Object>) in the type Unboxer is not applicable for the arguments (Box<String>)
		 * 해결 방법 : Box<String> box => Box<Object> box
		 */
		
		Unboxer.peekBox(box);
	}

}










