
public class Ex12 {

	public static void main(String[] args) {

//		System.out.println("1" + "2");
//		System.out.println(true + "");
//		System.out.println('A' + 'B');
//		System.out.println('1'+2);
//		System.out.println('1' + '2');
//		System.out.println('j' + "ava");
//		System.out.println(true+null);		/ 1.

//		byte b = 10;
//		char ch = 'A';
//		int i = 100;
//		long l = 1000L;
//		
//	//1 	b = i;
//	//2 	ch = b;
//	//3 	short s = ch;
//		float f = l;
//		i = ch;					
		
		/*
		 * 1. byte(1) / int(4byte) => �ڵ� ����ȯ �Ұ���(byte ũ�Ⱑ �ٸ�)
		 * 
		 * 2. char 0~65545
		 * byte - 128 ~ -1 ~ 127  => ���� �ʰ�
		 * 
		 * 3. -32000 < short < 32000
		 * char  => 65000
		 * 11111101 11101000 => char
		 * 
		 * 4.���� ����(Ÿ�� ��ġ)
		 * 
		 * 5. char���� ���ڸ� �����ϰ�, �ش��ϴ� ������ �ƽ�Ű�ڵ�
		 * ���� ���������� ����Ǿ� �����Ƿ� ����ȯ ���� ����				/ 2.
		 */
		
//		byte b = 256;		=> X
//		char c = '';		=> X
//		char answer = 'no'; => X
//		float f = 3.14;     => X
//		double d = 1.4e3f;  => O						/ 3.
		
//		int num = 0;
//		System.out.println((num > 0) ? "���" : (num == 0) ? "0" : "����");
//														/ 4.
		
//		int num = 456;
//		int t = num%100;					/ 5.
//		
//		System.out.println(num-t);			/ 6.
		
//		int num = 798;
//		int one = num%10;
//		System.out.println(num-one+1);		/ 7.
//		
//		int num = 81;
//		int rest = num%10;
//		int t = ((num-rest)+10);
//		System.out.println(t-num);			/ 8.
		
//		int f = 100;
//		float cel = (int)((5/9f * (f-32))*(100)+0.5f)/100f;
//		
//		System.out.println(f);
//		System.out.println(cel);			/ 9.
		
//		char ch = 'z';
////		boolean b = ((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<='9'));
//
//		boolean b = (('0'<=ch && ch<='9') || ('A'<=ch && ch<='Z') || ('a'<=ch && ch<='z'));
//		
//		System.out.println(b);				/ 10.
		
//		char ch = 'F';
//		
//		char lower = ((ch>='A' && ch<='Z') ? (char)(ch+32) :ch);   => +32 -> int�� �ν��ϱ� ������ char�� ����ȯ �ʿ�
//		
//		System.out.println(ch);
//		System.out.println(lower);			/ 11.
	}

}









