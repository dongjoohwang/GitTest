package constrct;

public class Ex01Main {

	public static void main(String[] args) {
		
		Ex01 me = new Ex01("Ȳ����", "19940121", "����");
		
		me.setName("����");
		me.setBir("19901211");
		me.setGen("����");
		
		me.greet();
		me.walk();
		me.intro();
		me.printAge();
		
		String name = me.getName();
		System.out.println(name);
	}

}
