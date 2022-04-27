package day0413;

public class Ex07 {

	public static void main(String[] args) {
		
		char[] abc = {'A','B','C','D'};
		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
		System.out.println(abc);	// ABCD
		System.out.println(num);	// 0123456789
			
//		char[] tmp = new char[20];
//		
//		for (int i = 0; i < abc.length; i++) {
//			tmp[i] = abc[i];
//		}
//		System.out.println(tmp);
//		
//		for (int i = abc.length; i < num.length+abc.length; i++) {
//			tmp[i] = num[i-abc.length];
//		}
//		System.out.println(tmp);
		
		// �迭 abc��  num�� �ٿ��� �ϳ��� �迭(rs)�� �����.
		char[] rs = new char[abc.length+num.length];
		System.arraycopy(abc, 0, rs, 0, abc.length);
							      // index ��ġ // ����
		
		System.out.println(rs);		// ABCD	(0+4)
		
		System.arraycopy(num, 0, rs, abc.length, num.length);
		System.out.println(rs);		// ABCD0123456789	(4+10)
		
		// �迭 abc�� �迭 num�� ù��° ��ġ���� �迭 abc�� ���̸�ŭ ����
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);	// ABCD456789	(0+10)
		
		// num�� �ε��� 6 ��ġ�� 3�� ����
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);	// ABCD45ABC9
	}

}











