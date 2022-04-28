package day0427;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {

	public static void main(String[] args) {
		
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println(date.format(today));
		System.out.println(time.format(today));
		
		Test t = new Test2();
		t.func();	t.func2();
	}

}

abstract class Test {
	int nun=100;
	abstract void func();
	abstract void func2();
}

class Test2 extends Test {
	
	@Override
	void func() {
		System.out.println("sss");
	}
	@Override
	void func2() {
		System.out.println("ddd");
	}
}






















