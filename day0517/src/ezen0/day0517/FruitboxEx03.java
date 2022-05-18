package ezen0.day0517;

import java.util.ArrayList;

class Fruit 	{ @Override public String toString() {	return "fruit";}}
class Apple extends Fruit 	{ @Override public String toString() {	return "apple";}}
class Grape extends Fruit 	{ @Override public String toString() {	return "grape";}}

class Juice {
	String name;
	
	Juice(String name) {this.name = name + " juice";}
	@Override 	public String toString() { return name;}
}

class Juicer {
	static Juice makeJuice(FruitBox<? extends Fruit> box) {
		String tmp = "";
	
		for(Fruit f : box.getList())
			tmp += f + " ";
		return new Juice(tmp);
	}
}

public class FruitboxEx03 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitbox = new FruitBox<Fruit>();
		FruitBox<Apple> applebox = new FruitBox<Apple>();
		FruitBox<Grape> fbox = new FruitBox<Grape>();
		
		fruitbox.add(new Apple());
		fruitbox.add(new Grape());
		applebox.add(new Apple());
		applebox.add(new Apple());
		fbox.add(new Grape());
		
		System.out.println(Juicer.makeJuice(fruitbox));
		System.out.println(Juicer.makeJuice(applebox));
		System.out.println(Juicer.makeJuice(fbox));
	}

}

class FruitBox<T extends Fruit> extends Box<T> {}
	
	class Box<T> {
		ArrayList<T> list = new ArrayList<T>();
		void add(T item) {list.add(item);}
		T get(int i) {return list.get(i);}
		ArrayList<T> getList() {return list;}
		int size() {return list.size();}
		@Override
		public String toString() {
			return list.toString();
		
	}
}







