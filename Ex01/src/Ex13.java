
public class Ex13 {

	public static void main(String[] args) {
		
		
		System.out.print("1 : ");
		int x = 11;
		System.out.println(10<x && x<20);
		
		System.out.print("2 : ");
		char ch = '\t';
		System.out.println(ch!=' ' && ch!='\t');
		
		System.out.print("3 : ");
		char c2 = 'x';
		System.out.println((c2=='x' || c2=='X'));
		
		System.out.print("4 : ");
		char c3 = '5';
		System.out.println(c3>='0' && c3<='9');
		
		System.out.print("5 : ");
		char c4='a';
		System.out.println((c4>='A' && c4<='Z') || c4>='a' && c4<='z');
		
		System.out.print("6 : ");
		int year = 8;
		System.out.println((year%400==0) || (year%4==0 && year%100!=0));
		
		System.out.print("7 : ");
		boolean pw = true;
		System.out.println(pw==false);
		
		System.out.print("8 : ");
		String str = "Yes";
		System.out.println(str.equals("yes"));		// 대소문자 인식
	}

}









