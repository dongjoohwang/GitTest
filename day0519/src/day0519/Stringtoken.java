package day0519;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Stringtoken {

	public static void main(String[] args) {
		String data = "100,200,,,,300";
		
		System.out.println("tokenizer");
		StringTokenizer st = new StringTokenizer(data, ",");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		System.out.println("===========");
		System.out.println("scanner");
		Scanner sc = new Scanner(data).useDelimiter(",");
		while (sc.hasNext()) {
			System.out.println(sc.next());
		}
		
		System.out.println("==============");
		System.out.println("split");
		String[] strings = new String(data).split(",");
		for(String str : strings) {
			System.out.println(str);
		}
	}

}












