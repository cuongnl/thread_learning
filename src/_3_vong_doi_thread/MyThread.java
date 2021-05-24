package _3_vong_doi_thread;

public class MyThread extends Thread {

	private String name;

	public MyThread(String nameParam) {
		this.name = nameParam;
	}

	@Override
	public void run() {
		System.out.println("MyThread start : " + this.name);
		DemoSync.commonResource();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		MyRunable myRunable = new MyRunable();
		myRunable.start();
		try {
			myRunable.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("MyThread end : " + this.name);
	}
}
