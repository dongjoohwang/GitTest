package day0512;

import java.util.HashSet;
import java.util.Objects;

public class HashsetEx03 {

	public static void main(String[] args) {
	
		HashSet set = new HashSet();
		
		set.add("abc");
		set.add("abc");
		set.add(new Person("david", 10));
		set.add(new Person("david", 10));
		
		System.out.println(set);
	}

}

class Person {
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		Person tmp = (Person)obj;
		return name.equals(tmp.name) && age == tmp.age ? true : false;
	}
	
	public int hashCode() {
		return Objects.hash(name,age);
	}
	
	@Override
	public String toString() {
		return name + " : " + age;
	}
}









