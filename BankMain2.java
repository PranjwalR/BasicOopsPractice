// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class BankMain2 {
    
     private String acno;
        private double balance;
        
        public BankMain2 (String acno, double amount){
            this.acno = acno;
            setBalance(amount);
        }
        public void setBalance(double balance){
            if(balance >= 0){
                
                this.balance = balance;
                 System.out.println("balance has been updated");
                 
            }else{
                
                System.out.println("balance should not be negative");
            }
        }
        
        public double getBalance(){
            return balance;
        }
        
        public void deposite(double amount){
             if(amount >= 0){
                balance += amount;
                System.out.println("amount should not be negative");
            }else{
                System.out.println("amount should not be negative");
            }
        }
        
        public void withdraw(double amount){
            if(amount <= balance){
                balance -= amount;
            }else{
                System.out.println("you dont have enough balance");
            }
        }
        
    public static void main(String[] args) {
       BankMain2 m1 = new BankMain2("101",500000);
       m1.setBalance(5000000000.0);
       System.out.println(m1.getBalance());
       m1.withdraw(20000000);
       System.out.println(m1.getBalance());
        m1.withdraw(600000000000.0);
       System.out.println(m1.getBalance());
       
    }
}