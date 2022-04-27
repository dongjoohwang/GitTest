import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		int s = 0;
		char g = ' ', opt = '0';
		
		System.out.print("점수 : ");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		s = Integer.parseInt(tmp);
		
		if (s >= 90) {
			g = 'A';
			if (s >= 98) {
				opt = '+';
			} else if (s < 94) {
				opt = '-';
			}
		}
		else if (s >= 80) {
			g = 'B';
			if (s >= 88) {
				opt = '+';
			} else if (s<84) {
				opt = '-';
			}
		} else {
			g = 'C';
		}
		System.out.printf("학점은 %c%c입니다.%n", g, opt);
	}

}













