public class BankAccount {
    private int balance = 10000;
    public synchronized void deposit(int amount){
        balance+=amount;
    }
    public  synchronized void withDraw(int amount){
        balance-=amount;
    }

    public int getBalance() {
        return balance;
    }
}

ffeiofun0fj0[u 3]rủ9]ù 03iefviemow2ji ìm\ựi[deuc0o]df 
