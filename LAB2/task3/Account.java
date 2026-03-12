package LAB2.task3;



public class Account {
    private  double balance;
    private  int AccNumber ;
    public Account(int a){
        balance = 0.0 ;
        AccNumber = a;
    }

    public void withdraw(double sum){
        if(balance != 0 && balance >= sum){
            balance -= sum;
        }
        else {
            System.out.println("Err");
        }
    }
    public void deposit(double sum){
        if(sum > 0 ){
            balance += sum ;
        }
        else {
            System.out.println("Err");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccNumber() {
        return AccNumber;
    }

    public void transfer(double amount, Account other) {
        if (amount <= balance) {
            this.withdraw(amount);
            other.deposit(amount);
        }


    }

    @Override
    public  String toString(){
        return "Account #" + AccNumber + " | Balance: $" + balance;
    }
}
