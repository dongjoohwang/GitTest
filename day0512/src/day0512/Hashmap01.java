package day0512;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

class Agedes implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2-o1;
	}
	
}

public class Hashmap01 {

	public static void main(String[] args) {
		
//		HashMap<Integer, String> map = new HashMap<Integer, String>();		// 정렬 x, 중복 x
		TreeMap<Integer, String> map = new TreeMap<Integer, String>(new Agedes());	// 정렬 o, 중복 x
		
		map.put(6, "kim");
		map.put(3, "kim");
		map.put(20, "kim");
		map.put(13, "kim");
		map.put(4, "hong");
		map.put(4, "lee");
		map.put(14, "lee");
		map.put(5, "park");
		map.put(15, "park");
		map.put(4, "lee2");
		map.put(4, "kim");
		
		System.out.println(map);
		System.out.println(map.get(5));
		System.out.println();

		Set<Integer> set = map.keySet();

		for (Integer n : set) 
			System.out.print(n + "\t");
		System.out.println();
		
		for(Integer n : set)
			System.out.print(map.get(n) + "\t");
		System.out.println();
		
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.print(map.get(itr.next()) + "\t");
		}
	}

}












