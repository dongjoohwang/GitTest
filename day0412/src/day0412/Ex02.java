package day0412;

public class Ex02 {

//	public static void main(String[] args) {
//		// �Է�, ��� (x)
//		 System.out.println("main");	// (1)
//		 sub();		// �Լ� ȣ��
//		 System.out.println("main 2");	// (3)
//	}
//	
//	// �Լ��� �����ϸ� �ݵ�� �ٸ� ��(main)���� ȣ���� �ؾ� �Ѵ�.
//	public static void sub() {
//		System.out.println("���� �Լ�");	// (2)
//	}
	
	// �Է�(o), ���(x)
//	public static void main(String[] args) {
//		double n1 = 2.1;
//		int n2 = 5;
//		
////		short n = (short)num;
//		
//		System.out.println("main");
//		sub(n1,n2);	// �Լ� ȣ�� => ���ڰ�
//		System.out.println("main2");
//	}
//	
//	// �Լ��� �����ϸ� �ݵ�� �ٸ� ������ ȣ���� �ؾ� �Ѵ�.
//	public static void sub(double x, int y) {	// �Ű�����
//		System.out.println("�� : " + (x+y));
//	}
	
	// �Է�(x), ���(o)
//	public static void main(String[] args) {
//		double n1 = 2.1;
//		int n2 = 5;
//		
//		System.out.println("main");	// 1
//		double rs = sub();	// �Լ� ȣ�� => ���ڰ�
//		System.out.println("����� : " + rs);	// 3
//	}
//	
//	// �Լ��� �����ϸ� �ݵ�� �ٸ� ������ ȣ���� �ؾ� �Ѵ�.
//	// void �ڸ����� ��ȯ���� �´�. => void�� ��ȯ���� ���ٴ� ���� ���
//	// sub�� �Լ� �̸� => ���� �̸� �߿��� ����Ѵ�.
//	public static double sub() {	// �Ű�����
//		
////		int num = 10000;
//		double num = 12.5;
//		
//		System.out.println("sub");	// 2
//		return num;
//				
//	}
	
	// �Է�(o), ���(o)
	public static void main(String[] args) {
		
		int n = 5;
		int n2 = 10;
		System.out.println("main");
		
		int rs = sub(n,n2);
		System.out.println("����� : " + rs);
	}
	
	public static int sub(int n, int n2) {
		System.out.println("sub");
		
		int cal = n*n2;
		return cal;
	}
	
}


















