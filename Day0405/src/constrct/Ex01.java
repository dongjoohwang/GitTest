package constrct;

public class Ex01 {

	// 필드 생성
	private String name, bir, gen;

	// 메소드
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name.startsWith("황")) {		// 유효성 검증
			this.name = name;
		}
	}

	public String getBir() {
		return this.bir;
	}

	public void setBir(String bir) {
		this.bir = bir;
	}

	public String getGen() {
		return this.gen;
	}

	public void setGen(String gen) {
		this.gen = gen;
	}
	
	/* 생성자 오버로딩
	 * 파라미터의 타입이 다르거나, 개수가 다르거나 일치하는 메소드가 선택된다.
	   생성자(Constructor) : 객체가 생성될 때 불려지는 특수한 메소드
	 */
	
	public Ex01() {
		System.out.println("hello!");
	}
	
	public Ex01(String name, String bir, String gen) {
		this.name = name;
		this.bir = bir;
		this.gen = gen;
	}
	
	public void greet() {
		System.out.println("안녕하세요!");
	}
	
	public void walk() {
		System.out.println("걷기");
	}
	
	public void intro() {
		System.out.println("내 이름은 " + this.name + "이고 성별은 " + this.gen + "이다.");
	}
	
	public void printAge() {
		String yearStr = this.bir.substring(0,4);	// yyyymmdd => yyyy
		int year = Integer.parseInt(yearStr);
		int age = 2021 - year + 1;
		System.out.println("나이는 " + age);
	}
}













