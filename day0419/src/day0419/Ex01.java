package day0419;

public class Ex01 {

	public static void main(String[] args) {
		
		int sum = 0;
		float ag = 0f;
		
		int[] sc = {100,88,100,100,90};
				
		for (int i = 0; i < sc.length; i++) {
			sum += sc[i];
		}
		ag = sum / (float)sc.length;
		
		System.out.println(sum);
		System.out.println(ag);
	}

}
