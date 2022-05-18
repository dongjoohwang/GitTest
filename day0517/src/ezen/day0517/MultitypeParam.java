package ezen.day0517;


/*
 * E : Element
 * K : key
 * N : number
 * T : type
 * V : value
 */

class DBox<L,R> {
	private L left;
	private R right;
	
	public void set(L l, R r) {
		left = l;
		right = r;
	}
	
	@Override
	public String toString() {
		
		return left + "&" + right;
	}
}

//class DBox<String, Integer> {
//	private String left;
//	private Integer right;
//	
//	public void set(String l, Integer r) {
//		left = l;
//		right = r;
//	}
//	
//	@Override
//	public String toString() {
//		
//		return left + "&" + right;
//	}
//}

public class MultitypeParam {

	public static void main(String[] args) {
		
		DBox<String, Integer> box = new DBox<String, Integer>();
		
		box.set("Apple", 20);		// new Integer(20)
		System.out.println(box);
		box.set("Apple2", new Integer(50));
		System.out.println(box);
		
//		box.set(20, "Apple");  	=> 타입 불일치
//		=>The method set(String, Integer) in the type DBox<String,Integer> is not applicable for the arguments (int, String)
	}

}












