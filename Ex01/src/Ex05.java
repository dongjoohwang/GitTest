import java.util.Iterator;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

//		int k, sum = 0;
//		for (k = 1; k <= 5; k++) {
//			sum+=1;
//			
//			System.out.println("sum = " + sum);
//		}
		
		char c = 'a';
		for (int i = 0; i < 26; i++) {
			System.out.print(c++);
		}
		System.out.println();
		
		c = 'A';
		for (int i = 0; i < 26; i++) {
			System.out.print(c++);
		}
		System.out.println();
		
		c = '0';
		for (int i = 0; i < 10; i++) {
			System.out.print(c++);
		}
		System.out.println();
	}

}
