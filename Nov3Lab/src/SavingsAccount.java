public class SavingsAccount extends Account{

    public double interest;

    public SavingsAccount(int a, int i) {
        super(a);
        interest = i;
    }

    public void addInterest() {
        if (getBalance() != 0)
            deposit(Math.abs(interest*getBalance()));
    }
}
