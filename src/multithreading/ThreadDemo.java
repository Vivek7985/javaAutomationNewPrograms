package multithreading;

class MyThread implements Runnable {

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {

			System.out.println(Thread.currentThread().getName() + " : " + i);

		}

	}

}

public class ThreadDemo {

	public static void main(String[] args) {

		MyThread task = new MyThread();

		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);

		t1.setName("Chrome");
		t2.setName("Edge");

		t1.start();
		t2.start();

	}

}