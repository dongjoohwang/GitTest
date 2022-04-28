
public class Exam01 {

	public static void main(String[] args) {
	
//		animal an =  new animal();
//		animal an2 = new Mammal();
//		animal an3 = new Person();
//		
//		an.eat();	// class animal => void eat()
//		an2.eat();	// class Mammal => void eat()
//		an3.eat();	// class Person => void eat2()  animal 메소드 명과 일치하지 않음
//					// Person이 아닌 Mammal(참조 메소드)에 있는 문장이 실행됨
//		an3.run();
//		
////		Object obj = new Person();
////		obj.eat();
//		
//		System.out.println("============");
//		Person p = (Person) an3;
//		
//		p.eat();
//		p.run();
//		p.play();
//		System.out.println("============");
//		
//		Mammal m1 = (Mammal) an3;
//		m1.eat();
//		Object ob = new Person();
//		Person p2 = (Person)ob;
//		((animal) ob).eat();
//		p2.eat();
		
		animal animal = new Person();
//		animal.eat();
		
//		Penguin peng = (Penguin)animal;
//		peng.play();
		
		Birds b = new Birds();		// 자기자신
		Birds b2 = new Sparrow();	// 참새는 새다
		Birds b3 = new Penguin();	// 팽귄은 새다
			
//		Sparrow sp = new animal();	// 동물은 참새다 => X
//		Penguin pe = new Sparrow();	// 참새는 팽귄이다 => X
		
		if(animal instanceof Birds) {
			Birds birds = (Birds)animal;
		}
		else if(animal instanceof Mammal) {
			Mammal mammal = (Mammal)animal;
		}
		animal.eat();
	}

}

class animal {	// 동물
	void eat() {	// an.eat()	
		System.out.println("동물이 먹는다.");
	}
	void run() {
		
	}
	void play() {
		
	}
}

class Mammal extends animal {	// 포유류
	void eat() {		// an2.eat()
		System.out.println("포유류가 먹는다.");
	}
}

class Whale extends Mammal {	// 고래
	void eat() {
		System.out.println("고래가 먹는다.");
	}
}

class Person extends Mammal {		// 사람
	void eat() {		// an3.eat() => 일치하지 않음
		System.out.println("사람이 먹는다.");
	}
	void run() {
		System.out.println("사람이 달린다.");
	}
	void play() {
		System.out.println("사람이 논다");
	}
}

class Birds extends animal {	// 조류
	void eat() {
		System.out.println("조류가 먹는다.");
	}
}

class Penguin extends Birds {		// 펭귄
	void eat() {
		System.out.println("팽귄이 먹는다.");
	}
	void play() {
		System.out.println("팽귄이 논다");
	}
}

class Sparrow extends Birds {		// 참새
	void eat() {
		System.out.println("참새가 먹는다.");
	}
}









