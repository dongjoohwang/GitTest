package ezen03.day0517;

import java.util.*;

// class Box<T extends Number> {	

	/*
	 * T에 올 수 있는 대상은 Number이거나 Number를 상속한 객체만 가능 
	 * 
	 * AtomicInteger, AtomicLong, BigDecimal, BigInteger, 
	 * Byte, Double, DoubleAccumulator, DoubleAdder, Float, 
	 * Integer, Long, LongAccumulator, LongAdder, Short
	 */

	class Box<T extends Number> {

	private T ob;	
	
	public void set(T o) {
		ob = o;
	}
	
	public T get() {
		return ob;
	}
	
	public int totalValue() {
		return ob.intValue();	
		/*
		 * The method intValue() is undefined for the type T
		 * 
		 * 해결 방법 : 형변환 
		 * or class Box<T> => class Box<T extends Number>
		 */
	}
}

class Person{}

public class BoundedBox {

	public static void main(String[] args) {
		
//		Person p = new Person();
		
		Box<Double> aBox = new Box<Double>();
		
//		Box<String> aBox = new Box<String>();	=> Bound mismatch: String은 Number의 상속 인자가 아니기 때문
		// The type String is not a valid substitute for the bounded parameter <T extends Number> of the type Box<T>
		
//		aBox.set(new Double(10.5));
		
		System.out.println(aBox.get());
	}

}











