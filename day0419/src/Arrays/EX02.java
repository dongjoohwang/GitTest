package Arrays;

public class EX02 {

	public static void main(String[] args) {
		
		int[][] score = {
				{100,100,100},
				{20,20,20},
				{30,30,30},
				{40,40,40},
				{50,50,50},
		};
		
		int kort = 0, engt = 0, matht = 0;
		
		System.out.println("번호     국어     영어     수학     총점     평균");
		System.out.println("==========================================");
		
		for (int i = 0; i < score.length; i++) {
			int sum=0;
			double ag=0;
			System.out.print(i + "\t");
			kort += score[i][0];
			engt += score[i][1];
			matht += score[i][2];
			for (int j = 0; j < score[i].length; j++) {
				
				sum += score[i][j];
				
				System.out.print(score[i][j] + "\t");
			}
			ag = sum / (double)score[i].length;
			System.out.print(sum + "\t");
			System.out.println(ag);
		}
		System.out.println("===========================================");
		System.out.println("총점 :   " + kort + "\t" + engt + "\t" + matht + "\t");
	}

}
