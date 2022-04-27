package day0420;

public class Ex06 {

	public static void main(String[] args) {
		
		/*
		 * 	void add(int i, int j) => 함수 정의
		 * 	반환형 함수이름 매개변수
		 * 
		 * 		void는 반환값이 없다.
		 * 	int 정수형 int 리턴
		 * 	double
		 * 
		 * 	add(10,20) ==> 함수 호출
		 * 	함수 이름(인자, 인자)
		 * 
		 * 	1. 인자0, 반환0 
		 * 	2. 인자0, 반환x
		 *  3. 인자x, 반환0
		 *  4. 인자x, 반환x
		 *  
		 *  >> 두 정수를 더하는 기능으로 함수 표현
		 */

		// 1. 인자0, 반환0
//		int num = add(10,20);
//		
//		System.out.println(num);
		
		// 2. 인자0, 반환x
//		add(10, 20);
		
		// 3. 인자x, 반환0
//		int num = add();
//		System.out.println(num);
//		
		// 4. 인자, 반환x
		add();
	}
	
	// 1. 인자0, 반환0
//	static int add(int i, int j) {
//		return i+j;
//	}
	
	// 2. 인자0, 반환x
//	static void add(int i, int j) {
//		System.out.println(i*j);
//		
//	}
	
	// 3. 인자x, 반환0
//	static int add() {
//		return 10+20;
//	}
	
	// 4. 인자, 반환x
	static void add() {
		System.out.println(30);
	}
}















