package LAB2.task3;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int a, double rate) {
        super(a);
        this.interestRate = rate;
    }

    public void addInterest() {
        double interest = getBalance() * (interestRate / 100);
        deposit(interest);
    }
}