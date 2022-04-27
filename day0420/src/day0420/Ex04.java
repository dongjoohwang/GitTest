package day0420;
import java.util.Arrays;

public class Ex04 {

	public static void main(String[] args) {
		
		int[] num = {9,6,7,3,5};
		int cnt = 0;

		
		for (int i = 0; i < num.length-1; i++) {
			int id = i;  // id=0
			for (int j = i; j < num.length; j++) { // num[0]을 비교할 필요가 없기 때문에 i+1을
													// 시작값으로 설정한다.
				if (num[id]>num[j])		// j는 num[1]에서 num[4]까지 돈다.
										// 즉, num[id]는 num[1],[2],[3],[4]까지의 값과 모두 비교하는 것이다.
					
										// ex)num[id(=0)]의 값이 num[1]보다 크면 num[id]는 num[1]로 바뀐다.
										// 마찬가지로, num[id]가 num[1]로 바뀌었을때, num[2]와 비교해서 
										// num[2]의 값이 더 작으면 num[id]값은 num[2]값으로 바뀐다.
										// 이 과정에서 num[4]까지의 값을 비교하여, 가장 작은 인덱스의 값이
										// num[id]에 저장된다. 
					id=j;				// => num[id] = num[j]
				
				}
				
					int tmp = num[id];
					num[id] = num[i];
					num[i] = tmp;
				
				
			
			System.out.println(i+1+"회전 : " + Arrays.toString(num));

		}
		
	}

}







