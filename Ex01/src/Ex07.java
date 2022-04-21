
public class Ex07 {

	public static void main(String[] args) {
		
		String str1 = "abc";
		
		String str11 = "abc";
		
		System.out.println("aaaa : " + str1 == str11);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		String str2 = new String("abc");
		String str3 = new String("abc");
		
		System.out.println("bbbb : " + ( str2 == str3) );
		System.out.println("bbbb2 : " + str2.equals(str3) );
		System.out.println();
	
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc" == "abc");
		System.out.printf("\"abc\"==\"abc\" ? %b%n", str1 == "abc" );
		System.out.printf("\"abc\"==\"abc\" ? %b%n", str2 == "abc");

		System.out.printf("\n\n str2==str3 ? %b%n", str2 == str3);
		System.out.printf("\n\n str2==str3 ? %b%n\n\n", str2.equals(str3));
		
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
	}

}
