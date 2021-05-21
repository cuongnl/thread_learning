package _2_bai_tap;

public class Main_thread {
	public static void main(String[] args) {
		RandomNumber randomNumber1 = new RandomNumber("1", 45);
		RandomNumber randomNumber2 = new RandomNumber("2", 45);
		
		randomNumber1.start();
		randomNumber2.start();
	}
}
