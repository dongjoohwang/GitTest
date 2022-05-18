package ezen05.day0518;

public class CurrentThread {

	public static void main(String[] args) {
		Thread ct = Thread.currentThread();
		String name = ct.getName();
		
		System.out.println(name);
	}

}
