package day0422;

// 클래스 4대 특성, 캡슐화, 상속, 추상화, 다형성
public class Main {

	public static void main(String[] args) {
		
////		String str = "ABCDEFG";
////
////	    String str2 = str.substring(2,5);
////	    System.out.println(str2);
////	  
//		System.out.println("매개변수의 개수 : " + args.length);
//		
//		for (int i = 0; i < args.length; i++) {
//			System.out.println("args[" + i + "] = \"" + args[i] + "\"");
//		}
		
		int i= 0;
		while (i++<4) {
			int num = (int)(Math.random()*6)+1;
			int num2 = (int)(Math.random()*4)+1;
			
			System.out.println(num + " , " + num2);
		}
	}

}
