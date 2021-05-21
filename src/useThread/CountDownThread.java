package useThread;

public class CountDownThread extends Thread {
	
	@Override
	public void run() {
		
		int count = 10;
		for (int i = count; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("het gio");
	}
}
