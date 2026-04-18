public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Thread threadA= new Thread(()-> {
            for (int i =0; i< 1000; i++){
                account.deposit(100);
            }
        });
        Thread threadB = new Thread (()->{
            for (int i =0; i<1000; i++){
                account.withDraw(100);
            }
        });
        threadA.start();
        threadB.start();
        try {
            threadA.join();
            threadB.join();
        } catch (InterruptedException e){
            System.out.println("bi gian doan: "+ e.getMessage());
        }
        System.out.println("Final balance: "+ account.getBalance());

    }
}