package constrct;

public class Ex01Main {

	public static void main(String[] args) {
		
		Ex01 me = new Ex01("황동주", "19940121", "남자");
		
		me.setName("동주");
		me.setBir("19901211");
		me.setGen("남자");
		
		me.greet();
		me.walk();
		me.intro();
		me.printAge();
		
		String name = me.getName();
		System.out.println(name);
	}

}
