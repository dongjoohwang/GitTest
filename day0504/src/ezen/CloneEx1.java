package ezen;

class Point implements Cloneable {
	int x, y;
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x=" + x + ", y=" + y;
	}
	
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch(CloneNotSupportedException e) {}
		return obj;
	}
}

public class CloneEx1 {

	public static void main(String[] args) {
		Point or = new Point(3, 5);
		Point copy = (Point)or.clone();
		Point copy2 = or;
		or.x = 10;
		or.y = 20;
		copy.x = 100;
		copy.y = 200;	
		System.out.println(or);	
		System.out.println(copy);
		System.out.println(copy2);
	}

}













