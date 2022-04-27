package day0413;

import java.util.Arrays;

public class Ex08 {

	public static void main(String[] args) {
		
		int[] abc = {10,20,30,40,50};
		int[] abc2 = {1,2,3,4,5,6,7,8,9};
		
//		System.out.println(abc);
//		System.out.println(abc2);
//		
//		int[] num = new int[abc.length+abc2.length];
//		System.arraycopy(abc, 0, num, 6, abc.length);
//		System.out.println(Arrays.toString(num));
//		
//		System.arraycopy(abc2, 0, num, 3, abc2.length);
//		System.out.println(Arrays.toString(num));
//		
//		System.arraycopy(abc2, 0, num, abc.length, num.length);
//		System.out.println(Arrays.toString(num));	//java.lang.ArrayIndexOutOfBoundsException
		
		System.out.println(Arrays.toString(abc));
		System.out.println(Arrays.toString(abc2));
		
		System.arraycopy(abc, 2, abc2, 2, 3);
		// 두번째 인덱스에서부터의 abc 배열 값을 abc2 배열의 두번째 인덱스에서부터 3개를 복사해서 넣는다.
		System.out.println(Arrays.toString(abc2));	// [1, 2, 30, 40, 50, 6, 7, 8, 9]
	}
}












