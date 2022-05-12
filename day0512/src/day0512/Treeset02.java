package day0512;

import java.util.Iterator;
import java.util.TreeSet;

class Person2 implements Comparable<Person2> {
	String name;
	int age;
	
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " : " + age;
	}

	@Override
	public int compareTo(Person2 o) {
		return this.age-o.age;
	}
}

public class Treeset02 {

	public static void main(String[] args) {
		
		TreeSet<Person2> tree = new TreeSet<>();
		
		tree.add(new Person2("kim", 20));
		tree.add(new Person2("park", 50));
		tree.add(new Person2("lee", 80));
		tree.add(new Person2("lee", 80));
		tree.add(new Person2("kim", 29));
		tree.add(new Person2("kim", 80));
		
		for(Person2 n : tree)
			System.out.print(n.toString() + "\t");
		
	}

}









