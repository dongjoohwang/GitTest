package day0512;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 중복, 순서 x
 */

class Num {
	private int num;
	public Num(int num) {this.num = num;}
	
	@Override
	public String toString() {
		return String.valueOf(num);
	}
	
	@Override
	public int hashCode() {
		return num % 3;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this.num == ((Num)obj).num) {
			return true;
		} else {
			return false;
		}
	}
}


public class HashSet02 {

	public static void main(String[] args) {
	
//		Set<String> set = new HashSet<String>();
//		set.add("toy");
//		set.add("box");
//		set.add("robot");
//		set.add("Box");
//		set.add("toy");
		
		Set<Num> set = new HashSet<Num>();
		
		set.add(new Num(5));
		set.add(new Num(5));
		set.add(new Num(1));
		set.add(new Num(3));
		set.add(new Num(2));
		
		System.out.println("cnt : " + set.size());
		
		for (Iterator<Num> itr = set.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
		
		for(Num s : set)
			System.out.print(s + "\t");
	}

}










