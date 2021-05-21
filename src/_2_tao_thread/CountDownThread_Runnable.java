package _2_tao_thread;

public class CountDownThread_Runnable implements Runnable{

	private String name;

	public CountDownThread_Runnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("start thread " + name);
		for (int i = 10; i > 0; i--) {
			System.out.println(" thread " + name + i + " giay");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("het gio thread " + name);
	}

}
