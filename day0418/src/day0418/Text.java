package day0418;

public class Text {

	public static void main(String[] args) {
		
		int mul = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {		// 0
				mul = i*j;
				System.out.printf("%d ", mul);
			}
			System.out.println();
		}

	}

}
