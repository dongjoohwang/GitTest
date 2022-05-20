package ezen06.day0517;

class Box<T> {
	protected T ob;

	public T getOb() {
		return ob;
	}

	public void setOb(T ob) {
		this.ob = ob;
	}	
}

class EmptyboxFactory {
	
	public static <T> Box<T> makeBox() {	// 지네릭 메소드
		
		Box<T> box = new Box<T>();
		return box;
	}
}

public class Targettypes {

	public static void main(String[] args) {
		Box<Integer> iBox = EmptyboxFactory.makeBox();
		
		iBox.setOb(25);
		
		System.out.println(iBox.getOb());
	}

}












