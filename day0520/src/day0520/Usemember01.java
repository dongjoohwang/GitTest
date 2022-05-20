package day0520;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

interface Printable {
	void print();
}

class Papers {
	private String con;
	public Papers(String s) {
		con = s;
	}
	public Printable getPrinter() {
		return new Printer2();
	}
	private class Printer implements Printable{

		@Override
		public void print() {
			System.out.println("흑백 : " + con);
		}	
	}
	
	private class Printer2 implements Printable{

		@Override
		public void print() {
			System.out.println("칼라 : " + con);
		}
	}
}

public class Usemember01 {

	public static void main(String[] args) {
		Papers p = new Papers("message java");
		Printable prn = p.getPrinter();
		prn.print();
		
		List<String> list = new ArrayList<>();
		list.add("aaaa");
		list.add("bbbb");
		list.add("cccc");
		
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
	}

}










