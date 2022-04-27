
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
		 * 1. byte(1) / int(4byte) => 자동 형변환 불가능(byte 크기가 다름)
		 * 
		 * 2. char 0~65545
		 * byte - 128 ~ -1 ~ 127  => 범위 초과
		 * 
		 * 3. -32000 < short < 32000
		 * char  => 65000
		 * 11111101 11101000 => char
		 * 
		 * 4.생략 가능(타입 일치)
		 * 
		 * 5. char형은 문자를 저장하고, 해당하는 문자의 아스키코드
		 * 값이 정수형으로 저장되어 있으므로 형변환 생략 가능				/ 2.
		 */
		
//		byte b = 256;		=> X
//		char c = '';		=> X
//		char answer = 'no'; => X
//		float f = 3.14;     => X
//		double d = 1.4e3f;  => O						/ 3.
		
//		int num = 0;
//		System.out.println((num > 0) ? "양수" : (num == 0) ? "0" : "음수");
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
//		char lower = ((ch>='A' && ch<='Z') ? (char)(ch+32) :ch);   => +32 -> int로 인식하기 때문에 char로 형변환 필요
//		
//		System.out.println(ch);
//		System.out.println(lower);			/ 11.
	}

}









