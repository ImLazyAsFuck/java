public class Main{
    public static void main(String[] args){

        Bank bank = new Bank(10);

        BankAccount saving = new SavingAccount("SA123", 5000);
        BankAccount checking = new CheckingAccount("CA456", 2000);

        bank.addAccount(saving);
        bank.addAccount(checking);

        saving.withdraw(1000);
        checking.withdraw(3000);
        saving.deposit(2000);
        checking.deposit(500);

        bank.displayBalance();
    }
}