package Arrays;

public class Ex06 {

	public static void main(String[] args) {
		
		/*
		 * 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서
		 * 개수만큼 '*'를 찍어서 그래프를 그리는 프로그램이다.
		 * 알맞은 코드를 넣어서 완성하시오.
		 */
		
		int[] as = {1,4,4,3,1,4,4,2,1,3,2,};
		
		int[] ct = new int[4];
		
		for (int i = 0; i < as.length; i++) {
			ct[as[i]-1]++;
		}
		for (int i = 0; i < ct.length; i++) {
			System.out.print(ct[i]);
			for (int j = 0; j < ct[i]; j++) {
			System.out.print("*");	
			}
			System.out.println();
		}	
		
		
		/*
		 * 3***
		 * 2**
		 * 2**
		 * 4****
		 */
	}
}
