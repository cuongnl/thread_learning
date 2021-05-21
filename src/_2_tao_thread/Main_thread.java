package _2_tao_thread;

public class Main_thread {
	public static void main(String[] args) {
		CountDownThread_Thread thread1 = new CountDownThread_Thread(" 1 : ");
		CountDownThread_Thread thread2 = new CountDownThread_Thread(" 2 : ");
		CountDownThread_Runnable thread3 = new CountDownThread_Runnable(" 3 : ");
		CountDownThread_Runnable thread4 = new CountDownThread_Runnable(" 4 : ");
		
		thread1.start();
		thread2.start();
		
		Thread thread = new Thread(thread3);
		thread.run();
		
		Thread threadRun = new Thread(thread4);
		threadRun.start();
	}
}
