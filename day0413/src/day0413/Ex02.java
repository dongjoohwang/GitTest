package day0413;

public class Ex02 {

	public static void main(String[] args) {

		int[] scores = {89, 100, 99, 91, 92};
		System.out.println("첫번째 값:" + scores[0]); // index(색인)
		System.out.println("두번째 값:" + scores[1]);
		System.out.println("세번째 값:" + scores[2]);
		System.out.println("네번째 값:" + scores[3]);
		System.out.println("다섯번째 값:" + scores[4]);
		
		System.out.println("==================");
		
		// 배열의 초기화(2)
		int[] numbers = new int[3];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		System.out.println("==================");
		
		// 배열의 값 변경
		numbers[0] = 1000;
		System.out.println(numbers[0]);
		System.out.println(numbers); // hash값 
		
		System.out.println("==================");
		
		// 반복문을 이용한 배열 값 출력
		for (int i = 0; i < 3; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("==================");
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		System.out.println("==================");
		
		// 합계 구하기
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("합계는 " + sum);

	}

}
