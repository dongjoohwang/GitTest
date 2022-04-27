package String;

public class EX05 {

	public static void main(String[] args) {
		String src = "ABCDE";
		
		for (int i = 0; i < src.length(); i++) {
			char ch = src.charAt(i);
			System.out.println("src.charAt("+i+"): " + ch);
		}
		char[] charr = src.toCharArray();

		System.out.println(charr);
	}

}
