package day0520;

/*
 * nested 클래스와 inner 클래스
 * nested -> static
 * 
 * inner -> static xx
 * member inner class
 * local inner class
 * anonymous inner class
 */

class Outer {
	private static int num = 0;
	static class Nested01 {
		void add(int n) {
			num += n;
		}
	}
	static class Nested02 {
		int get() {
			return num;
		}
	}
}

public class StaticNested {

	public static void main(String[] args) {
		Outer.Nested01 n1 = new Outer.Nested01();
		n1.add(10);
		Outer.Nested02 n2 = new Outer.Nested02();
		System.out.println(n2.get());
	}

}










