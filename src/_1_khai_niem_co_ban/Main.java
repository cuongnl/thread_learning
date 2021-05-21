package _1_khai_niem_co_ban;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Nhấn phím bất kỳ để quay số");
	    scanner.nextLine();
	         
	    CountTheNumberThread countingThread = new CountTheNumberThread();
	    countingThread.start();
	         
	    System.out.println("Nhấn phím bất kỳ để kết thúc quay số");
	    scanner.nextLine();
	         
	    countingThread.end();
	    System.out.println("Con số may mắn: " + countingThread.getCount());
	}
}
