package _3_vong_doi_thread;

public class MyRunable extends Thread {
	@Override
	public void run() {
		System.out.println("MyRunable thread start");
		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("MyRunable thread end");
	}
}
