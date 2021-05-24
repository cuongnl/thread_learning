package _3_vong_doi_thread;

public class MainDemo {
	public static void main(String[] args) {

		// create new thread
		MyThread myThread1 = new MyThread("1");
		MyThread myThread2 = new MyThread("2");

		// state new thread
		System.out.println(myThread1.getState() + " Thread 1");
		System.out.println(myThread2.getState() + " Thread 2");

		// run thread
		myThread1.start();
		try {
			Thread.sleep(100);
			//state TIMED_WAITING
			System.out.println(myThread1.getState() + " Thread 1");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		myThread2.start();
		System.out.println(myThread1.getState() + " Thread 1");
		System.out.println(myThread2.getState() + " Thread 2");
	}
}
