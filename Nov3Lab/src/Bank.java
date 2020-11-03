import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



class Bank {
    private final ArrayList<Account> accounts = new ArrayList<>();

    public Bank() {
        accounts.add(new Account(1));
        accounts.add(new SavingsAccount(2, 5));
        accounts.add(new CurrentAccount(3, -1000));
    }

    public void update() {
        Account acc;
        for (int i = 0; i < accounts.size(); i++) {
            acc = accounts.get(i);
            if (acc instanceof SavingsAccount)
                ((SavingsAccount) acc).addInterest();
            else if (acc instanceof CurrentAccount)
                ((CurrentAccount) acc).OverDraft();
        }
    }

    public void openAccount(int a) {
        System.out.println("Select account type");
        System.out.println("1 - Savings, 2 - Current");
        Scanner input = new Scanner(System.in);
        int type = input.nextInt();
        switch (type) {
            case 1:
                System.out.println("Enter interest: ");
                accounts.add(new SavingsAccount(a, input.nextInt()));
                break;
            case 2:
                System.out.println("Enter overdraft limit: ");
                accounts.add(new CurrentAccount(a, input.nextInt()));
                break;
            default:
                System.err.println("Enter valid account type.");
        }
    }

    public void payDividend(double amount) {
        for (Account account : accounts) {
            account.deposit(amount);
        }
    }

    public void closeAccount(int a) {
        accounts.removeIf(acc -> acc.getAccountNumber() == a);
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println(bank);
        bank.payDividend(12);
        bank.closeAccount(1);
        bank.openAccount(12);
        bank.update();
        System.out.println(bank);
        bank.payDividend(10);
        System.out.println(bank);
    }

    public String toString() {
        return "Bank{" +
                "accounts=" + Arrays.toString(accounts.toArray()) +
                '}';
    }
}