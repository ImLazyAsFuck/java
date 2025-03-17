public class Bank{
    private BankAccount[] accounts;
    private int count;

    public Bank(int size) {
        this.accounts = new BankAccount[size];
        this.count = 0;
    }

    public void addAccount(BankAccount account) {
        if (count < accounts.length) {
            accounts[count++] = account;
        } else {
            System.out.println("Bank is full!");
        }
    }

    public void displayBalance() {
        for (int i = 0; i < count; i++) {
            accounts[i].displayBalance();
        }
    }
}
