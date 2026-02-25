// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Bank{
    private long accountNo;
    private double balance;
    
    public Bank(long accountNo, double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }
    public void display(){
         System.out.println(accountNo+ " your balance is " + balance );
    }
    public void  deposite(long accountNo, double amount){
        System.out.println(amount + " is deposited in your account " + accountNo + " and your balance is " + balance + amount );
    }
    public void withdraw(long accountNo, double amount){
        System.out.println(amount + " is withdrawn from your account " + accountNo + " and your balance is "+ (balance - amount) );
    }
}
    

class BankMain {
    public static void main(String[] args) {
       Bank b1 = new Bank(101,1500000000.00);
       b1.display();
       b1.deposite(101, 20000000.00);
       b1.withdraw(101, 300000.00);
    }
}