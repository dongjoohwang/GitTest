package ezen06.day0518;

public class ThreadEx01 {

	public static void main(String[] args) {
		
		ThreadEx01_1 t1 = new ThreadEx01_1();
		
		Runnable r = () -> {
			for (int i = 0; i < 5; i++) {
				System.out.println(Thread.currentThread().getName());
			}
		};
		
		Thread t2 = new Thread(r);
		t1.start();
		t2.start();
	}

}

class ThreadEx01_1 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(getName());
		}
	}
}

class ThreadEx01_2 implements Runnable {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}







