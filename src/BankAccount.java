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

