package _4_synchronized_keyword;

public class BankAccount {
	long amount = 20000000; // Số ti�?n có trong tài khoản 
    
    public boolean checkAccountBalance(long withDrawAmount) {
        // Giả lập th�?i gian đ�?c cơ sở dữ liệu và kiểm tra ti�?n
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         
        if (withDrawAmount <= amount) {
            // Cho phép rút ti�?n
            return true;
        }
         
        // Không cho phép rút ti�?n
        return false;
    }
     
    public void withdraw(String threadName, long withdrawAmount) {
        // In thông tin ngư�?i rút
        System.out.println(threadName + " withdraw: " + withdrawAmount);
         
        if (checkAccountBalance(withdrawAmount)) {
            // Giả lập th�?i gian rút ti�?n và 
            // cập nhật số ti�?n còn lại vào cơ sở dữ liệu
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
             
            amount -= withdrawAmount;
        }
         
        // In ra số dư tài khoản
        System.out.println(threadName + " see balance: " + amount);
    }
}
