package day0516;

class Apple {
	@Override
	public String toString() {
	
		return "i am apple";
	}
}

class Orange {
	@Override
	public String toString() {
		
		return "i am orange";
	}
}

//class AppleBox {
//	Apple apple;
//
//	public Apple getApple() {
//		return apple;
//	}
//
//	public void setApple(Apple apple) {
//		this.apple = apple;
//	}
//}

/*
 * object 선언 => 다형성
 * 단점 : abox.setOb(new Apple()); => abox.setOb("apple"); 
 * => String 타입으로 형변환하지 않을 경우 컴파일 에러 발생
 */
class Box {
	private Object ob;

	public Object getOb() {
		return ob;
	}

	public void setOb(Object ob) {
		this.ob = ob;
	}
	
	
}

public class GenericsEx01 {

	public static void main(String[] args) {
		
//		AppleBox ap2 = new AppleBox();
//		
//		ap2.setApple(new Apple());
//		ap2.setApple(new Orange());
		
		Box abox = new Box();
		Box obox = new Box();

		abox.setOb(new Apple());
		obox.setOb(new Orange());
		
		Apple ap = (Apple) abox.getOb();
		System.out.println(ap);
		
		Orange or = (Orange) obox.getOb();
		System.out.println(or);
		System.out.println("=============");
		
		abox.setOb("new Apple()");
		obox.setOb("orange");
		
//		Apple ap4 = (Apple) abox.getOb();	
		// Exception in thread "main" java.lang.ClassCastException: 
		// class java.lang.String cannot be cast to class day0516.Apple (java.lang.String is in module java.base of loader 'bootstrap'; 
		// day0516.Apple is in unnamed module of loader 'app') at day0516.GenericsEx01.main(GenericsEx01.java:74)		
		
//		=>
//		Apple ap4 = (Apple) abox.getOb();
		System.out.println(abox.getOb());		
		
	}

}












