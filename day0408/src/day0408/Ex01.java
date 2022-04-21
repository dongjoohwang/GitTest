package day0408;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int sum=0;
//		
//		for (int i = 1; i <= 100; i+=5) {
//			sum+=i;
//			System.out.printf("1부터 %3d까지의 합 : %3d%n", i, sum);
//		}
//		System.out.println("-----------------");
//		sum=0;
//		for (int i = 1; i <= 100; i+=5) {
//			sum += i;
//			System.out.println("1부터 " + i+"까지의 합 : " + sum);
//		}
		
//		int sum = 0;
//		for (int i = 0; i < 20; i++) {
//			if (i%2!=0 && i%3!=0) {
//				sum+=i;
////				System.out.println(i);
//			}
//		}
//		System.out.println(sum);
		
		int sum = 0;
		int i = 0;
		int sign = 1;
		int tmp = 0;
		
		for (i = 1; true; i++, sign = -sign) {
				tmp+=i*sign;
				System.out.println(tmp);
				sum+=tmp;
				
				if(sum>=100) 
					break;
			}
			System.out.println("i : " + i + " tmp " + tmp + " sum : " + sum);
		}
	

}








