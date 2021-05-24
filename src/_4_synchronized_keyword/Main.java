package _4_synchronized_keyword;

public class Main {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();

		// Ngư�?i chồng rút 15 triệu
		WithdrawThread husbandThread = new WithdrawThread("Husband", bankAccount, 15000000);
		husbandThread.start();

		// Ngư�?i vợ rút hết ti�?n (20 triệu)
		WithdrawThread wifeThread = new WithdrawThread("Wife", bankAccount, 20000000);
		wifeThread.start();
	}
}
