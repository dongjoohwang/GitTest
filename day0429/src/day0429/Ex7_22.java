package day0429;

public class Ex7_22 {

	public static void main(String[] args) {
		Shape c = new Circle();
		
		Shape rec = new Rectangle();
	}

}

abstract class Shape {
	Point p;
	Shape() {
		this(new Point(0,0));
	}
	
	Shape(Point p) {
		this.p = p;
	}
	
abstract double calcArea(); // 도형의 면적을 계산해서 반환하는 메서드
	
	Point getPosition() {
		return p;
	}

	void setPosition(Point p) {
		this.p = p;
		}
	}

class Circle extends Shape {

	@Override
	double calcArea() {
		
		return 0.0;
	}
	
}

class Rectangle extends Shape {

	@Override
	double calcArea() {
		
		return 0.0;
	}
	
}
	
class Point {
	int x;
	int y;
	
	Point() {
		this(0,0);
	}
	
	Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	public String toString() {
	
		return "["+x+","+y+"]";
	}
}












	
