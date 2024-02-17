package homeWorks.homeWork21.homeWork21_1;

import homeWorks.homeWork21.homeWork21_1.classes.BankAccount;

public class HomeWork21_1 {
    public static void main(String[] args) {
        BankAccount account=new BankAccount(0);
        account.deposit(100.2);
        account.withdraw(50.1);
        account.printBalance();
    }
}
