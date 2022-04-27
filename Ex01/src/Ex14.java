import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		int user, com, rs;
		
		Scanner sc = new Scanner(System.in);
		
		String tmp = sc.nextLine();
		user = Integer.parseInt(tmp);
		
		com = (int) (Math.random() * 3) + 1;
		
		System.out.println("user : " + user);
		System.out.println("com : " + com);
		
		rs = user-com;
		
		if (rs==2 || rs==-1) {
			System.out.println("lose");
		} else if (rs==1 || rs==-2) {
			System.out.println("win");
		} else if (rs==0) {
			System.out.println("draw");
		} else {
			System.out.println("1~3을 입력해주세요.");
		}
	}

}
