package Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] score = {
						{100,100,100},
						{20,20,20},
						{40,40,40},
						{50,50,50},
				};
			for (int i = 0; i < score.length; i++) {
				for (int j = 0; j < score[i].length; j++) {
					System.out.print(score[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("=============");
			
			int sum=0;
			
			for (int[] tmp : score) {	// score에서 차례대로 객체를 꺼내서 int[] tmp에 넣음
				int j=0;
				for (int i : tmp) {		// tmp에서 ~ int i에 넣음
					sum+=i;
					System.out.print(tmp[j] + " ");
				}
				System.out.println();
			}
			
//			for (int i = 0; i < score.length; i++) {
//				for (int j = 0; j < score[i].length; j++) {
//					sum += score[i][j];
//				}
//			}
			System.out.println("=============");
			System.out.println(sum);
		}

}










