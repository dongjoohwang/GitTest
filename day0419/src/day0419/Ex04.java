package day0419;

public class Ex04 {

	public static void main(String[] args) {
		
		/*
		 * => 랜덤 함수 6개 출력
		 * 1~45 배열
		 * 43 34 6 27 15 12 
		 */
		
		int[] ball = new int[45];
		
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i+1;
		}
		
		int temp = 0;
		int j = 0;
		
		for (int i = 0; i < 6; i++) {
			j = (int)(Math.random()*45);
			temp = ball[i];
			ball[i] = ball[j];
			ball[j] = temp;
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
//			System.out.printf("ball[%d]=%d%n", i, ball[i]);
		}
		
	}

}















