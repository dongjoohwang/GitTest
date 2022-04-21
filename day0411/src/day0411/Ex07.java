package day0411;

public class Ex07 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i = 0;
		
//		while (true) {
//			if (sum>100) 
//				break;
//				++i;
//				sum += i;
//		}
		
		for (i = 2; i < 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i*j);
				
				if (i==j) break;
			}
		}
		System.out.println("final------------");
	}

}
