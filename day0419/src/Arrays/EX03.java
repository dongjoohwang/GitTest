package Arrays;

public class EX03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {10,20,30,40,50};
//		int sum = 0;
//		
////		for (int i = 0; i < arr.length; i++) {
////			sum += arr[i];
////		}
//		
//		for(int i : arr) {
//			sum+=i;
//		}
//		System.out.println(sum);
		
		int[][] arr = {
				{5,5,5,5,5},
				{10,10,10,10,10},
				{20,20,20,20,20,20,20},
				{30,30,30,30,30,30,30},
		};
		
//		System.out.println(arr.length);
		int total = 0;
		float ag = 0;
		int cnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				total += arr[i][j];
				cnt++;
			}
			
			ag = total / (float)cnt;
		}
		System.out.println(total);
		System.out.println(ag);
	}

}
