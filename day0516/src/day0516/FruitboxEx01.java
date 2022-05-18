package day0516;

import java.util.ArrayList;

class Fruit {
	@Override
	public String toString() {
		
		return "fruit";
	}
}

class Apples extends Fruit {
	@Override
	public String toString() {
		
		return "apple";
	}
}

class Grape extends Fruit {
	@Override
	public String toString() {
		
		return "grape";
	}
}

class Toy extends Fruit {
	@Override
	public String toString() {
		
		return "toy";
	}
}

public class FruitboxEx01 {

	public static void main(String[] args) {
		
		Box3<Fruit> fruitBox = new Box3<Fruit>();
		Box3<Apples> appleBox = new Box3<Apples>();
		Box3<Toy> toyBox = new Box3<Toy>();
//		Box<Grape> grapeBox = new Box<Grape>();		=> 타입 불일치
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apples());
		
		appleBox.add(new Apples());
		appleBox.add(new Apples());
		
		toyBox.add(new Toy());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
	}

}

class Box3<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {
		list.add(item);
	}
	T get(int i) {
		return list.get(i);
	}
	int size() {
		return list.size();
	}
	@Override
	public String toString() {
		return list.toString();
	}
}














