

public class CurrentAccount extends Account{

    int overdraftLimit;
    boolean OverDraft;

    public CurrentAccount(int a, int overdraftLimit) {
        super(a);
        this.overdraftLimit = overdraftLimit;
    }

    public void OverDraft(){

        //assuming overdraft limit as 30,000
        if(getBalance() > 30000)
        {
            OverDraft = true;
            System.out.println("Letter has been sent. ");
        }
    }
}

