package day0413;

public class Ex02 {

	public static void main(String[] args) {

		int[] scores = {89, 100, 99, 91, 92};
		System.out.println("ù��° ��:" + scores[0]); // index(����)
		System.out.println("�ι�° ��:" + scores[1]);
		System.out.println("����° ��:" + scores[2]);
		System.out.println("�׹�° ��:" + scores[3]);
		System.out.println("�ټ���° ��:" + scores[4]);
		
		System.out.println("==================");
		
		// �迭�� �ʱ�ȭ(2)
		int[] numbers = new int[3];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		
		System.out.println("==================");
		
		// �迭�� �� ����
		numbers[0] = 1000;
		System.out.println(numbers[0]);
		System.out.println(numbers); // hash�� 
		
		System.out.println("==================");
		
		// �ݺ����� �̿��� �迭 �� ���
		for (int i = 0; i < 3; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("==================");
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		System.out.println("==================");
		
		// �հ� ���ϱ�
		int sum = 0;
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("�հ�� " + sum);

	}

}
