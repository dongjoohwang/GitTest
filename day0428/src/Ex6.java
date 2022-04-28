
public class Ex6 {
	
	public static void main(String[] args) {
		animal4 animal = new Sparrow4();

		if (animal instanceof Bird) {
			Bird bird = (Bird)animal;
		} else if (animal instanceof Mammal4) {
			Mammal4 mammal = (Mammal4)animal;
		}
		animal.eat();
		animal.run();
	}

}

class animal4 {
	void eat() {
		System.out.println("동물이 먹는다.");
	}
	void run() {}
}

class Mammal4 extends animal4 {
	void eat() {
		System.out.println("포유류가 먹는다.");
	}
}

class Person4 extends animal4 {
	void eat() {
		System.out.println("사람이 먹는다.");
	} 
	void run() {
		System.out.println("사람이 달린다.");
	}
}

class Bird extends animal4 {
	void eat() {
		System.out.println("새가 먹는다");
	} 
	void run() {
		System.out.println("새가 달린다.");
	}
}

class Sparrow4 extends Bird {		// 참새
	void eat() {
		System.out.println("참새가 먹는다.");
	}
	void run() {
		System.out.println("참새가 달린다.");
	}
}









