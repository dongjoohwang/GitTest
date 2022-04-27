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
		
		// 배열 abc와  num을 붙여서 하나의 배열(rs)로 만든다.
		char[] rs = new char[abc.length+num.length];
		System.arraycopy(abc, 0, rs, 0, abc.length);
							      // index 위치 // 갯수
		
		System.out.println(rs);		// ABCD	(0+4)
		
		System.arraycopy(num, 0, rs, abc.length, num.length);
		System.out.println(rs);		// ABCD0123456789	(4+10)
		
		// 배열 abc를 배열 num의 첫번째 위치부터 배열 abc의 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);	// ABCD456789	(0+10)
		
		// num의 인덱스 6 위치에 3개 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);	// ABCD45ABC9
	}

}











