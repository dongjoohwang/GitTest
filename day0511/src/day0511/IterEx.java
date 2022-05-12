package day0511;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterEx {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<String>();
		
		list.add("toy");
		list.add("box");
		list.add("robot");
		
		// list, set, map
		for(String e : list)
			System.out.print(e + '\t');
		
		Iterator<String> it = list.iterator();
		System.out.println();
		// next : 다음값 반환
		// hasnext : 가져올 데이터가 있는가?
		// remove >> next() 호출 통해 반환될 인스턴스 삭제
		while (it.hasNext()) {
			String str = it.next();
			if(str.equals("toy")) it.remove();
			System.out.print(str + '\t');
		}
		
		Iterator<String> it2 = list.iterator();
		System.out.println();
		while (it2.hasNext()) {
			String str2 = it2.next();
			System.out.print(str2 + '\t');
		}
	}

}









