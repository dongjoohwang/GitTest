
public class Ex2 {

	public static void main(String[] args) {
	
		animal3 an = new animal3();
		animal3 an2 = new Mammal3();
		animal3 an3 = new Person3();
		
		an.eat();
		an2.eat();
		an3.eat();
		
		an3.run();
	}

}

class animal3 {
	void eat() {
		System.out.println("동물이 먹는다.");
	}
	
	void run() {}
}

class Mammal3 extends animal3 {
	void eat() {
		System.out.println("포유류가 먹는다.");
	}
}

class Person3 extends animal3 {
	void eat() {
		System.out.println("사람이 먹는다.");
	}
	void run() {
		System.out.println("사람이 달린다.");
	}
}












