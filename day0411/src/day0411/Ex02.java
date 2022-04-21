package day0411;

public class Ex02 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		
		while ((sum += ++i) < 100) {
			System.out.println(i + " , " + sum);
		}
		
	}

}
