package _1_khai_niem_co_ban;

public class CountTheNumberThread extends Thread {
	private int count = 0;
	private boolean isStop = false;

	@Override
	public void run() {
		while (!isStop) {
			count++;
			if (count > 0) {
				count = 0;
			}
		}
	}

	public void end() {
		isStop = true;
	}

	public int getCount() {
		return count;
	}
}
