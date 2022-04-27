package prac;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {

	public static void main(String[] args) {
		
		List<String> str = new ArrayList<>();
		str.add("apple");
		str.add("banana");
		str.add("grape");
		
		System.out.println("### 1. for¹®");
		for (int i = 0; i < str.size(); i++) {
			System.out.println(str.get(i));
			
			String fruit = str.get(i);
			if (fruit.startsWith("b")) {
				str.remove(i);
				i--;
			}
		}
		
		System.out.println("### 2. Iterator");
		
		Iterator<String> iter = str.iterator();
		while (iter.hasNext()) {
			String string = (String) iter.next();
			
		}
	}

}

















