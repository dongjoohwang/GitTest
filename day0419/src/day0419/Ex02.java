package day0419;

public class Ex02 {

	public static void main(String[] args) {
		
		int[] sc = {79,88,91,33,100,55,95};
		
		int max = sc[0];
		int min = sc[0];
		
		for (int i = 0; i < sc.length; i++) {
			if (max<sc[i]) {
				max = sc[i];
			} else if (min>sc[i]) {
				min = sc[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);

	}

}
