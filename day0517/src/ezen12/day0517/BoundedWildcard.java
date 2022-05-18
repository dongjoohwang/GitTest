package ezen12.day0517;

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

class Toy {
	@Override
	public String toString() {
		return "i am toy";
	}
}

// public static void outBox(Box<? extends Toy> box)

class Robot extends Toy {}

class Boxhandler {											// box 전달 대상은 Toy, Robot 가능
	public static void outBox(Box<? extends Toy> box) {		// box에 전달 가능한 인스턴스는 Toy 또는 Toy 상속한 아이들(+get만 가능)
		Toy t = box.getOb();		// box >> Box<Toy> or Box<Robot>
		System.out.println(t);
		box.setOb(new Toy());	// Toy
		
		// The method setOb(capture#2-of ? extends Toy) 
		// in the type Box<capture#2-of ? extends Toy> is not applicable for the arguments (Toy)
		/*
		 * Box 클래스 내 setOb() 메소드는 Toy형 인자를 받을 수 없다.
		 * 원인 : toy 타입 파라미터가 없는데 toy 데이터를 넘길 때
		 */
	}
	
	public static void inBox(Box<? super Toy> box, Toy t) {		// box 대상은 Toy, Object
		box.setOb(t);	// Object
		
		Toy t2 = box.getOb();	// Object 타입 => Toy에 넣을 수 없음
//		System.out.println();
	}
}

public class BoundedWildcard {

	public static void main(String[] args) {
		
		Box<Toy> box = new Box<>();
		Boxhandler.inBox(box, new Toy());
		Boxhandler.outBox(box);
	}

}










