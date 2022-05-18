package ezen06.day0518;

class Counter {
	int count=0;
	
		public void increment() {
		
		synchronized(this) {	// 동기화 블럭
			count++;
		}
		System.out.println("1111");
		System.out.println("1111");
		System.out.println("1111");
		for (int i = 0; i < 1000000; i++) ;
	}
	
	synchronized public void decrement() {
		count--;
	}
	
	public int getCount() {
		return count;
	}
}

public class MutualAccess {

	public static Counter cnt = new Counter();
	
	public static void main(String[] args) throws Exception {
		
		Runnable task1 = () -> {		// runnable 구현 인스턴스 생성
			for (int i = 0; i < 1000; i++) {
				cnt.increment();
				
			}
		};
		
		Runnable task2 = () -> {
			for (int i = 0; i < 1000; i++) {
				cnt.decrement();
				
			}
		};
		
		Thread t1 = new Thread(task1);		// thread 인스턴스 생성
		Thread t2 = new Thread(task2);		// thread 인스턴스 생성
		
		t1.start();
		t2.start();
		t1.join();		// t1이 참조하는 쓰레드 종료까지 대기
		t2.join();		// t2가 참조하는 쓰레드 종료까지 대기
		
		System.out.println(cnt.getCount());
	}

}














