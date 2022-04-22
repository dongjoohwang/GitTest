package day0422;

public class Main {

	public static void main(String[] args) {
		
//		String str = "ABCDEFG";
//
//	    String str2 = str.substring(2,5);
//	    System.out.println(str2);
//	  
		System.out.println("매개변수의 개수 : " + args.length);
		
		for (int i = 0; i < args.length; i++) {
			System.out.println("args[" + i + "] = \"" + args[i] + "\"");
		}
	}

}
