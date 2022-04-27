import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		System.out.print("점수 : ");
		
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		int num = Integer.parseInt(tmp);
		
		switch (num) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
			break;
		default:
			System.out.println("그 외");
		}
	}

}
