package day0429;

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Product tv = new Tv();
		
		System.out.println(tv.price);
		tv.test();
		tv.func();
		
		Object obj = new Tv();
		obj.toString();
	}

}

abstract class Product {
	int price; // 제품의 가격
	Product(int price) {
		this.price = price;
	}
	
	void test() {
		System.out.println("Product");
	}
	
	abstract void func(); 	// 추상메소드 -> 오버라이딩 필수
}
	
class Tv extends Product {
	Tv() { super(100); }
		
	public String toString() { return "Tv"; }

	@Override		// 오버라이딩 강제
	void func() {
		System.out.println("Tv");
	}
	
	}
	
class Computer extends Product {
		
	Computer() { super(200); }
	
	public String toString() { return "Computer";}

	@Override
	void func() {
		System.out.println("Computer");	
	}
	
	}
	
class Audio extends Product {
	Audio() { super(50); }
		
	public String toString() { return "Audio"; }

	@Override
	void func() {
		System.out.println("Audio");
	}

 }
	
	
	
	
	
	
	
	
