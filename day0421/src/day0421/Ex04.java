package day0421;

public class Ex04 {

	
	public static void main(String[] args) {
		
		int[] a1 = {10,20,3,40,50};
		int[] a2 = {10,20,3,40,5};

		boolean is = equal(a1, a2);
		
		for (int i : a1) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for (int i : a2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println(is);
	}
	
	static boolean equal(int[] n1, int[] n2) {
		
		if (n1.length != n2.length) {
			return false;
		}
		for (int i = 0; i < n1.length; i++) {
			if (n1[i]!=n2[i]) {
				return false;
			} 
		}
		return true;
	}

}
