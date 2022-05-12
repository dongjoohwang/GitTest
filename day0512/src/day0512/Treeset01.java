package day0512;

import java.util.Iterator;
import java.util.TreeSet;

public class Treeset01 {

	public static void main(String[] args) {
		
		TreeSet<Integer> tree = new TreeSet<Integer>();
		
		tree.add(3);
		tree.add(1);
		tree.add(2);
		tree.add(4);
		tree.add(3);
		
		for(Integer n : tree)
			System.out.print(n.toString() + "\t");
			System.out.println();
		
		Iterator<Integer> itr = tree.iterator();
		while (itr.hasNext()) {
		//	Integer n = itr.next();
			System.out.print(itr.next().toString() + "\t");
		}
	}

}









