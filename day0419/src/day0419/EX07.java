package day0419;

public class EX07 {

	public static void main(String[] args) {
		
		/* 출력된 숫자가 배열에 몇 개 들어있는지 구하기
		 * 랜덤 함수
		 * ex) 4446579753
		 * 0 : 0 
		 * 1 : 1
		 * ....
		 * 9 : 1
		 * 
		 */

		int[] num = new int[10];
		int[] num2 = new int[10];	// 자동으로 0~9 저장
		
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*10);
			System.out.print(num[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < num.length; i++) {
			num2[num[i]]++;		// num2[i] 값에 num[i]의 값을 넣고, num[i]의 값(0~9)이 num2[i]에도 들어있을 경우 갯수를 카운팅한다.
		}
		for (int i = 0; i < num2.length; i++) {
			System.out.println(i + " : " + num2[i]+"개");
		}
	}

}
