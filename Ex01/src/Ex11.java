
public class Ex11 {

	public static void main(String[] args) {
		
//		System.out.println(8 << 2);	// 1000 <--- 2bit �̵� / 100000  32
//		System.out.println(8 >> 2);	// 1000 --> 2bit shift 0010!    2
//		
//		int num = 10;
//		int num2 = 5;
//		
//	//	int num3 = num > num2 ? num : "abc";
//		
//		System.out.println(num > num2 ? num : "abc");
		
		int i = 10;
//		i ^= 3;
//		
//		System.out.println(i);  		// 9
		/*
		 *   1010
		 *   0011
		 *   ----
		 *   1001   => ���� �ٸ��� 1, ������ 0(XOR ����)
		 */
		
		i <<= 3;		// i += 3;		// 1010000
		System.out.println(i);		// 80
		
	}

}
