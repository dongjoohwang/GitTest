package day0419;

public class Ex06 {

	public static void main(String[] args) {
		
		/*
		 * 배열 + 랜덤 사용(1~10) => 10개 출력
		 * 크기 순으로 재정렬(단, 결과값만이 아닌 과정값도 출력) 
		 * 
		 * 1344213843
		 * 1342134438
		 * 1321344348
		 * 1213343448
		 * 1123344448
		 */

		int[] num = new int[10];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*10)+1;
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		int temp = 0;
		
		for (int i = 0; i < num.length; i++) {
			boolean ch = false;
			for (int j = 0; j < num.length-1; j++) {
				if (num[j] > num[j+1]) {
					temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
					ch = true;
				}
			}
			if (!ch) break;		// 중첩 for문을 돌면서 ch 값이 모두 false가 나올 경우 반복문을 빠져나온다.
								// (=자리 바꿈이 더 이상 발생하지 않을 경우 반복문을 빠져나와서 최종값을 출력한다.)
			for (int k = 0; k < num.length; k++) {
				System.out.print(num[k] + " ");
			}
			System.out.println();
		}
		
	}

}






















