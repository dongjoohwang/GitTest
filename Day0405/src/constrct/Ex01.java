package constrct;

public class Ex01 {

	// �ʵ� ����
	private String name, bir, gen;

	// �޼ҵ�
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		if (name.startsWith("Ȳ")) {		// ��ȿ�� ����
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
	
	/* ������ �����ε�
	 * �Ķ������ Ÿ���� �ٸ��ų�, ������ �ٸ��ų� ��ġ�ϴ� �޼ҵ尡 ���õȴ�.
	   ������(Constructor) : ��ü�� ������ �� �ҷ����� Ư���� �޼ҵ�
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
		System.out.println("�ȳ��ϼ���!");
	}
	
	public void walk() {
		System.out.println("�ȱ�");
	}
	
	public void intro() {
		System.out.println("�� �̸��� " + this.name + "�̰� ������ " + this.gen + "�̴�.");
	}
	
	public void printAge() {
		String yearStr = this.bir.substring(0,4);	// yyyymmdd => yyyy
		int year = Integer.parseInt(yearStr);
		int age = 2021 - year + 1;
		System.out.println("���̴� " + age);
	}
}













