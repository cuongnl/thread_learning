package _2_bai_tap;

public class RandomNumber extends Thread {

	private String name;
	private int number;
	private int count = 1;

	public RandomNumber(String name, int number) {
		this.name = name;
		this.number = number;
	}

	@Override
	public void run() {
		System.out.println("thread " + name + " start ");
		int randomNumber;
		while (true) {
			randomNumber = (int) (Math.random() * 100 + 1);
			System.out.println("thread " + name + " lan " + count + " doan so " + randomNumber);
			count++;
			if (randomNumber == number) {
				break;
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("thread " + name + " dem dung o lan " + count);

	}
}
