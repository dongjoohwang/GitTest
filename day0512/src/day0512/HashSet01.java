package day0512;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 중복, 순서 x
 */
public class HashSet01 {

	public static void main(String[] args) {
	
//		Set<String> set = new HashSet<String>();
		Set<Integer> set = new HashSet<Integer>();
//		set.add("toy");
//		set.add("box");
//		set.add("robot");
//		set.add("Box");
//		set.add("toy");
		
		set.add(1);
		set.add(5);
		set.add(5);
		set.add(2);
		set.add(3);
		
		
		System.out.println("cnt : " + set.size());
		
		for (Iterator<Integer> itr = set.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + "\t");
		}
		System.out.println();
		
		for(Integer s : set)
			System.out.print(s + "\t");
	}

}










