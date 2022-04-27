package day0412;

public class Ex02 {

//	public static void main(String[] args) {
//		// 입력, 출력 (x)
//		 System.out.println("main");	// (1)
//		 sub();		// 함수 호출
//		 System.out.println("main 2");	// (3)
//	}
//	
//	// 함수가 존재하면 반드시 다른 곳(main)에서 호출을 해야 한다.
//	public static void sub() {
//		System.out.println("서브 함수");	// (2)
//	}
	
	// 입력(o), 출력(x)
//	public static void main(String[] args) {
//		double n1 = 2.1;
//		int n2 = 5;
//		
////		short n = (short)num;
//		
//		System.out.println("main");
//		sub(n1,n2);	// 함수 호출 => 인자값
//		System.out.println("main2");
//	}
//	
//	// 함수가 존재하면 반드시 다른 곳에서 호출을 해야 한다.
//	public static void sub(double x, int y) {	// 매개변수
//		System.out.println("합 : " + (x+y));
//	}
	
	// 입력(x), 출력(o)
//	public static void main(String[] args) {
//		double n1 = 2.1;
//		int n2 = 5;
//		
//		System.out.println("main");	// 1
//		double rs = sub();	// 함수 호출 => 인자값
//		System.out.println("결과값 : " + rs);	// 3
//	}
//	
//	// 함수가 존재하면 반드시 다른 곳에서 호출을 해야 한다.
//	// void 자리에는 반환점이 온다. => void는 반환값이 없다는 것을 명시
//	// sub는 함수 이름 => 번수 이름 중에서 명명한다.
//	public static double sub() {	// 매개변수
//		
////		int num = 10000;
//		double num = 12.5;
//		
//		System.out.println("sub");	// 2
//		return num;
//				
//	}
	
	// 입력(o), 출력(o)
	public static void main(String[] args) {
		
		int n = 5;
		int n2 = 10;
		System.out.println("main");
		
		int rs = sub(n,n2);
		System.out.println("결과값 : " + rs);
	}
	
	public static int sub(int n, int n2) {
		System.out.println("sub");
		
		int cal = n*n2;
		return cal;
	}
	
}


















