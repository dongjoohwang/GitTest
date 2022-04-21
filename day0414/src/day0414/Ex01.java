package day0414;

public class Ex01 {

	public static void main(String[] args) {
		int sum = 0;
		float ag = 0f;
		
		int[] score = {100,88,100,100,90};
		
		for (int i = 0; i < score.length; i++) {
			sum+=score[i];
		}
		ag = sum/(float)score.length;
		
		System.out.println(sum);
		System.out.println(ag);
	}

}
