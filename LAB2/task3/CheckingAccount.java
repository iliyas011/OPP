package LAB2.task3;

public class CheckingAccount extends Account {
    private int transactionCount;
    private static final int FREE_TRANSACTIONS = 3;

    public CheckingAccount(int a) {
        super(a);
        this.transactionCount = 0;
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        transactionCount++;
        deductFee();
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        transactionCount++;
        deductFee();
    }

    public void deductFee() {
        if (transactionCount > FREE_TRANSACTIONS) {
            super.withdraw(0.02);
        }
    }
}