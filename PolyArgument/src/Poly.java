class Product {
	int price;
	int bonus;
	
	Product(int price) {
		this.price = price;
		bonus = (int)(price/10.0);
	}
}

class Tv extends Product {

	Tv() {
		super(100);
	}
	public String toString() {
		return "tv";
	}	
}

class Computer extends Product {

	Computer() {
		super(20000);
	}
	public String toString() {
		return "Computer";
	}
}

class Buyer {

	int money = 1000;
	int bonus = 0;
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액 부족");
			return;
		}
		money -= p.price;
		bonus += p.bonus;
		System.out.println(p + "구입");
	}
	
}

class Poly {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		
		System.out.println("잔액 : " + b.money);
		System.out.println("보너스 점수 : " + b.bonus);
	}

}










