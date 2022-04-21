import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
//		int num = 4000;
//		
//		int h, m, s = 0;
//		
//		s = num%60;
//		m = s/6;
//		h = (num/60)/60;
//		
//		
//		System.out.println(h);
//		System.out.println(m);
//		System.out.println(s);
//		
//		System.out.println(num+"초는 " + h+"시간 " + m+"분 " + s+"초" );
		
		Scanner sc = new Scanner(System.in);
		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		
		
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		int a1 = Integer.parseInt(a);
		int b2 = Integer.parseInt(b);
		
		int to = a1+b2;
		double ag = (double)to/2.0;
		
		System.out.println(to);
		System.out.println(ag);
	}

}
















