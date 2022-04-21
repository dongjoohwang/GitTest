
public class Ex09 {

	public static void main(String[] args) {
		
		int x = 0xAB, y = 0xF;
		
		System.out.println(x);
		System.out.printf("%s\n", Integer.toBinaryString(x));
		
		System.out.printf(" x = %#x \t\t%s%n", x, tobinarydstring(x));
		System.out.printf(" x = %#x \t\t%s%n", x, tobinarydstring(x));
		System.out.printf(" y = %#x \t\t%s%n", x, tobinarydstring(y));
		System.out.printf("%#X | %#X = %#X \t%s%n", x, y, x | y, tobinarydstring(x | y));
		System.out.printf("%#X & %#X = %#X \t%s%n", x, y, x & y, tobinarydstring(x | y));
		System.out.printf("%#X ^ %#X = %#X \t%s%n", x, y, x ^ y, tobinarydstring(x | y));
		System.out.printf("%#X ^ %#X ^ %#X = %#X \t%s%n", x, y, y, x ^ y ^ y, 
				tobinarydstring(x | y));
	}

	static String tobinarydstring(int x) {
		String zero = "00000000000000000000000000000000";
		String tmp = zero + Integer.toBinaryString(x);
//		System.out.println(tmp);
//		System.out.println(Integer.toBinaryString(x));
//		System.out.println(tmp.length());
		return tmp.substring(tmp.length()-32);
	}

}
