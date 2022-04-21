package day0412;

public class Ex04 {

	public static void main(String[] args) {
		
		int a= 5;
		int b = 0;
		
		int num = max(a, b);	
	}
	
	public static int max(int a, int b) {
		
//		if (a>b) {
//			return a;
//		} else {
//			return b;
//		}
		
		if (b==0) {
			System.out.println("0을 제외하고 입력~");
			return 0;
		}
		
		return a>b? a : b;
	}

}
