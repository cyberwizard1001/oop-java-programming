public class One_Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        System.out.println(bank);
        bank.payDividend(5000);
        bank.closeAccount(134);
        bank.openAccount(12000);
        bank.update();
        System.out.println(bank);
        bank.payDividend(545610);
        System.out.println(bank);
    }
}
