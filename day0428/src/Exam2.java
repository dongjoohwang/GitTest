
public class Exam2 {

	public static void main(String[] args) {
	
		animal2 an =  new animal2();
		animal2 an2 = new Mammal2();
		animal2 an3 = new Person2();
		
		an.eat();	// class animal => void eat()
		an2.eat();	// class Mammal => void eat()
		an3.eat();	// class Person => void eat2()  animal 메소드 명과 일치하지 않음
					// Person이 아닌 Mammal(참조 메소드)에 있는 문장이 실행됨
		an3.run();
		
//		Object obj = new Person();
//		obj.eat();
	}

}

class animal2 {	// 동물
	void eat() {	// an.eat()	
		System.out.println("동물이 먹는다.");
	}
	void run() {
		
	}
}

class Mammal2 extends animal2 {	// 포유류
	void eat() {		// an2.eat()
		System.out.println("포유류가 먹는다.");
	}
}

class Whale2 extends Mammal2 {	// 고래
	void eat() {
		System.out.println("고래가 먹는다.");
	}
}

class Person2 extends Mammal2 {		// 사람
	void eat2() {		// an3.eat() => 일치하지 않음
		System.out.println("사람이 먹는다.");
	}
	void run() {
		System.out.println("사람이 달린다.");
	}
}

class Birds2 extends animal2 {	// 조류
	void eat() {
		System.out.println("조류가 먹는다.");
	}
}

class Penguin2 extends Birds2 {		// 펭귄
	void eat() {
		System.out.println("팽귄이 먹는다.");
	}
}

class Sparrow2 extends Birds2 {		// 참새
	void eat() {
		System.out.println("참새가 먹는다.");
	}
}









