package day0503;

public class FighterTest {

	public static void main(String[] args) {
		Fighter f = new Fighter();

		if (f instanceof Unit) {	
		// 참조변수 f가 Unit을 참조하거나 Unit을 상속하는 클래스를 참조하면 OK
			System.out.println("f는 Unit 클래스의 자손입니다.");
		}
		if (f instanceof Fightable) {
			System.out.println("f는 Fightable 인터페이스를 구현했습니다.");
		}
		if (f instanceof Moveable) {
			System.out.println("f는 Moveable 인터페이스를 구현했습니다.");
		}
		if (f instanceof Attackable) {
			System.out.println("f는 Attackable 인터페이스를 구현했습니다.");
		}
		if (f instanceof Object) {
			System.out.println("f는 Object 클래스의 자손입니다.");
		}
		
	
	}

}

class Fighter extends Unit implements Fightable {

	@Override
	public void move(int x, int y) {
			
	}

	@Override
	public void attack(Unit u) {
		
	}
	
}

class Unit {
	int currentHp;
	int x; int y;
}

interface Fightable extends Moveable, Attackable {}

interface Moveable {
	void move(int x, int y);
}

interface Attackable {
	void attack(Unit u);
}













