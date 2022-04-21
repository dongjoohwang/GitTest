package day0420;
import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		
//		int sum=0;
//		double ag = 0.0;
//		for (int i = 1; i <= 100; i++) {
//			sum+=i;
//		}
//		ag = (double)sum/100;
//		System.out.println(sum);
//		System.out.println(ag);
//		System.out.println("==================");
//		
//		sum=0;
//		int count=0;
//		
//		for (int i = 1; i <= 100; i++) {
//			if (i%2==0 && i%7==0) {
//				count++;
//			}
//		}
//		
//		int[] num = new int[count];
//		int j=0;
//		for (int i = 1; i <=100 ; i++) {
//			if (i%2==0 && i%7==0) {
//				sum+=i;
//				num[j++] = i;
//			}
//		}
//		System.out.println(sum);
//		System.out.println(Arrays.toString(num));
		
		int[] arr = {30,20,50,40,10};
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if (arr[j] > arr[j+1] ) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}












